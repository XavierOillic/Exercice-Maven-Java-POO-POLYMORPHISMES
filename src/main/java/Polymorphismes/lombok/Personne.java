package Polymorphismes.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor


@Data 
// LE DATA EMBARQUE EN UN SEUL MOT GETTER SETTER REQUIRED TOSTRING

public abstract class Personne {
	
	private String prenom;
	private String nom;
	private int age;
	
	
	@Override
	public String toString() {

		StringBuilder sB = new StringBuilder();
		
		sB.append("= > Xavier ").append(prenom);
		sB.append("Oillic, ").append(nom);
		sB.append("= > age : ").append(age);
		
		return sB.toString();
		
	}
	
}

