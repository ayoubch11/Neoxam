package Entities;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Evaluation
 *
 */
@Entity

public class Evaluation implements Serializable {
@Id
	@GeneratedValue
	@Column(name = "id")
	private int idEmploye;
	private int idEvaluation;
	private String anneEvaluation;
	private int selfNote;
	private String selfEvaluation;
	private int responsableNote;
	private String resEvaluation;
	private EtatEvaluation etatsEvaluation;
	private Date dateSelfEvaluation;
	private Date dateResponsableEvaluation;
	private int evaluationFinal;
	private Date dateEvaluationFina;
	
	public Evaluation(int idEmploye, int idEvaluation, String anneEvaluation, int selfNote, String selfEvaluation,
			int responsableNote, String resEvaluation, EtatEvaluation etatsEvaluation, Date dateSelfEvaluation,
			Date dateResponsableEvaluation, int evaluationFinal, Date dateEvaluationFina) {
		super();
		this.idEmploye = idEmploye;
		this.idEvaluation = idEvaluation;
		this.anneEvaluation = anneEvaluation;
		this.selfNote = selfNote;
		this.selfEvaluation = selfEvaluation;
		this.responsableNote = responsableNote;
		this.resEvaluation = resEvaluation;
		this.etatsEvaluation = etatsEvaluation;
		this.dateSelfEvaluation = dateSelfEvaluation;
		this.dateResponsableEvaluation = dateResponsableEvaluation;
		this.evaluationFinal = evaluationFinal;
		this.dateEvaluationFina = dateEvaluationFina;
	}
	

	public Evaluation(String selfEvaluation) {
		super();
		this.selfEvaluation = selfEvaluation;
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
	public Date getDateSelfEvaluation() {
		return dateSelfEvaluation;
	}
	public void setDateSelfEvaluation(Date dateSelfEvaluation) {
		this.dateSelfEvaluation = dateSelfEvaluation;
	}
	public Date getDateResponsableEvaluation() {
		return dateResponsableEvaluation;
	}
	public void setDateResponsableEvaluation(Date dateResponsableEvaluation) {
		this.dateResponsableEvaluation = dateResponsableEvaluation;
	}
	public int getEvaluationFinal() {
		return evaluationFinal;
	}
	public void setEvaluationFinal(int evaluationFinal) {
		this.evaluationFinal = evaluationFinal;
	}
	public Date getDateEvaluationFina() {
		return dateEvaluationFina;
	}
	public void setDateEvaluationFina(Date dateEvaluationFina) {
		this.dateEvaluationFina = dateEvaluationFina;
	}

	private static final long serialVersionUID = 1L;

	public Evaluation() {
		super();
	}   
	public int getIdEmploye() {
		return this.idEmploye;
	}

	public void setIdEmploye(int idEmploye) {
		this.idEmploye = idEmploye;
	}   
	public int getIdEvaluation() {
		return this.idEvaluation;
	}

	public void setIdEvaluation(int idEvaluation) {
		this.idEvaluation = idEvaluation;
	}   
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
