package com.example.ecsite.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.ecsite.entity.Item;
import com.example.ecsite.repository.ItemRepository;

@Configuration
public class DataLoader {

    @Bean
    public CommandLineRunner loadData(ItemRepository repository) {
        return (args) -> {
            if (repository.count() == 0) {
                repository.save(new Item(null, "ハンドメイドブレスレット", 1200, "カラフルな天然石を使ったブレスレット", "/images/bracelet.jpg"));
                repository.save(new Item(null, "レザーポーチ", 2500, "手縫いで仕上げたかわいいポーチ", "/images/pouch.jpg"));
                repository.save(new Item(null, "編みぐるみ", 1800, "ふわふわ毛糸で作った小さな動物たち", "/images/amigurumi.jpg"));
            }
        };
    }
}
