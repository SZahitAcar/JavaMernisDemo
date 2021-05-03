package day4HomeWork2.Abstract;
import day4HomeWork2.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Saved To Database : " + customer.getFirstName());
	}

}
