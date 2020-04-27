package com.codecool.kitchen.workers;

import java.util.Date;
import java.util.List;
import java.util.Random;

public class KitchenHelper extends Employee{


    private int carrotCount;
    private int meatCount;
    private int potatoCount;
    private int MAX_INGREDIENT_COUNT = 3;
    private int MIN_INGREDIENT_COUNT = 1;

    public KitchenHelper(String name, Date birthYear, float salary) {
        super(name, birthYear, salary);
        Random ingredientChance = new Random();
        this.carrotCount = ingredientChance.nextInt((MAX_INGREDIENT_COUNT - MIN_INGREDIENT_COUNT)+1) + MIN_INGREDIENT_COUNT;
        this.meatCount = ingredientChance.nextInt((MAX_INGREDIENT_COUNT - MIN_INGREDIENT_COUNT)+1) + MIN_INGREDIENT_COUNT;
        this.potatoCount = ingredientChance.nextInt((MAX_INGREDIENT_COUNT - MIN_INGREDIENT_COUNT)+1) + MIN_INGREDIENT_COUNT;
    }


    public int getCarrotCount() {
        return carrotCount;
    }

    public void setCarrotCount(int carrotCount) {
        this.carrotCount = carrotCount;
    }

    public int getMeatCount() {
        return meatCount;
    }

    public void setMeatCount(int meatCount) {
        this.meatCount = meatCount;
    }

    public int getPotatoCount() {
        return potatoCount;
    }

    public void setPotatoCount(int potatoCount) {
        this.potatoCount = potatoCount;
    }

    public boolean decreaseIngredient(String ingredientName) {
        switch (ingredientName) {
            case "carrot":
                if(carrotCount <= 0 ) {

                    return false;
                } else {
                    carrotCount -= 1;
                    break;
                }
            case "meat":
                if(meatCount <= 0 ) {

                    return false;
                } else {
                    meatCount -= 1;
                    break;
                }
            case "potato":
                if(potatoCount <= 0 ) {
                    return false;
                } else {
                    potatoCount -= 1;
                    break;
                }
        }
        return true;
    }
    @Override
    public void cook() {
        System.out.println("I can't cook");
    }

    @Override
    public void cook(List<KitchenHelper> kitchenHelpers) {

    }
}
