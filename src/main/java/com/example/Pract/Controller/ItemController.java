package com.example.Pract.Controller;

import com.example.Pract.Entity.Item;
import com.example.Pract.Model.itemModel;
import com.example.Pract.Repository.ItemRepository;
//import com.example.Pract.Services.ItemServices;
import com.example.Pract.Services.ItemServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {
    @Autowired
    private ItemServices itemServices;
    @GetMapping("/items")
    public List<itemModel> getAllItem(){
        return itemServices.GetAllitemList();
    }

//    @PostMapping("/saveItems")
//    public ResponseEntity<String> SaveItem(@RequestBody List<Item> itemList){
//        itemServices.save((item) itemList);
//        return ResponseEntity.ok("Data Saved");
//    }




}
