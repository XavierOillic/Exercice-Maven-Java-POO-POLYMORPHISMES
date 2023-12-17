package Animal;

public class Chien extends Animal {

	Chien(String nom){
		super(nom);
	}

	@Override
	public String Crier() {
		return nom+" , Wouf WOUf Wouf ! ";
	}
}
