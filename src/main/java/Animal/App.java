package Animal;

//import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<Animal>animaux = new ArrayList<>();
		
		animaux.add(new Chien("Furfande"));
		animaux.add(new Chien("Gepetto"));
		animaux.add(new Chat("Pixel"));
		animaux.add(new Chat("Paillette"));
		
		for (Animal anim : animaux) {
			//PrintStream printStream = new PrintStream(null);
			if (anim instanceof Chat) {
				((Chat)anim).griffer(); // =====> CASTING INSTANCE OF <============
			}
			System.out.println(anim.Crier()+anim.Manger());
			System.out.println();
		}

	}

}
