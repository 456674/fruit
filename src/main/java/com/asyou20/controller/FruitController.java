package com.asyou20.controller;


import com.asyou20.entity.Fruit;
import com.asyou20.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author asyou20
 * @since 2023-11-06
 */
@RestController
@RequestMapping("/fruit")
public class FruitController {
    @Autowired
    private FruitService fruitService;
    @GetMapping("/list")
    public List<Fruit> list(){
        return this.fruitService.list();
    }
    @GetMapping("/find/{id}")
    Fruit find(@PathVariable("id") Integer id){
        return this.fruitService.getById(id);
    }
}

