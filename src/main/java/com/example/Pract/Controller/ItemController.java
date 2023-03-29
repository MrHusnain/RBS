package com.example.Pract.Controller;

import com.example.Pract.Entity.Item;
import com.example.Pract.Model.ItemModel;
//import com.example.Pract.Services.ItemServices;
import com.example.Pract.Services.ItemServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/item")
public class ItemController {
    @Autowired
    private ItemServices itemServices;
@PostMapping
@ResponseStatus(HttpStatus.CREATED)
    public void Createitem(@RequestBody ItemModel itemModel){
    itemServices.CreateItem(itemModel);
}
    @GetMapping
    public List<ItemModel> getAllItem(){
        return itemServices.GetAllitemList();
    }
    @DeleteMapping("/{itemId}")
    public String DeleteItem(@PathVariable (name = "itemId") Integer itemId){
     return itemServices.DeleteItem(itemId);
    }
}
