package Abstract;

import Entity.Customer;

public interface CustomerService {
    public void save(Customer customer) throws Exception;
    public void update(Customer customer);
    public void delete(Customer customer);
}
