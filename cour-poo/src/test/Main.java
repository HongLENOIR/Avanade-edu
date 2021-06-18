package test;

import java.rmi.UnexpectedException;

import javax.print.attribute.standard.RequestingUserName;

import model.Adresse;
import model.Enseignant;
import model.Etudiant;
import model.Etudient;
import model.Personne;

public class Main {

	public static void main(String[] args) {

//		int x = 2;
//		Personne personne = new Personne();
//		personne.setNom("wick");
//		personne.setPrenom("john");
//		personne.setNum(100);
//		Personne personne2 = new Personne(200, "dalton", "jack");
//		System.out.println(personne2);
		Adresse adresse = new Adresse();
		adresse.setRue("paradis");
		adresse.setVille("Marseille");
		adresse.setCodePostal("13000");
		Adresse adresse2 = new Adresse("porte maillot", "75005", "Paris");
		Adresse[] adresses = new Adresse[] { adresse, adresse2 };
//		Personne personne3 = new Personne(300, "maggio", "carol", adresses);
//		System.out.println(personne3);
//		for (int i = 0; i < adresses.length; i++) {
//			System.out.println(adresses[i].getVille());
//		}
//		
//		
		Etudiant etudiant= new Etudiant(400, "cervera", "sophie", adresses, "master");
//		System.out.println(etudiant);
		
		Enseignant enseignant = new Enseignant(500, "El", "achref", adresses, 1700);
//		System.out.println(enseignant);
//		System.out.println(enseignant instanceof Personne);
//		System.out.println(personne instanceof Enseignant);
//		
//		Personne [] personnes = new Personne [] {etudiant, personne, enseignant};
//		for(Personne p: personnes) { // un tableau qui ne savait pas si c'est une personne, ou enseignant ou etudiant
//			/*
//			 * Afficher le numéro s'il s'agit d'une personne
//			 * afficher le salaire s'il s'agit d'un enseignant
//			 * afficher le niveau s'il s'agit d'un etudiant
//			 * */
//			if(p instanceof Enseignant) {
//				System.out.println(((Enseignant) p).getSalaire());
//			}else if(p instanceof Etudiant){
//				System.out.println(((Etudiant) p).getNiveau());
//			}else {
//				System.out.println(p.getNum());
//			}
//		
//		}
//	
		etudiant.afficherDetails();
		enseignant.afficherDetails();
		
}}
		

