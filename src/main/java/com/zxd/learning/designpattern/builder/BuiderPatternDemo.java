package com.zxd.learning.designpattern.builder;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.builder
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 10:35 2018/2/12.
 */
public class BuiderPatternDemo {

    public static void main(String[] args){
        Meal vegMeal = MealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total cost:"+vegMeal.getCost());

        Meal nonVegMeal = MealBuilder.prepareNonVegMeal();
        System.out.println("Non Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total cost:"+nonVegMeal.getCost());

    }
}
