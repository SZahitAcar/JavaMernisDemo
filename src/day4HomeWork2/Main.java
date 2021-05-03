package day4HomeWork2;
import java.util.Date;

import day4HomeWork2.Abstract.*;
import day4HomeWork2.Adapters.MernisServiceAdapter;
import day4HomeWork2.Concrete.*;
import day4HomeWork2.Entities.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		@SuppressWarnings("deprecation")
		Customer customer =new Customer(1,"Selami Zahit", "Acar",new Date(2000,06,16),"33046622400");
		customerManager.save(customer);
	}

}
