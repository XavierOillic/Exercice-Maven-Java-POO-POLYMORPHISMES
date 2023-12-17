package Animal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public abstract class Animal {
		protected String nom;
		
		Animal (String nom){
			this.nom = nom;
		}
		
		public String Manger () {
			return nom+", Mange !";
		}
		
		public abstract String Crier();
}
