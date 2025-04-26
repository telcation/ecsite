package com.example.ecsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.ecsite.repository.ItemRepository;

@Controller
public class ItemsController {

    private final ItemRepository itemRepository;

    public ItemsController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @GetMapping("/items")
    public String items(Model model) {
        model.addAttribute("items", itemRepository.findAll()); // ←ここ！！
        return "items";
    }
}
