package com.workintech.s18d2.services;

import com.workintech.s18d2.dao.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FruitServiceImpl implements FruitService{

    private final FruitRepository fruitRepository;

    @Autowired
    public  FruitServiceImpl(FruitRepository fruitRepository){
        this.fruitRepository = fruitRepository;
    }
}
