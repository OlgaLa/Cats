package cat;

import care.BritishCare;
import care.SphynxCare;

/**
 * Created by olapanovich on 9.10.16.
 */
public class SphynxCat extends Cat  {

    public SphynxCat() {
        catWeigth = new SphynxCare();
    }

    @Override
    public void printNecessaryFoodAmount(double weight){
        System.out.printf("Necessary amount of food: %f", catWeigth.calculateFoodAmount(weight));
    }

    @Override
    public void playingWithCat(){
        System.out.printf("\nLet's play the games: %s, %s,%s", Games.HideAndSeek, Games.Run, Games.TakeABath);
    }

    @Override
    public void useCatInsteadOfPlantain(){
        System.out.println("\nFind british cat!");
    }
}

