package com.codecool.kitchen.workers;

import java.util.Date;

public class Chef extends Employee implements HighBehaviour{



    private boolean hasKnifeSet;

    public Chef(String name, Date birthYear, float salary) {
        super(name, birthYear, salary);
        hasKnifeSet = this.setKnives();

    }

    public void shout() {
        System.out.println("BLEAGH");
    }

    @Override
    public void cook() {
        shout();
    }



}
