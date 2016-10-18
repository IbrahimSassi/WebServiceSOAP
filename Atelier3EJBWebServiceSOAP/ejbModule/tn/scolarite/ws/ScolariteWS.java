package tn.scolarite.ws;

import java.util.Date;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * Session Bean implementation class ScolariteWS
 */
@Stateless
@WebService(portName="ScolariteServicePort")
public class ScolariteWS implements ScolariteWSRemote {

    /**
     * Default constructor. 
     */
    public ScolariteWS() {
        // TODO Auto-generated constructor stub
    }

	@Override
	@WebResult(name="numInscription")
	public int inscrire(@WebParam(name="cin")String cin,
			@WebParam(name="nom")String nom,
			@WebParam(name="dateNaissance")String prenom,
			@WebParam(name="dateNaissance")Date dateNaissance,
			@WebParam(name="adresse")String adresse,
			@WebParam(name="numTel")long numTel,
			@WebParam(name="email")String email) {
		return 0;
	}

	@Override
	@WebResult(name="etat")
	public String getEtatInscription(@WebParam(name="numInscription")int numInscription) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Etudiant> getListeEtudiants() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	
	@WebResult(name="fraisInscription")
	public float calculerFraisInscription(int numInscription) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	@WebResult(name="infoEtudiant")
	public Etudiant getInfoEtudiant(int numInscription) {
		// TODO Auto-generated method stub
		return null;
	}

}
