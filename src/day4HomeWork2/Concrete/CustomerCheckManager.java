package day4HomeWork2.Concrete;

import day4HomeWork2.Abstract.CustomerCheckService;
import day4HomeWork2.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return true;
		
	}


}
