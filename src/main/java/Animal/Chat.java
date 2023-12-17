package Animal;

public class Chat extends Animal{

	Chat(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String Crier() {
		// TODO Auto-generated method stub
		return "ChaChat "+nom+" ronronne comme un train 🥹... ";
	}
	
	@Override
	public String Manger(){
		return nom+", Tu abuses, ta gamelle est déjà pleine, tu peux aller manger. ";
	}

}
