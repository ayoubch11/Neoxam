package Entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Risque_Projet
 *
 */
@Entity

public class Risque_Projet implements Serializable {

	
	private int idRisque;
	private int idEquipe;
	private int idproject;
	private int idProject;
	private String date;
	private static final long serialVersionUID = 1L;

	public Risque_Projet() {
		super();
	}   
	public int getIdRisque() {
		return this.idRisque;
	}

	public void setIdRisque(int idRisque) {
		this.idRisque = idRisque;
	}   
	public int getIdEquipe() {
		return this.idEquipe;
	}

	public void setIdEquipe(int idEquipe) {
		this.idEquipe = idEquipe;
	}   
	public int getIdproject() {
		return this.idproject;
	}

	public void setIdproject(int idproject) {
		this.idproject = idproject;
	}   
	public int getIdProject() {
		return this.idProject;
	}

	public void setIdProject(int idProject) {
		this.idProject = idProject;
	}   
	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}
   
}
