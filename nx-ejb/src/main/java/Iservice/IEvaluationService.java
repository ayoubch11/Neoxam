package Iservice;



import javax.ejb.Local;

import Entities.Evaluation;
@Local
public interface IEvaluationService  {
	int addEvaluation(Evaluation eval);
//Evaluation getEvaluation(int idEvaluation);
}
