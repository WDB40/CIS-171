public class MultiplicationTableBrown {

    private static final int ROW_COUNT = 12;
    private static final int ROW_START = 1;
    private static final int COL_COUNT = 12;
    private static final int COL_START = 1;

    public static void main(String[] args) {

        for(int row = ROW_START; row <= ROW_COUNT; row++){
            for(int col = COL_START; col <= COL_COUNT; col++){
                System.out.printf("%4d", row*col);
            }
            System.out.println();
        }

    }
}
