package org.sid.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Utilisateurs {
	@Id
	@GeneratedValue
	private int id ;
	private String identifiant;
	private String MotDePasse;
	private String nom ;
	private String prenom ;
	private String direction ;
	private String grade ;
	private String email ;
	private String numerotelephone;
	private int matricule;
	public Utilisateurs() {
		super();
	}
	public Utilisateurs(String identifiant, String motDePasse, String nom, String prenom, String direction,
			String grade, String email, String numerotelephone, int matricule) {
		super();
		this.identifiant = identifiant;
		MotDePasse = motDePasse;
		this.nom = nom;
		this.prenom = prenom;
		this.direction = direction;
		this.grade = grade;
		this.email = email;
		this.numerotelephone = numerotelephone;
		this.matricule = matricule;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}
	public String getMotDePasse() {
		return MotDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		MotDePasse = motDePasse;
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
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumerotelephone() {
		return numerotelephone;
	}
	public void setNumerotelephone(String numerotelephone) {
		this.numerotelephone = numerotelephone;
	}
	public int getMatricule() {
		return matricule;
	}
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
	
}
