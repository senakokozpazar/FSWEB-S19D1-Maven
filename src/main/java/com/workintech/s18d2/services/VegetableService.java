package com.workintech.s18d2.services;

import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.entity.Vegetable;

import java.util.List;

public interface VegetableService {
    List<Vegetable> getByPriceAsc();
    List<Vegetable> getByPriceDesc();
    Vegetable getById(long id);
    Vegetable save(Vegetable vegetable);
    Vegetable delete(long id);
    List<Vegetable> searchByName(String name);
}
