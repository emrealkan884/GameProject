package Business;

import Entities.Customer;

public class EDevletValidator extends ValidateManager {
	
	public  boolean Validate(Customer customer) {
		if (customer.getNationalIdentity().length()==11) {
			System.out.println("E-Devlet ile do�ruland�");
			return true;
		}
		else {
			System.out.println("E-Devlet kulan�c� bilgisi ile uyu�muyor!");
			return false;
		}
	}
}

