package Iservice;



import java.util.List;

import javax.ejb.Local;

import Entities.Evaluation;

@Local
public interface IEvaluationService  {
	int addEvaluation(Evaluation eval);
//Evaluation getEvaluation(int idEvaluation);

	Evaluation getEvalById(String  epk);
	List<Evaluation> getAllEvaluation();

	//boolean UpdateEvaluation(String Id, Evaluation R);

	boolean DeleteEvaluation(String Id);
	
	String getTest();

	Evaluation update(Evaluation aval);

}
