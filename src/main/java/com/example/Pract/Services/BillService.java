package com.example.Pract.Services;

import com.example.Pract.Entity.*;
import com.example.Pract.Model.BillModel;
import com.example.Pract.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BillService {
    @Autowired
    private BillRepository billRepository;

    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private UserRepositry userRepositry;
    @Autowired
    private CustomerRepository customerRepository;
    public BillModel upsert(BillModel billModel) {
        Bill bill=billModel.disamble();
         Customer customer=customerRepository.findCustomerByCustomerId(bill.getCustomer().getCustomerId());
        Order order=orderRepository.findOrderByOrderId(bill.getOrder().getOrderId());
        User user=userRepositry.findByUserId(bill.getUser().getUserId());
        bill.setOrder(order);
        bill.setCustomer(customer);
        bill.setUser(user);
        Bill savedBill=billRepository.save(bill);
        return new BillModel().assamble(savedBill);

    }

    public List<BillModel> GetAllOrderList() {
        List<Bill> bills=billRepository.findAll();
        return bills
                .stream()
                .map( bill -> new BillModel().assamble(bill))
                .collect(Collectors.toList());

    }
    public Boolean searchBill(Long billId){
        return billRepository.existsById(billId);
    }

    public String DeleteBill(Long billId) {
            String Result;
            if (searchBill(billId)){
                billRepository.deleteById(billId);
                Result="Deleted";
            } else {
                Result="not Exist";
            }
            return Result;
        }
    public String updateBill(BillModel billModel) {
        String result;
        if (searchBill(billModel.disamble().getId())){
            upsert(billModel);
            result="updated";
        }else {
            result="not found";
        }
        return result;
    }
    }

