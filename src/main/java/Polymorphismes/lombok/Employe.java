package Polymorphismes.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Data

@AllArgsConstructor
@NoArgsConstructor

@ToString (callSuper = true)
// Me permet de concatener ce qu'il y a ici et les Param présent dans le parent.

@EqualsAndHashCode(callSuper = false)

public class Employe extends Personne {
	
	private float salaire;
	
	public String toString(String prenom, String nom, int age) {

		StringBuilder sB = new StringBuilder();
		
		sB.append(super.getClass()).append(getSalaire()).append("...salaire !");
		
		sB.append("= > Prénom : ").append(getPrenom());
		sB.append("= > Nom : ").append(getNom());
		sB.append("= > Age : ").append(getAge());
		
		sB.append(" ...pas bien lourd : ").append(salaire);
		
		return sB.toString();
		
	}
	

}

