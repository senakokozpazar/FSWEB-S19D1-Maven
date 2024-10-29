package com.workintech.s18d2.dao;

import com.workintech.s18d2.entity.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FruitRepository  extends JpaRepository<Fruit, Long > {

    List<Fruit> findAllByOrderByPriceDesc();
    List<Fruit> findAllByOrderByPriceAsc();

    @Query("SELECT f FROM Fruit f WHERE LOWER(f.name) LIKE LOWER(CONCAT('%', :name, '%'))")
    List<Fruit> findByNameContainingIgnoreCase(String name);
}
