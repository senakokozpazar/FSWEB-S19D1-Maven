package com.workintech.s18d2.dao;

import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.entity.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VegetableRepository extends JpaRepository<Vegetable, Long> {

    List<Vegetable> findAllByOrderByPriceDesc();
    List<Vegetable> findAllByOrderByPriceAsc();

    @Query("SELECT v FROM Vegetable v WHERE LOWER(v.name) LIKE LOWER(CONCAT('%', :name, '%'))")
    List<Fruit> findByNameContainingIgnoreCase(String name);
}
