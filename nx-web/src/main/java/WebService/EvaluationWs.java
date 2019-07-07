package WebService;

import javax.ejb.EJB;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import Entities.Evaluation;
import Iservice.IEvaluationService;
import Service.EvaluationService;



@Path("evaluation")

@ManagedBean
@RequestScoped
public class EvaluationWs {
	
	
	
	@EJB
	IEvaluationService es =new EvaluationService();
	
	/*@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello(){
		return "hello from my web service";
	}*/
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
	

}
