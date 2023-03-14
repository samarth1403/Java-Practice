public class Basics {
    public static void main(String[] args) {
        // Ways of creating Single dimentional array

        // 3 types of array 1. 1D array 2. Multi D array 3. Jagged array ( New in Java)

        // int Arr2[4] = {10,20,30,40};    Explicite size is not allowed in java
        
        int arr[] = new int[3]{11,12,13,14}; //Dynamic memory allocation with initialization

        int array1[] = new int[3]; // Dynamic memory allocatrion
        array1[0] = 11;
        array1[1] = 12;
        array1[2] = 13;

        int array2[][] = new int[4][3];
        int array3[] = {1,2,3,4,5};
        String array4[] = {"Hello" , "World"}
    }
}