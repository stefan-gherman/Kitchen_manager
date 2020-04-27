package com.codecool.kitchen.workers;

import java.util.*;

public class Chef extends Employee implements HighBehaviour{



    private boolean hasKnifeSet;
    private List<String> ingredientsList;

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

    @Override
    public void cook(List<KitchenHelper> kitchenHelpers) {
        shout();
        Random ingredient = new Random();
        int ingredientValue = ingredient.nextInt(3);
        switch (ingredientValue) {
            case 0:
                kitchenHelpers.sort((o1, o2) -> {
                    if (o1.getCarrotCount() > o2.getCarrotCount()) {
                        return -1;
                    } else if (o1.getCarrotCount() == o2.getCarrotCount()) {
                        return 0;
                    } else if (o1.getCarrotCount() < o2.getCarrotCount()) {
                        return 1;
                    }
                    return 1;
                });
                System.out.println("Carrots");
                for (KitchenHelper helper: kitchenHelpers
                     ) {
                    System.out.print(helper.getCarrotCount() + "-");
                }

                if (kitchenHelpers.get(0).getCarrotCount() <= 0) {
                    System.out.println("We're all out of carrots");

                } else {
                    System.out.println("carrot");
                    kitchenHelpers.get(0).decreaseIngredient("carrot");

                }
                break;
            case 1:
                kitchenHelpers.sort((o1, o2) -> {
                    if (o1.getMeatCount() > o2.getMeatCount()) {
                        return -1;
                    } else if (o1.getMeatCount() == o2.getMeatCount()) {
                        return 0;
                    } else if (o1.getMeatCount() < o2.getMeatCount()) {
                        return 1;
                    }
                    return 1;
                });
                System.out.println("Meat");
                for (KitchenHelper helper: kitchenHelpers
                ) {
                    System.out.print(helper.getMeatCount() + "-");
                }

                if (kitchenHelpers.get(0).getMeatCount() <= 0) {
                    System.out.println("We're all out of meat");
                } else {
                    System.out.println("meat");
                    kitchenHelpers.get(0).decreaseIngredient("meat");
                }
                break;
            case 2:
                kitchenHelpers.sort((o1, o2) -> {
                    if (o1.getPotatoCount() > o2.getPotatoCount()) {
                        return -1;
                    } else if (o1.getPotatoCount() == o2.getPotatoCount()) {
                        return 0;
                    } else if (o1.getPotatoCount() < o2.getPotatoCount()) {
                        return 1;
                    }
                    return 1;
                });
                System.out.println("Potatoes");
                for (KitchenHelper helper: kitchenHelpers
                ) {
                    System.out.print(helper.getPotatoCount() + "-");
                }

                if (kitchenHelpers.get(0).getPotatoCount() <= 0) {
                    System.out.println("We're all out of potatoes");
                } else {
                    System.out.println("potato");
                    kitchenHelpers.get(0).decreaseIngredient("potato");
                }
                break;
            default:
                break;
        }

    }


}
