import java.util.Scanner;

public class TileCalculatorBrown {
    //Wes Brown

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double SALES_TAX_PERCENT = 0.06;

        //Get and print backsplash area
        System.out.print("Please enter the width of your backsplash: ");
        double backsplashLength = scanner.nextDouble();

        System.out.print("Please enter the length of your backsplash:");
        double backsplachWidth = scanner.nextDouble();

        double backsplashAreaInInches = backsplashLength * backsplachWidth;

        System.out.println("Area of backsplash is " + backsplashAreaInInches + " square inches.");


        final double INCHES_PER_SQUARE_FOOT = 144;
        double backsplashSquareFootage = backsplashAreaInInches/INCHES_PER_SQUARE_FOOT;

        System.out.println("Square foot is " + backsplashSquareFootage + ".");

        System.out.print("Please enter the length of a single tile:");
        double tileLength = scanner.nextDouble();

        System.out.print("Please enter the width of a single tile:");
        double tileHeight = scanner.nextDouble();

        double tileSquareFoot = (tileHeight*tileLength)/INCHES_PER_SQUARE_FOOT;

        double tilesNeeded = backsplashSquareFootage / tileSquareFoot;

        int roundedUpTilesNeeded = (int)Math.ceil(tilesNeeded);
        //double roundedUpTilesNeeded = Math.ceil(tilesNeeded);

        System.out.println("We need " + roundedUpTilesNeeded + " tiles to complete the backsplash.");

        //Calculate the cost of the tiles
        System.out.print("Please enter the cost per tile: ");
        double costPerTile = scanner.nextDouble();

        double costAllTiles = costPerTile * roundedUpTilesNeeded;
        double taxAmount = costAllTiles * SALES_TAX_PERCENT;
        double totalCost = costAllTiles + taxAmount;

        System.out.printf("The total cost of the titles is: $%.2f", totalCost);

        scanner.close();

    }
}
