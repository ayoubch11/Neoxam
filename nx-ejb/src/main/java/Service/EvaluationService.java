package Service;

import javax.persistence.EntityManager;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.*;

import Entities.Evaluation;
import Iservice.IEvaluationService;



@Stateless
public class EvaluationService implements IEvaluationService  {
	@PersistenceContext
	  EntityManager em;
	List<Evaluation> listeEvaluation;
	
	@Override
	public int addEvaluation(Evaluation eval) {
		try {
	    	 em.persist(eval); 
	     }
	     catch(Exception e) {
	    	 System.out.println("Erreur : " + e);
	     }
		return 5;
	    
	}
	@Override
	public List<Evaluation> getListEval() {
		return listeEvaluation;
	}
		
	}



