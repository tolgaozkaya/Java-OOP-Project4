package Abstract;

import Entity.Customer;

public class BaseCustomerManager implements CustomerService {

    private CustomerCheckService customerCheckService;

    public BaseCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) throws Exception {
        if (customerCheckService.checkIfRealPerson(customer)) {
            System.out.println("Save to database : " + customer.getFirstName() + " " + customer.getLastName());
        } else {
            throw new Exception("Invalid person");
        }
    }

    @Override
    public void update(Customer customer) {
        System.out.println("User information update : " + customer.getFirstName() + " " + customer.getLastName());
    }

    @Override
    public void delete(Customer customer) {
        System.out.println("Delete from database : " + customer.getFirstName() + " " + customer.getLastName());
    }
}
