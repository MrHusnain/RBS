package com.example.Pract.Controller;
import com.example.Pract.Model.CustomerModel;
import com.example.Pract.Model.ItemModel;
import com.example.Pract.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RequestMapping("/customer")
@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @GetMapping
    public List<CustomerModel> GetAllCustomers(){
    return customerService.GetAllCustomer();
    }
    @GetMapping ("{id}")
    private CustomerModel getCustomer(@PathVariable (name = "id") Integer id){
        return  customerService.getCustomer(id);}

}
