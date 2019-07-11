package WebService;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import Entities.Evaluation;
import Iservice.IEvaluationService;
import Service.EvaluationService;



@Path("evaluation")

@ManagedBean
@ApplicationScoped
public class EvaluationWs {
	
	
	
	@EJB
	IEvaluationService es;
	
	
@GET
	
	@Produces({ MediaType.APPLICATION_JSON })
	public Response ShowAll() {
		List<Evaluation> EV=es.getAllEvaluation();
		
		if (EV.isEmpty()==false) {
			return Response.status(Status.OK).entity(es.getAllEvaluation()).build();
		}
		return Response.status(Status.NOT_FOUND).build();

	}
	
	@POST
	@Consumes({ MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML })
	public Response addEvaluation(Evaluation eval){
		es.addEvaluation(eval);
			return Response.status(Status.CREATED).build();
		//return Response.status(Status.NOT_FOUND).build();
	}
	
	
	
	
	
	/*@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getListeDashborad(){
		
		
			return Response.status(Status.OK).entity(es.getEvaluation(1)).build();
		
	}*/
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response UPDATE(Evaluation eval) {
		if (es.update(eval) != null)
			return Response.status(Status.OK).build();
		return Response.status(Status.NOT_FOUND).build();
	}

	@DELETE
	@Path("{idEmploye}")
	public Response delete(@QueryParam(value = "idEmploye") long id) {

		if (es.delete(id)) {
			return Response.status(Status.OK).build();
		}
		return Response.status(Status.NOT_FOUND).build();
	}

}
