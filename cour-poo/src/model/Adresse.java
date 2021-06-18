package model;

public class Adresse {
	private String rue;
	private String codePostal; // en raison de 02220, etc, donc code postale en String pas en int
	private String ville;
	
	public Adresse(String rue, String codePostal, String ville) {
			
			this.rue = rue;
			this.codePostal = codePostal;
			this.ville = ville;
		}	
	
	public Adresse() {
		
	}

	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	@Override
	public String toString() {
		return "Adresse [rue=" + rue + ", codePostabl=" + codePostal + ", ville=" + ville + "]";
	}
	


}
