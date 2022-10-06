package com.icolak.model;

import com.icolak.enums.Cheese;
import com.icolak.enums.Sauce;
import com.icolak.enums.Topping;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pizza {

    private Long id;
    private List<Cheese> cheeseList;
    private List<Sauce> sauceList;
    private List<Topping> toppingList;

}
