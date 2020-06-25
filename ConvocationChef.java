package org.sid.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class ConvocationChef implements Serializable{
	@Id
	@GeneratedValue
	private int idc;
	private String theme;
	private String datedebut ;
	private String datefin ;
	private String orgformateur ;
	private String lieux;
	private String heure ;
	private String chefdepartementformation;
	private String dateEnvoi;
	private String destinataire;
	private String nbreparticipant;
	private String typeform ;
	

	public String getTypeform() {
		return typeform;
	}
	public void setTypeform(String typeform) {
		this.typeform = typeform;
	}
	public int getIdc() {
		return idc;
	}

	public void setIdc(int idc) {
		this.idc = idc;
	}



	public String getTheme() {
		return theme;
	}



	public void setTheme(String theme) {
		this.theme = theme;
	}



	public String getDatedebut() {
		return datedebut;
	}



	public void setDatedebut(String datedebut) {
		this.datedebut = datedebut;
	}



	public String getDatefin() {
		return datefin;
	}



	public void setDatefin(String datefin) {
		this.datefin = datefin;
	}



	public String getOrgformateur() {
		return orgformateur;
	}



	public void setOrgformateur(String orgformateur) {
		this.orgformateur = orgformateur;
	}



	public String getLieux() {
		return lieux;
	}



	public void setLieux(String lieux) {
		this.lieux = lieux;
	}



	public String getHeure() {
		return heure;
	}



	public void setHeure(String heure) {
		this.heure = heure;
	}



	public String getChefdepartementformation() {
		return chefdepartementformation;
	}



	public void setChefdepartementformation(String chefdepartementformation) {
		this.chefdepartementformation = chefdepartementformation;
	}



	public String getDateEnvoi() {
		return dateEnvoi;
	}



	public void setDateEnvoi(String dateEnvoi) {
		this.dateEnvoi = dateEnvoi;
	}



	public String getDestinataire() {
		return destinataire;
	}



	public void setDestinataire(String destinataire) {
		this.destinataire = destinataire;
	}



	public String getNbreparticipant() {
		return nbreparticipant;
	}



	public void setNbreparticipant(String nbreparticipant) {
		this.nbreparticipant = nbreparticipant;
	}
	public ConvocationChef(String theme, String datedebut, String datefin, String orgformateur, String lieux,
			String heure, String chefdepartementformation, String dateEnvoi, String destinataire,
			String nbreparticipant, String typeform) {
		super();
		this.theme = theme;
		this.datedebut = datedebut;
		this.datefin = datefin;
		this.orgformateur = orgformateur;
		this.lieux = lieux;
		this.heure = heure;
		this.chefdepartementformation = chefdepartementformation;
		this.dateEnvoi = dateEnvoi;
		this.destinataire = destinataire;
		this.nbreparticipant = nbreparticipant;
		this.typeform = typeform;
	}
	public ConvocationChef() {
		super();
	}
	
	
}
