package com.example.Pract.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Menu {
    @Id
    private Double menuDumyId;
//    @JoinColumn(name = "Category_Id")
//    Category Category_id;
//    @JoinColumn(name = "item_id")
//    item itemId;
//    @JoinColumn(name = "item_name")
//    item itemName;


}
