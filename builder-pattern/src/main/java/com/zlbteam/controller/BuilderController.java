package com.zlbteam.controller;

import com.zlbteam.bean.Meal;
import com.zlbteam.bean.MealBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoulibin
 */
@Slf4j
@RestController
public class BuilderController {
    @Autowired
    MealBuilder mealBuilder;

    @RequestMapping("/builder/{id}")
    public String builder(@PathVariable String id){
        Meal meal = mealBuilder.prepareVegMeal();
        log.info("Veg Meal");
        meal.showItems();
        log.info("Total Cost: " + meal.getCost());
        return "builder";
    }
}
