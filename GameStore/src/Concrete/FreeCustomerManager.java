package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entity.Customer;

public class FreeCustomerManager extends BaseCustomerManager {

    public FreeCustomerManager(CustomerCheckService customerCheckService) {
        super(customerCheckService);
    }

    public void becomePremiumCustomer(Customer customer) {
        System.out.println(customer.getFirstName() + customer.getLastName() + " hesap premiuma yükseltildi..");
    }

}
