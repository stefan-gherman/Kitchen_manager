package com.codecool.kitchen.workers;

import java.util.Random;

public interface HighBehaviour {
    default boolean setKnives() {
        Random knifeChance = new Random();
        int knifeProb = knifeChance.nextInt(100);
        if(knifeProb > 20){
            return true;
        }
        return false;
    }
}
