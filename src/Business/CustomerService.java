package Business;

import Entities.Customer;


public interface CustomerService {
	
	void add(Customer customer,ValidateManager[] validateManagers);
	void update(Customer customer,ValidateManager[] validateManagers);
	void delete(Customer customer,ValidateManager[] validateManagers);
}
