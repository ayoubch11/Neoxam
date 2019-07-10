package Service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import javax.persistence.*;


import Entities.Evaluation;
import Iservice.IEvaluationService;

@Stateless
@LocalBean
public class EvaluationService implements IEvaluationService {

	@PersistenceContext(name="nx-ejb")
	EntityManager em;
	// List<Evaluation> listeEvaluation;

	@Override
	public Evaluation getEvalById(String epk) {
		return em.find(Evaluation.class, epk);
	}

	@Override
	public int addEvaluation(Evaluation eval) {
		try {

			em.persist(eval);
		}

		catch (Exception e) {
			System.out.println(e);
		}

		return (int) eval.getIdEmploye();

	}

	
	@Override
	public List<Evaluation> getAllEvaluation() {
		return em.createQuery("from Evaluation").getResultList();
	}

	@Override
	public Evaluation update(Evaluation aval) {
		if(aval != null)
			return	em.merge(aval);
		return null ;
	}

	@Override
	public boolean DeleteEvaluation(String Id) {
		Evaluation OldOne = this.getEvalById(Id);
		if (OldOne != null) {
			em.remove(OldOne);

			return true;
		}

		return false;
	}

	

	/*
	 * @Override public Evaluation getEvaluation(int idEvaluation) {
	 * TypedQuery<Evaluation> query = this.em.
	 * createQuery("Select u from Evaluation u where u.id =:idEvaluation"
	 * ,Evaluation.class); query.setParameter("id", idEvaluation); Evaluation
	 * evaluation = null; try { evaluation = query.getSingleResult(); } catch
	 * (Exception e) { System.out.println("Erreur : " + e); } return evaluation;
	 * }
	 */

	@Override
	public String getTest() {
		return "dao valid";
	}
}