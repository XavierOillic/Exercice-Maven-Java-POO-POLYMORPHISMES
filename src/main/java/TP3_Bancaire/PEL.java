package TP3_Bancaire;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)

public class PEL extends CompteBancaire {

	public PEL(float rate, float deposit) {
		super(rate, deposit);
		// TODO Auto-generated constructor stub
	}

}
