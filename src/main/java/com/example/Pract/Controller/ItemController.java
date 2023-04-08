package com.example.Pract.Controller;

import com.example.Pract.Entity.Item;
import com.example.Pract.Model.ItemModel;
//import com.example.Pract.Services.ItemServices;
import com.example.Pract.Services.ItemServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/item")
public class ItemController {
    @Autowired
    private ItemServices itemServices;
@PostMapping
    public ResponseEntity<ItemModel> insert(@RequestBody ItemModel itemModel){
//    return itemServices.CreateItem(itemModel);
   ItemModel insertItemModel=itemServices.upsert(itemModel);
//    FlightScheduleModel insertedFlightScheduleModel = flightScheduleService.insert(flightScheduleModel);
    return ResponseEntity.status(HttpStatus.CREATED).body(insertItemModel);
}
    @GetMapping
    public List<ItemModel> getAllItem(){
        return itemServices.GetAllitemList();
    }
    @DeleteMapping("/{itemId}")
    public String DeleteItem(@PathVariable (name = "itemId") Integer itemId){
     return itemServices.DeleteItem(itemId);
    }
    @PutMapping("/update")
    private String updateClient(@RequestBody ItemModel itemModel){
        return itemServices.updateItem(itemModel);
    }
}
