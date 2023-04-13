package com.example.Pract.Services;

import com.example.Pract.Entity.Category;
import com.example.Pract.Entity.Item;
import com.example.Pract.Model.ItemModel;
import com.example.Pract.Repository.CategoryRepository;
import com.example.Pract.Repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    public Boolean searchItem(Integer itemId){
        return itemRepository.existsById(itemId);
    }
    public ItemModel upsert(ItemModel itemModel){
        Item item=itemModel.dissamble();
        Category category= categoryRepository.findCategoryById(item.getCategory().getId());
        item.setCategory(category);
        Item savedItem=itemRepository.save(item);
        return new ItemModel().assamble(savedItem);
    }
    public List<ItemModel> GetAllitemList(){
        List<Item> items=itemRepository.findAll();
        return items
                .stream()
                .map( item -> new ItemModel().assamble(item))
                .collect(Collectors.toList());
    }
    public ItemModel getItem(Integer id){
        ItemModel itemModel=new ItemModel();
        return itemModel.assamble(itemRepository.findItemById(id));
    }
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
