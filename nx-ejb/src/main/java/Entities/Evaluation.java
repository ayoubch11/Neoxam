package Entities;

import java.io.Serializable;
import java.lang.String;


import javax.persistence.*;

/**
 * Entity implementation class for Entity: Evaluation
 *
 */
@Entity

public class Evaluation implements Serializable {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

	private int idEmploye;
	//private int idEvaluation;
	private String anneEvaluation;
	private int selfNote;
	private String selfEvaluation;
	private int responsableNote;
	private String resEvaluation;
	private EtatEvaluation etatsEvaluation;
	private String  dateSelfEvaluation;
	private String  dateResponsableEvaluation;
	private int evaluationFinal;
	private String  dateEvaluationFina;
	
	
	
	
	

	




	public Evaluation() {
		super();
		
	}




	


	public int getSelfNote() {
		return selfNote;
	}
	
	
	public void setSelfNote(int selfNote) {
		this.selfNote = selfNote;
	}
	public String getSelfEvaluation() {
		return selfEvaluation;
	}
	public void setSelfEvaluation(String selfEvaluation) {
		this.selfEvaluation = selfEvaluation;
	}
	public int getResponsableNote() {
		return responsableNote;
	}
	public void setResponsableNote(int responsableNote) {
		this.responsableNote = responsableNote;
	}
	public String getResEvaluation() {
		return resEvaluation;
	}
	public void setResEvaluation(String resEvaluation) {
		this.resEvaluation = resEvaluation;
	}
	public EtatEvaluation getEtatsEvaluation() {
		return etatsEvaluation;
	}
	public void setEtatsEvaluation(EtatEvaluation etatsEvaluation) {
		this.etatsEvaluation = etatsEvaluation;
	}
	public String  getDateSelfEvaluation() {
		return dateSelfEvaluation;
	}
	public void setDateSelfEvaluation(String  dateSelfEvaluation) {
		this.dateSelfEvaluation = dateSelfEvaluation;
	}
	public String  getDateResponsableEvaluation() {
		return dateResponsableEvaluation;
	}
	public void setDateResponsableEvaluation(String  dateResponsableEvaluation) {
		this.dateResponsableEvaluation = dateResponsableEvaluation;
	}
	public int getEvaluationFinal() {
		return evaluationFinal;
	}
	public void setEvaluationFinal(int evaluationFinal) {
		this.evaluationFinal = evaluationFinal;
	}
	public String getDateEvaluationFina() {
		return dateEvaluationFina;
	}
	public void setDateEvaluationFina(String  dateEvaluationFina) {
		this.dateEvaluationFina = dateEvaluationFina;
	}

	private static final long serialVersionUID = 1L;
  
	public int getIdEmploye() {
		return this.idEmploye;
	}
/*
	public void setIdEmploye(int idEmploye) {
		this.idEmploye = idEmploye;
	}   
	public int getIdEvaluation() {
		return this.idEvaluation;
	}

	public void setIdEvaluation(int idEvaluation) {
		this.idEvaluation = idEvaluation;
	}   */
	public String getAnneEvaluation() {
		return this.anneEvaluation;
	}

	public void setAnneEvaluation(String anneEvaluation) {
		this.anneEvaluation = anneEvaluation;
	}   
	public int getSrlfNote() {
		return this.selfNote;
	}

	public void setSrlfNote(int SelfNote) {
		this.selfNote = SelfNote;
	}
   
}
