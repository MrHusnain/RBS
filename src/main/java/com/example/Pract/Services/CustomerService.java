package com.example.Pract.Services;
import com.example.Pract.Entity.Customer;
import com.example.Pract.Model.CustomerModel;
import com.example.Pract.Repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;
@Slf4j @Service
public class CustomerService {
    public Object save;
    @Autowired
    CustomerRepository customerRepository;
    public Customer isCustomerPresent(Customer customer){
        return customerRepository.getCustomerByEmailAndName(customer.getEmail(),customer.getName());
    }
    public List<CustomerModel> GetAllCustomer() {
        return customerRepository.findAll().
                stream()
                .map(this::customerList)
                .collect(Collectors.toList());
    }
    private CustomerModel customerList(Customer customer){
        CustomerModel customerModel=new CustomerModel();
        return customerModel.assamble(customer);
    }
    public Customer NewCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
    public CustomerModel getCustomer(Integer id) {
        CustomerModel customerModel=new CustomerModel();
        return customerModel.assamble(customerRepository.findCustomerById(id));
    }
//    @Transactional
//    public CustomerModel upsert(CustomerModel customerModel){
//        return customerModel.assamble(customerRepository.save(customerModel.dissamble()));
//    }
}
