package Polymorphismes;

import lombok.Getter;
import lombok.Setter;



public class Employe extends Personne {
	
	private float salaire;

	Employe(String nom, String prenom, int age, float salaire) {
		super(prenom, nom, age); // Le SUPER parce que c'est un enfant.
		this.salaire = salaire;
		
	}
	
	public float getSalaire() {
		return salaire;
	}

	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}
	

	@Override
	public String toString() {

		StringBuilder sB = new StringBuilder();
		
		sB.append(super.toString()).append(" Salaire : ").append(salaire);
		
		//sB.append("= > Prénom : ").append(getPrenom());
		//sB.append("= > Nom : ").append(getNom());
		//sB.append("= > Age : ").append(getAge());
		
		//sB.append(" ...pas bien lourd : ").append(salaire);
		
		return sB.toString();
		
	}
	

}
