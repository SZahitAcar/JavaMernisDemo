package day4HomeWork2.Adapters;

import java.rmi.RemoteException;

import day4HomeWork2.Abstract.CustomerCheckService;
import day4HomeWork2.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@SuppressWarnings("deprecation")
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		
		try {
			return client.TCKimlikNoDogrula(
					Long.parseLong(customer.getNationalIdentity()),
					customer.getFirstName(),
					customer.getLastName(),
					customer.getDateofBirth().getYear());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}

}
