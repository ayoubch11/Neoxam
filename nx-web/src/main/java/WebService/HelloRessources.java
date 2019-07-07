package  WebService;


import javax.ws.rs.*;

import javax.ws.rs.core.MediaType;

@Path("greetings")
public class HelloRessources {
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello(){
		return "hello from jax-rs";
	}
	
//	@GET
//	@Path("{Nom}/{Prenom}")
//	@Produces(MediaType.TEXT_PLAIN)
//	public String sayHelloTo1(@PathParam(value="Nom")String nom,@PathParam(value="Prenom")String prenom){
//		return "hello from jax-rs Mr :"+nom+" "+prenom;
//	}
	
	
	

}





