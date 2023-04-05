//package com.example.Pract.Services;
//import com.example.Pract.Entity.Customer;
//import com.example.Pract.Model.CustomerModel;
//import com.example.Pract.Repository.CustomerRepository;
//import jakarta.transaction.Transactional;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import java.util.List;
//import java.util.stream.Collectors;
//@Slf4j @Service
//public class CustomerService {
//    @Autowired
//    CustomerRepository customerRepository;
//    private boolean searchCustomer(Integer CustomerId) {
//        return customerRepository.existsById(CustomerId);
//    }
//    @Transactional
//    public CustomerModel upsert(CustomerModel customerModel){
//        return customerModel.assamble(customerRepository.save(customerModel.dissamble()));
//    }
//
//    public List<CustomerModel> GetAllCustomer() {
//        return customerRepository.findAll().
//                stream()
//                .map(this::customerList)
//                .collect(Collectors.toList());
//    }
//    public String AddCustomer(CustomerModel customerModel){
//        String result;
//        if (searchCustomer(customerModel.dissamble().getCustomerId())){
//            result="Username already exists. Please find another one";
//        }
//        else {
//         upsert(customerModel);
//         result="Created";
//        }
//        return result;
////        Customer customer= Customer.builder()
////                        .CustomerName(customerModel.getCustomerName())
////                         .build();
////        customerRepository.save(customer);
////        log.info("customer {} Added",customer.getCustomerId());
//
//    }
//    private CustomerModel customerList(Customer customer){
//        CustomerModel customerModel=new CustomerModel();
////        customerModel.setCustomerId(customer.getCustomerId());
////        customerModel.setCustomerName(customer.getCustomerName());
//           return customerModel.assamble(customer);
//
//    }
//
//    public String DeleteCustomer(Integer CustomerId){
//        String Result;
//        if (searchCustomer(CustomerId)){
//            customerRepository.deleteById(CustomerId);
//            Result="Deleted";
//        }
//        else
//        {
//            Result="don't Exist";
//        }
//        return Result;
//    }
//
//
//}
