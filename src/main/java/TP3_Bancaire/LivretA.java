package TP3_Bancaire;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)

public class LivretA extends CompteBancaire {

	public LivretA(float rate, float deposit) {
		super(rate, deposit);
		// TODO Auto-generated constructor stub
	}

}
