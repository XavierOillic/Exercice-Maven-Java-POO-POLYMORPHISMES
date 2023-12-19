package Polymorphismes;

import lombok.Getter;
import lombok.Setter;



public abstract class Personne {
	
	private String prenom;
	private String nom;
	private int age;
	
	Personne (String nom, String prenom, int age){
		
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public String toString() {

		StringBuilder sB = new StringBuilder();
		
		sB.append("["+this.getClass().getName()+"]").append(" Age").append(age);
		
		sB.append("= > Xavier ").append(prenom); // Echainement de méthodes.
		sB.append("Oillic, ").append(nom);
		sB.append("= > age : ").append(age);
		
		// stringBuilder.append("prenom");
		
		return sB.toString();
		
	}
	
}
