package Polymorphismes.lombok;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter


@AllArgsConstructor
@NoArgsConstructor

@ToString (callSuper = true)
@EqualsAndHashCode(callSuper = true)

public class Employe extends Personne {
	
	private float salaire;
	
	public String toString(String prenom, String nom, int age) {

		StringBuilder sB = new StringBuilder();
		
		sB.append("= > Prénom : ").append(getPrenom());
		sB.append("= > Nom : ").append(getNom());
		sB.append("= > Age : ").append(getAge());
		
		sB.append(" ...pas bien lourd : ").append(salaire);
		
		return sB.toString();
		
	}
	

}

