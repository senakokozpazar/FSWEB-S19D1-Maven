package com.workintech.s18d2.services;

import com.workintech.s18d2.dao.VegetableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VegetableServiceImpl implements VegetableService{

    private final VegetableRepository vegetableRepository;

    @Autowired
    public VegetableServiceImpl(VegetableRepository vegetableRepository) {
        this.vegetableRepository = vegetableRepository;
    }
}
