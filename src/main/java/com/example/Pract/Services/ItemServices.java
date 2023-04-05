package com.example.Pract.Services;

import com.example.Pract.Entity.Item;
import com.example.Pract.Model.ItemModel;
import com.example.Pract.Repository.ItemRepository;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ItemServices {
    @Autowired
    ItemRepository itemRepository;
    public Boolean searchItem(Integer itemId){
        return itemRepository.existsById(itemId);
    }
    @Transactional
    public String CreateItem(ItemModel itemModel){
        String result;
        if (searchItem(itemModel.dissamble().getId())){
            result="already exist";
        }
        else {
            upsert(itemModel);
            result="Item Created";
        }

//    Item item = Item.builder()
//            .itemName(itemModel.getItemName())
//            .itemPrice(itemModel.getItemPrice())
//            .build();
//    itemRepository.save(item);
//    log.info("Product {} is saved ",itemModel.getId());
        return result;
                }
    @Transactional
    public ItemModel upsert(ItemModel itemModel){
        return itemModel.assamble(itemRepository.save(itemModel.dissamble()));
    }

    public List<ItemModel> GetAllitemList(){
        return itemRepository.findAll()
                .stream()
                .map(this::convertEntitytoModel)
                .collect(Collectors.toList());
    }
@Transactional
    private ItemModel convertEntitytoModel(Item item){
        ItemModel itemModel=new ItemModel();
       return itemModel.assamble(item);
    }
    @Transactional
    public String DeleteItem(Integer itemId){
        String Result;
        if (searchItem(itemId)){
            itemRepository.deleteById(itemId);
            Result="Deleted";
        } else {
            Result="not Exist";
        }
        return Result;
    }
@Transactional
    public String updateItem(ItemModel itemModel) {
        String result;
        if (searchItem(itemModel.dissamble().getId())){
            upsert(itemModel);
            result="updated";
        }else {
            result="not found";
        }
        return result;
    }
}
