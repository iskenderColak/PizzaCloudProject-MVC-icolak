package com.icolak.controller;

import com.icolak.bootstrap.DataGenerator;
import com.icolak.model.Pizza;
import com.icolak.service.PizzaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@Controller
@RequestMapping("/design")
public class DesignPizzaController {

    private final PizzaService pizzaService;

    public DesignPizzaController(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    @GetMapping
    public String showDesignForm(Model model) {

        model.addAttribute("pizza", new Pizza());

        model.addAttribute("cheeses", DataGenerator.cheeseTypeList);
        model.addAttribute("sauces", DataGenerator.sauceTypeList);
        model.addAttribute("toppings", DataGenerator.toppingTypeList);

        return "/design";

    }

    @PostMapping("/createPizza")
    public String processPizza(Pizza pizza) {

        pizzaService.createPizza(pizza);

        return "redirect:/orders/current?pizzaId=" + pizza.getId();

    }
}
