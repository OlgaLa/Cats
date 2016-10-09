package helpers;

import java.util.Scanner;
/**
 * Created by olapanovich on 9.10.16.
 */
public class Helpers {

    Scanner scanner = new Scanner(System.in);

    public String enterCatBreed() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter your cat breed^ b - for british, s - for sphynx\n");
        String breed = scanner.nextLine();
        return breed;
    }

    public double enterCatWeight() {
        System.out.print("Please, enter your cat weight\n");
        double weight = scanner.nextDouble();
        return weight;
    }

   @Override
    public String toString(){
        return ("Let's drink!");
    }
}
