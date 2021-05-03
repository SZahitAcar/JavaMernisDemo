package day4HomeWork2.Concrete;
import day4HomeWork2.Abstract.BaseCustomerManager;
import day4HomeWork2.Abstract.CustomerCheckService;
import day4HomeWork2.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}else {
		System.out.println("Not A Valid Person");
		}

	}

}
