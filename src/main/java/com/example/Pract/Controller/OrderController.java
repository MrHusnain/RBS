package com.example.Pract.Controller;
import com.example.Pract.Entity.Customer;
import com.example.Pract.Entity.Order;
import com.example.Pract.Model.*;
import com.example.Pract.Repository.CustomerRepository;
import com.example.Pract.Services.CustomerService;
import com.example.Pract.Services.ItemService;
import com.example.Pract.Services.OrderService;
import com.example.Pract.util.DateUtil;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

//import static org.springframework.aop.scope.ScopedProxyBeanRegistrationAotProcessor.logger;
@Slf4j
@RestController @RequiredArgsConstructor @AllArgsConstructor
@RequestMapping("/api/order")
public class OrderController {
    @Autowired
    OrderService orderService;
    @Autowired
    CustomerService customerService;
    @PostMapping("/placeOrder")  @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<ResponseOrderDTO> placeOrder(@RequestBody OrderDTO orderDTO){
        ResponseOrderDTO responseOrderDTO = new ResponseOrderDTO();
        float amount = orderService.getCartAmount(orderDTO.getCartItems());
        Customer customer = new Customer();
        customer.setEmail(orderDTO.getCustomerEmail());
        customer.setName(orderDTO.getCustomerName());
   Customer customerIdFromDb = customerService.isCustomerPresent(customer);
        if (customerIdFromDb != null) {
            customer.setId(customerIdFromDb.getId());
        } else {
            customer = customerService.NewCustomer(customer);
        }
        Order order = new Order();
        order.setCustomer(customer);
        order.setCartItems(orderDTO.getCartItems());
        order.setOrderDescription(orderDTO.getOrderDescription());
        order = orderService.saveOrder(order);
        responseOrderDTO.setAmount(amount);
        responseOrderDTO.setDate(DateUtil.getCurrentDateTime());
        responseOrderDTO.setInvoiceNumber(new Random().nextInt(1000));
        responseOrderDTO.setOrderId(order.getId());
        return ResponseEntity.ok(responseOrderDTO);
    }
    @GetMapping(value = "/getOrder/{orderId}")
    public ResponseEntity<Order> getOrderDetails(@PathVariable int orderId) {
        Order order = orderService.getOrderDetail(orderId);
        return ResponseEntity.ok(order);
    }
    @PutMapping(value = "/editOrder")
    public String updateOrder(@PathVariable Order orderId){
        return orderService.updateOrder(orderId);
    }
    private Logger logger = LoggerFactory.getLogger(OrderController.class);
//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public String placeOrder(@RequestBody orderRequest orderModel) {
//        orderService.PlaceOrder(orderModel);
//        return "Order placed Successfully";
//    }
//    @GetMapping("/{orderId}")
//    private OrderModel getClientById(@PathVariable(name = "orderId")int orderId){
//        return orderService.getOrderById(orderId);
//    }
 @GetMapping
    public List<Order> AllOrder()
    {
        return orderService.gelAllOrder();
    }

}
