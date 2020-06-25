package org.sid.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "CommandeChef")
public class CommandeChef implements Serializable {
	@Id
	@GeneratedValue
	private int idcom ;
	private String nom ; 
	private String prenom ;
	private String datedebutF ;
	private String datefinF;
	public String dateEnvoi;
	private String theme ;
	private String organismeformateur ;
	private String depenseprevisionnelle ;
	private String chefdepartementformation;
	private String typecmd ;
	
	public String getTypecmd() {
		return typecmd;
	}
	public void setTypecmd(String typecmd) {
		this.typecmd = typecmd;
	}
	public CommandeChef() {
		super();
	}
	
	
	public CommandeChef(String nom, String prenom, String datedebutF, String datefinF, String dateEnvoi, String theme,
			String organismeformateur, String depenseprevisionnelle, String chefdepartementformation, String typecmd) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.datedebutF = datedebutF;
		this.datefinF = datefinF;
		this.dateEnvoi = dateEnvoi;
		this.theme = theme;
		this.organismeformateur = organismeformateur;
		this.depenseprevisionnelle = depenseprevisionnelle;
		this.chefdepartementformation = chefdepartementformation;
		this.typecmd = typecmd;
	}
	public int getIdcom() {
		return idcom;
	}
	public void setIdcom(int idcom) {
		this.idcom = idcom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getDatedebutF() {
		return datedebutF;
	}
	public void setDatedebutF(String datedebutF) {
		this.datedebutF = datedebutF;
	}
	public String getDatefinF() {
		return datefinF;
	}
	public void setDatefinF(String datefinF) {
		this.datefinF = datefinF;
	}
	public String getDateEnvoi() {
		return dateEnvoi;
	}
	public void setDateEnvoi(String dateEnvoi) {
		this.dateEnvoi = dateEnvoi;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public String getOrganismeformateur() {
		return organismeformateur;
	}
	public void setOrganismeformateur(String organismeformateur) {
		this.organismeformateur = organismeformateur;
	}
	public String getDepenseprevisionnelle() {
		return depenseprevisionnelle;
	}
	public void setDepenseprevisionnelle(String depenseprevisionnelle) {
		this.depenseprevisionnelle = depenseprevisionnelle;
	}
	public String getChefdepartementformation() {
		return chefdepartementformation;
	}
	public void setChefdepartementformation(String chefdepartementformation) {
		this.chefdepartementformation = chefdepartementformation;
	}
	
	
}
