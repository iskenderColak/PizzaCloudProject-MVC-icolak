package com.icolak.service;

import com.icolak.exception.PizzaNotFoundException;
import com.icolak.model.Pizza;

import java.util.List;

public interface PizzaService {

    Pizza createPizza(Pizza pizzaToSave);

    List<Pizza> readAll();

    Pizza getPizza(Long pizzaId);

}
