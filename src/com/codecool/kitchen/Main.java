package com.codecool.kitchen;

import com.codecool.kitchen.workers.Chef;
import com.codecool.kitchen.workers.Cook;
import com.codecool.kitchen.workers.Employee;
import com.codecool.kitchen.workers.KitchenHelper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Employee mainChef = new Chef("Cordarelle Patterson", new Date(1986, 11, 20), 2856.6f);
        Employee mainCook = new Cook("Barkevious Mingo", new Date(1964, 8, 20), 1865.6f);

        Employee kitchenHelper1 = new KitchenHelper("Geno Smith", new Date(1997, 3, 12), 220.5f);
        Employee kitchenHelper2 = new KitchenHelper("CeeDee Lamb", new Date(1996, 9, 18), 220.5f);
        Employee kitchenHelper3 = new KitchenHelper("Saquon Barkley", new Date(1995, 2,30), 250.5f);

        List<KitchenHelper> kitchenHelpers = new ArrayList<>();
        kitchenHelpers.add((KitchenHelper) kitchenHelper1);
        kitchenHelpers.add((KitchenHelper) kitchenHelper2);
        kitchenHelpers.add((KitchenHelper) kitchenHelper3);


        //mainChef.cook();
        //mainCook.cook();

        System.out.println("Helper 1 meat" + ((KitchenHelper) kitchenHelper1).getMeatCount());
        System.out.println("Helper 1 carrot" + ((KitchenHelper) kitchenHelper1).getCarrotCount());
        System.out.println("Helper 1 potato" + ((KitchenHelper) kitchenHelper1).getPotatoCount());

        System.out.println("Helper 2 meat" + ((KitchenHelper) kitchenHelper2).getMeatCount());
        System.out.println("Helper 2 carrot" + ((KitchenHelper) kitchenHelper2).getCarrotCount());
        System.out.println("Helper 2 potato" + ((KitchenHelper) kitchenHelper2).getPotatoCount());


        System.out.println("Helper 3 meat" + ((KitchenHelper) kitchenHelper3).getMeatCount());
        System.out.println("Helper 3 carrot" + ((KitchenHelper) kitchenHelper3).getCarrotCount());
        System.out.println("Helper 3 potato" + ((KitchenHelper) kitchenHelper3).getPotatoCount());

        mainChef.cook(kitchenHelpers);
        mainChef.cook(kitchenHelpers);
        mainChef.cook(kitchenHelpers);
        mainChef.cook(kitchenHelpers);
        mainChef.cook(kitchenHelpers);
        mainChef.cook(kitchenHelpers);
        mainChef.cook(kitchenHelpers);
        mainChef.cook(kitchenHelpers);
        mainChef.cook(kitchenHelpers);
        mainChef.cook(kitchenHelpers);
        mainChef.cook(kitchenHelpers);

        System.out.println("Helper 1 meat" + ((KitchenHelper) kitchenHelper1).getMeatCount());
        System.out.println("Helper 1 carrot" + ((KitchenHelper) kitchenHelper1).getCarrotCount());
        System.out.println("Helper 1 potato" + ((KitchenHelper) kitchenHelper1).getPotatoCount());

        System.out.println("Helper 2 meat" + ((KitchenHelper) kitchenHelper2).getMeatCount());
        System.out.println("Helper 2 carrot" + ((KitchenHelper) kitchenHelper2).getCarrotCount());
        System.out.println("Helper 2 potato" + ((KitchenHelper) kitchenHelper2).getPotatoCount());


        System.out.println("Helper 3 meat" + ((KitchenHelper) kitchenHelper3).getMeatCount());
        System.out.println("Helper 3 carrot" + ((KitchenHelper) kitchenHelper3).getCarrotCount());
        System.out.println("Helper 3 potato" + ((KitchenHelper) kitchenHelper3).getPotatoCount());
    }
}
