//package com.example.Pract.Controller;
//
//import com.example.Pract.Entity.item;
//import com.example.Pract.Repository.ItemRepository;
////import com.example.Pract.Services.ItemServices;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//public class ItemController {
//    @Autowired
//    private ItemRepository itemServices;
//    // RESTful API methods for Retrieval operations
//
////    @GetMapping("/item")
////    public List<item> list() {
////        return itemServices.itemList();
////    }
//    @PostMapping("/saveItems")
//    public ResponseEntity<String> SaveItem(@RequestBody List<item> itemList){
//        itemServices.save((item) itemList);
//        return ResponseEntity.ok("Data Saved");
//    }
//
//
//
////}
