package model;

import java.util.Arrays;

public class Stagiaire {
	private String nom;
	private float[] notes;
	
	public Stagiaire(String nom, float[] notes) {
		this.nom = nom;
		this.notes = notes;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public float[] getNotes() {
		return notes;
	}
	public void setNotes(float[] notes) {
		this.notes = notes;
	}
	@Override
	public String toString() {
		return "Stagiaire [nom=" + nom + ", notes=" + Arrays.toString(notes) + "]";
	}
	
	
	

}
