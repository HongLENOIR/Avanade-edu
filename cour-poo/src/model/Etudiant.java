package model;

public class Etudiant extends Personne implements Affichage, Consultation{ 
	// la class Etudiant hérite la class mère personne mais pas d'autres classe, !!!!
	// mais pourrait implementer plusieurs méthodes abstract de l'interface !!! 
	// parce que l'interface comme un contrat comme un claude

	private String niveau;

	
	
	public Etudiant(int num, String nom, String prenom, Adresse[] adresses, String niveau) {
		super(num, nom, prenom, adresses);
		this.niveau = niveau;
	}

	public Etudiant(int num, String nom, String prenom, Adresse[] adresses) {
		super(num, nom, prenom, adresses);
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	@Override
	public String toString() {
		return "Etudiant [niveau=" + niveau + ", toString()=" + super.toString() + "]"; 
	}

	@Override
	public void afficherDetails() {
		System.out.println(this.getNom()+" "+ this.getPrenom()+ " " + this.getNiveau());
		
	}

	@Override
	public void afficherNomMajusqcule() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afficherPrenomMajusqcule() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("yes");
	}


	
	
}
