package TP3_Bancaire;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)



public class PEA extends CompteBancaire {
	
	private float impositRate;

	public PEA(float rate, float deposit, float impositRate) {
		super(rate, deposit);
		this.impositRate = impositRate;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public float rateCalcul () {
		float interest = (super.rateCalcul());
		this.getImpositRate();
		
		 // float interest = 0;
		 interest = (deposit * rate) / 100; 
		 
		 return interest - (interest * this.getImpositRate() / 100);
		 
	 }

}
// return interest * 0.7f; OK !

//pour soustraire le taux, il faut que je multplie par 0.70
//Exemple : 100 € - (100 € * 20 / 100) = 80 € : pour 20% de réduction.
