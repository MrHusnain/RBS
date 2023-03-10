package com.example.Pract.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

//import java.util.List;

@Entity @Getter@Setter @NoArgsConstructor @AllArgsConstructor
public class item {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)

   private int itemId;
    @Column(name = "item_name")
    private String itemName;
    @Column (name = "item_price")
    private String itemPrice;



//@ManyToOne (cascade = CascadeType.ALL)
//@JoinColumn (name ="Fk_id")
//private Category category;

    @Override
    public String toString() {
        return "item{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice='" + itemPrice + '\'' +

                '}';
    }
}
