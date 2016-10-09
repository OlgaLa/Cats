package com.company;

import cat.BritishCat;
import cat.Cat;
import cat.SphynxCat;
import helpers.Helpers;


public class Main {

    public static void main(String[] args) {

        Helpers helpers = new Helpers();

        try {
            switch (helpers.enterCatBreed()) {
                case ("b"): {
                    Cat british = new BritishCat();
                    british.printNecessaryFoodAmount(helpers.enterCatWeight());
                    british.playingWithCat();
                    british.useCatInsteadOfPlantain();
                    break;
                }
                case ("s"): {
                    Cat sphynx = new SphynxCat();
                    sphynx.printNecessaryFoodAmount(helpers.enterCatWeight());
                    sphynx.playingWithCat();
                    sphynx.useCatInsteadOfPlantain();
                    break;
                }
                default:
                    System.out.print(helpers);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.print("You have entered incorrect cat weight!");
        }
        catch (java.lang.NullPointerException e) {
            System.out.print("Too big value");
        }

    }

}



