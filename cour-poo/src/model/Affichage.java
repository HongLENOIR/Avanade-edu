package model;

public interface Affichage { 
	// interface est comme une class abstract sans le mot clé 'abstract' contient que les méthodes abstract
	// interface ne peut pas déclarer attribut mais constance
	
	public abstract void afficherNomMajusqcule(); 
	public void afficherPrenomMajusqcule();
	
	// langage modrene, on utilise beaucoup interface, programmation interface écrit les codes automatique
	// une classe hérite une seule classe, mais une classe peut implementer plusieurs interfaces!!!
	
}
