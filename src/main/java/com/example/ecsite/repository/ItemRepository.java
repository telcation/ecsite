package com.example.ecsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecsite.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
