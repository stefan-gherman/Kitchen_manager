package com.codecool.kitchen.workers;

import java.util.Date;
import java.util.Random;
import java.util.RandomAccess;

public class Cook extends  Employee implements HighBehaviour{

   private int handsDirtyLevel;
    private boolean hasKnifeSet;

    public Cook(String name, Date birthYear, float salary) {
        super(name, birthYear, salary);
        hasKnifeSet = this.setKnives();
    }

    @Override
    public void cook() {
        this.handsDirtyLevel+=1;
    }


}
