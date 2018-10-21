public class EqualArrayCheckBrown {

    public static void main(String[] args) {

        //Wes Brown

        int[] array1 = {1,2,3,4,5};
        int[] array2 = array1;
        int[] array3 = {2,4,6,8};
        int[] array4 = {6,7,8,9,0};

        //I couldn't find a clean way to do it with different values for the variables names and boolean value
        compareArrays(array1, array2, "Arrays 1 and 2");
        compareArrays(array1, array3, "Arrays 1 and 3");
        compareArrays(array1, array4, "Arrays 1 and 4");
    }

    private static void compareArrays(int[] array1, int[] array2, String message){

        if(areArraysEqual(array1, array2)){
            System.out.println(message + " are equal.");
        } else{
            System.out.println(message + " are not equal.");
        }
    }

    private static boolean areArraysEqual(int[] array1, int[] array2){
        if(array1.length != array2.length) {return false;}

        for(int i = 0; i < array1.length; i++){
            if(array1[i] != array2[i]){
                return false;
            }
        }
        return true;
    }

}
