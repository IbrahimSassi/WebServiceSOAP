package tn.scolarite.ws;

import java.util.Date;
import java.util.List;

import javax.ejb.Remote;
import javax.jws.WebService;

@WebService(name = "ScolaritePortype",serviceName="ScolariteService" ,targetNamespace = "http://ws.scolarite.tn")
@Remote
public interface ScolariteWSRemote {

	public int inscrire(String cin,String nom,String prenom,Date dateNaissance,String adresse,long numTel,String email);
	
	public String getEtatInscription(int numInscription);
	
	public List<Etudiant> getListeEtudiants();
	
	public float calculerFraisInscription(int numInscription);
	
	public Etudiant getInfoEtudiant(int numInscription);
	
}
