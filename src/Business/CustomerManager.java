package Business;



import Entities.Customer;

public class CustomerManager implements CustomerService {
	
	public void add(Customer customer,ValidateManager[] validateManagers) {
		for (ValidateManager validateManager : validateManagers) {
			
			if (validateManager.Validate(customer) == true) {
				System.out.println("Oyuncu eklendi!");
			}
			else {
				System.out.println("Oyuncu eklenemedi");
			}
		}
		
	}
	public void update(Customer customer,ValidateManager[] validateManagers) {
		for (ValidateManager validateManager : validateManagers) {
			if (validateManager.Validate(customer) == true) {
				System.out.println("Oyuncu güncellendi!");
				}
				else {
					System.out.println("Oyuncu güncellenemedi");
				}
		}
	
	}
	public void delete(Customer customer,ValidateManager[] validateManagers) {
		for (ValidateManager validateManager : validateManagers) {
			if (validateManager.Validate(customer) == true) {
				System.out.println("Oyuncu silindi");
				}
				else {
					System.out.println("Oyuncu silinemedi");
				}
		}
	}
}
