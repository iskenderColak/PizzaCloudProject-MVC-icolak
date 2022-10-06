package com.icolak.bootstrap;

import com.icolak.enums.Cheese;
import com.icolak.enums.Sauce;
import com.icolak.enums.Topping;

import java.util.Arrays;
import java.util.List;

public class DataGenerator {

    public static List<Cheese> cheeseTypeList;
    public static List<Sauce> sauceTypeList;
    public static List<Topping> toppingTypeList;

    static{
        cheeseTypeList = Arrays.asList(Cheese.values());
        sauceTypeList = Arrays.asList(Sauce.values());
        toppingTypeList = Arrays.asList(Topping.values());
    }
}
