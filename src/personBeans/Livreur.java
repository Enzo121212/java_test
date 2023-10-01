package personBeans;

import javax.servlet.http.HttpServletRequest;

public class Livreur {
	private String nom;
	private String prenom;
	private boolean isActif;
	private String Resultat;
	
	public void verifyIdentifiant(HttpServletRequest request){
		String login = request.getParameter("username");
		String pass = request.getParameter("password");
		
		nom = login;
		prenom = pass;
		
		if(login.equals("root") && pass.equals("123")){
			Resultat = "Vous etes bien connecte";
		}else{
			Resultat = "Desole, vous n'etes pas l'acces";
		}
		
	}
	
	public String getResultat() {
		return Resultat;
	}
	public void setResultat(String resultat) {
		Resultat = resultat;
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
	public Boolean getIsActif() {
		return isActif;
	}
	public void setIsActif(Boolean isActif) {
		this.isActif = isActif;
	}
}
