package Polymorphismes;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public abstract class Personne {
	
	private String prenom;
	private String nom;
	private int age;
	
	Personne (String nom, String prenom, int age){
		
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
	}
	
	@Override
	public String toString() {

		StringBuilder sB = new StringBuilder();
		
		sB.append("= > Xavier ").append(prenom);
		sB.append("Oillic, ").append(nom);
		sB.append("= > age : ").append(age);
		
		return sB.toString();
		
	}
	
}
