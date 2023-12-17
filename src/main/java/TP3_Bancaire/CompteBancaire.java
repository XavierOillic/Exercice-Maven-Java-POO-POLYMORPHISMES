package TP3_Bancaire;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor

@Getter
@Setter

public abstract class CompteBancaire {
	protected float rate;
	protected float deposit;
	
	 public float rateCalcul() {
		 
		 float interest = 0;
		 interest = (deposit * rate) / 100; 
		 
		 return interest;
	 }

	
}
