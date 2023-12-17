package Polymorphismes.lombok;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString (callSuper = true) 


@Data

public class App {
	
	public static void main(String[] args) {
		
		
		Employe salarie1 = new Employe();
		System.out.println((Employe)salarie1);

	}

}
