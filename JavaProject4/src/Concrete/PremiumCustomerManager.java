package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;

public class PremiumCustomerManager extends BaseCustomerManager {

    public PremiumCustomerManager(CustomerCheckService customerCheckService) {
        super(customerCheckService);
    }
}
