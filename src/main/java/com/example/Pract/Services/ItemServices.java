package com.example.Pract.Services;

import com.example.Pract.Entity.Item;
import com.example.Pract.Model.itemModel;
import com.example.Pract.Repository.ItemRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Service
public class ItemServices {
    @Autowired
ItemRepository itemRepository;

    public List<itemModel> GetAllitemList(){
        return itemRepository.findAll()
                .stream()
                .map(this::convertEntitytoModel)
                .collect(Collectors.toList());
    }

    private itemModel convertEntitytoModel(Item item){
        itemModel itemModel=new itemModel();
        itemModel.setItemName(item.getItemName());
        itemModel.setItemId(item.getItemId());
        itemModel.setItemPrice(item.getItemPrice());
        itemModel.setCategory(item.getCategory());
        return itemModel;

    }
}
