package com.example.Pract.Controller;

import com.example.Pract.Model.BillModel;
import com.example.Pract.Model.ItemModel;
import com.example.Pract.Services.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("api/bill")
public class BillController {
    @Autowired
    BillService billService;
    @PostMapping
    public ResponseEntity<BillModel> insert(@RequestBody BillModel billModel){
        BillModel billModel1=billService.upsert(billModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(billModel1);
    }
    @GetMapping
    public List<BillModel> getAllBill(){
        return billService.GetAllOrderList();
    }
    @DeleteMapping("/{billId}")
    public String DeleteItem(@PathVariable (name = "billId") Long billId){
        return billService.DeleteBill(billId);
    }
    @PutMapping("/update")
    private String updateBill(@RequestBody BillModel billModel){
        return billService.updateBill(billModel);
    }

}
