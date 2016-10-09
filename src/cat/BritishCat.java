package cat;

import care.BritishCare;

/**
 * Created by olapanovich on 9.10.16.
 */
public class BritishCat extends Cat {

    public BritishCat() {
        catWeigth = new BritishCare();
    }

    @Override
    public void printNecessaryFoodAmount(double weight){
        System.out.printf("Necessary amount of food: %f", catWeigth.calculateFoodAmount(weight));
    }

    @Override
    public void playingWithCat(){
        System.out.printf("\nLet's play the games: %s, %s,%s", Games.Attack, Games.LookOutTheWindow, Games.LazerBeam);
    }

    @Override
    public void useCatInsteadOfPlantain(){
        System.out.println("\nPlease put the cat on the sore spot. Wait.");
    }
}


