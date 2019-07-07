package Service;

import javax.persistence.EntityManager;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.*;

import Entities.Evaluation;
import Iservice.IEvaluationService;

@Stateless
public class EvaluationService implements IEvaluationService {
	
	
	EntityManager em;
	List<Evaluation> listeEvaluation;

	@Override
	public int addEvaluation(Evaluation eval) {
	try{
			em.persist(eval);
	}
	catch(Exception e){
		System.out.println("aaaaa"+e);
		
	}
	return (int) eval.getIdEmploye();
			
		
		
		
		

	}

	/*@Override
	public Evaluation getEvaluation(int idEvaluation) {
		TypedQuery<Evaluation> query = this.em.createQuery("Select u from Evaluation u where u.id =:idEvaluation",Evaluation.class);
		query.setParameter("id", idEvaluation);
		Evaluation evaluation = null;
		try {
			evaluation = query.getSingleResult();
		} catch (Exception e) {
			System.out.println("Erreur : " + e);
		}
		return evaluation;
	}*/

	
}
