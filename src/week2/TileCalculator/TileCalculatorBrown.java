package week2.TileCalculator;

import java.util.Scanner;

public class TileCalculatorBrown {
    //Wes Brown

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the width of your backsplash: ");
        double backsplashLength = scanner.nextDouble();

        System.out.print("Please enter the length of your backsplash:");
        double backsplachWidth = scanner.nextDouble();

        double backsplashAreaInInches = backsplashLength * backsplachWidth;

        System.out.println("Area of backsplash is " + backsplashAreaInInches + " square inches.");


        final double INCHES_PER_SQUARE_FOOT = 144;
        double backsplashSquareFootage = backsplashAreaInInches/INCHES_PER_SQUARE_FOOT;

        System.out.println("Square foot is " + backsplashSquareFootage + ".");

        double tileLength = 11.75;
        double tileHeight = 11.75;

        double tileSquareFoot = (tileHeight*tileLength)/INCHES_PER_SQUARE_FOOT;

        double tilesNeeded = backsplashSquareFootage / tileSquareFoot;

        int roundedUpTilesNeeded = (int)Math.ceil(tilesNeeded);
        //double roundedUpTilesNeeded = Math.ceil(tilesNeeded);

        System.out.println("We need " + roundedUpTilesNeeded + " tiles to complete the backsplash.");

        scanner.close();

    }
}
