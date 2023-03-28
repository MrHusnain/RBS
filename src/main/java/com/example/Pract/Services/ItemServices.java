package com.example.Pract.Services;

import com.example.Pract.Entity.Item;
import com.example.Pract.Model.ItemModel;
import com.example.Pract.Repository.ItemRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
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
    public void CreateItem(ItemModel itemModel){
    Item item = Item.builder()
            .itemName(itemModel.getItemName())
            .itemPrice(itemModel.getItemPrice())
            .build();
    itemRepository.save(item);
    log.info("Product {} is saved ",item.getItemId());

                }


    public List<ItemModel> GetAllitemList(){
        return itemRepository.findAll()
                .stream()
                .map(this::convertEntitytoModel)
                .collect(Collectors.toList());
    }

    private ItemModel convertEntitytoModel(Item item){
        ItemModel itemModel=new ItemModel();
        itemModel.setItemName(item.getItemName());
        itemModel.setItemId(item.getItemId());
        itemModel.setItemPrice(item.getItemPrice());
        itemModel.setCategory(item.getCategory());
        return itemModel;

    }
}
