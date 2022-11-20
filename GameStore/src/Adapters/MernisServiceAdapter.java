package Adapters;

import Abstract.CustomerCheckService;
import Entity.Customer;
import MernisReference.MPGKPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService {

    @Override
    public boolean checkIfRealPerson(Customer customer) throws Exception {
        MPGKPSPublicSoap mernisService = new MPGKPSPublicSoap();
        Boolean result = mernisService.TCKimlikNoDogrula(
                Long.valueOf(customer.getNationalId()),
                customer.getFirstName().toUpperCase(),
                customer.getLastName().toUpperCase(),
                customer.getDateOfBirth().getYear()
        );
        return result;
    }
}
