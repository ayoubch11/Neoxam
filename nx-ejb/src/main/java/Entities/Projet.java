package Entities;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Projet
 *
 */
@Entity

public class Projet implements Serializable {

	
	private int idProjet;
	private String nomProjet;
	private Date dateDebut;
	private Date dateFinPrevue;
	private Date dateFin;
	private static final long serialVersionUID = 1L;

	public Projet() {
		super();
	}   
	public int getIdProjet() {
		return this.idProjet;
	}

	public void setIdProjet(int idProjet) {
		this.idProjet = idProjet;
	}   
	public String getNomProjet() {
		return this.nomProjet;
	}

	public void setNomProjet(String nomProjet) {
		this.nomProjet = nomProjet;
	}   
	public Date getDateDebut() {
		return this.dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}   
	public Date getDateFinPrevue() {
		return this.dateFinPrevue;
	}

	public void setDateFinPrevue(Date dateFinPrevue) {
		this.dateFinPrevue = dateFinPrevue;
	}   
	public Date getDateFin() {
		return this.dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
   
}
