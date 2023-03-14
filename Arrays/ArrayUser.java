import java.util.*;

public class ArrayUser {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in); 
         System.out.println("Enter the size of the array :");
         int size = sc.nextInt();

         int array1[] = new int[size];

         for(int i=0; i<array1.length; i++){
            array1[i] = sc.nextInt();
         }

         for(int i=0; i<array1.length; i++){
            System.out.print(array1[i]+" ");
         }
    }
}