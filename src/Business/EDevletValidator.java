package Business;

import Entities.Customer;

public class EDevletValidator extends ValidateManager {
	
	public  boolean Validate(Customer customer) {
		if (customer.getNationalIdentity().length()==11) {
			System.out.println("E-Devlet ile doðrulandý");
			return true;
		}
		else {
			System.out.println("E-Devlet kulanýcý bilgisi ile uyuþmuyor!");
			return false;
		}
	}
}

