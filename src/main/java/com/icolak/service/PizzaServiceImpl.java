package com.icolak.service;

import com.icolak.exception.PizzaNotFoundException;
import com.icolak.model.Pizza;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class PizzaServiceImpl implements PizzaService{

    private static List<Pizza> pizzaList = new ArrayList<>();

    @Override
    public Pizza createPizza(Pizza pizzaToSave) {

        pizzaToSave.setId(UUID.randomUUID().getMostSignificantBits());

        pizzaList.add(pizzaToSave);

        return pizzaToSave;
    }

    @Override
    public List<Pizza> readAll() {
        return pizzaList;
    }

    public Pizza getPizza(Long pizzaId) {

        return readAll().stream().filter(pizza -> pizza.getId().equals(pizzaId))
                .findFirst().orElseThrow(() -> new PizzaNotFoundException("Pizza not found"));
    }
}
