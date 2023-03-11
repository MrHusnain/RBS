//package com.example.Pract.Services;
//
//import com.example.Pract.Entity.item;
//import com.example.Pract.Repository.ItemRepository;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Collections;
//import java.util.List;
//
//@Getter
//@Setter
////@NoArgsConstructor
//@AllArgsConstructor
//@Service
//public class ItemServices {
//    @Autowired
//ItemRepository itemRepository;
//
//    public List<item> itemList(){
//        return itemRepository.findAll();
//    }
//    public void saveItem(item item){
//        itemRepository.save(item);
//    }
//    public item get(Integer id){
//        return itemRepository.findById(id).get();
//    }
//    public void del(Integer id){
//        itemRepository.deleteById(id);
//    }
//}
