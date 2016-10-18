package tn.scolarite.ws;

import java.util.Date;

public class Etudiant {

	private String CIN;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	private String adresse;
	private long numTel;
	private String email;
	public String getCIN() {
		return CIN;
	}
	public void setCIN(String cIN) {
		CIN = cIN;
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
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public long getNumTel() {
		return numTel;
	}
	public void setNumTel(long numTel) {
		this.numTel = numTel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Etudiant(String cIN, String nom, String prenom, Date dateNaissance, String adresse, long numTel,
			String email) {
		super();
		CIN = cIN;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
		this.numTel = numTel;
		this.email = email;
	}
	
	public Etudiant() {
		super();
	}
	
	
	
}
