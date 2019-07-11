package Entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Risque
 *
 */
@Entity

public class Risque implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idRisque;
	private String fait;
	private String preventif;
	private String consequence;
	private static final long serialVersionUID = 1L;

	public Risque() {
		super();
	}   
	public int getIdRisque() {
		return this.idRisque;
	}

	public void setIdRisque(int idRisque) {
		this.idRisque = idRisque;
	}   
	public String getFait() {
		return this.fait;
	}

	public void setFait(String fait) {
		this.fait = fait;
	}   
	public String getPreventif() {
		return this.preventif;
	}

	public void setPreventif(String preventif) {
		this.preventif = preventif;
	}   
	public String getConsequence() {
		return this.consequence;
	}

	public void setConsequence(String consequence) {
		this.consequence = consequence;
	}
   
}
