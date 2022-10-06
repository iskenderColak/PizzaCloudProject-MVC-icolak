package com.icolak.controller;

import com.icolak.exception.PizzaNotFoundException;
import com.icolak.model.Pizza;
import com.icolak.model.PizzaOrder;
import com.icolak.service.PizzaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@RequestMapping("/orders")
public class OrderController {

    private final PizzaService pizzaService;

    public OrderController(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    @GetMapping("/current")
    public String orderForm(@RequestParam("pizzaId") Long pizzaId, Model model) {

        PizzaOrder pizzaOrder = new PizzaOrder();

        // Fix the getPizza method below in line 49.
        pizzaOrder.setPizza(pizzaService.getPizza(pizzaId));

        model.addAttribute("pizzaOrder", pizzaOrder);

        return "/order";
    }

    @PostMapping("/{pizzaId}")
    public String processOrder(@PathVariable("pizzaId") Long pizzaId, PizzaOrder pizzaOrder) {

        // Save the order

        pizzaOrder.setPizza(pizzaService.getPizza(pizzaId));

        return "redirect:/home";
    }

}
