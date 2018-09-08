package week2.TileCalculator;

public class TileCalculatorBrown {
    //Wes Brown

    public static void main(String[] args) {

        double backsplashLength = 117;
        double backsplachWidth = 18;

        double backsplashAreaInInches = backsplashLength * backsplachWidth;

        System.out.println("Area of backsplash is " + backsplashAreaInInches + " square inches.");


        final double INCHES_PER_SQUARE_FOOT = 144;
        double backsplashSquareFootage = backsplashAreaInInches/INCHES_PER_SQUARE_FOOT;

        System.out.println("Square foot is " + backsplashSquareFootage + ".");

        double tileLength = 11.75;
        double tileHeight = 11.75;

        double tileSquareFoot = (tileHeight*tileLength)/INCHES_PER_SQUARE_FOOT;

        double tilesNeeded = backsplashSquareFootage / tileSquareFoot;

        System.out.println("We need " + tilesNeeded + " tiles to complete the backsplash.");

    }
}
