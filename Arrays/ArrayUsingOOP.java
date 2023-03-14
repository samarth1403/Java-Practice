// import java.util.*;

// class ArrayX {
//     Scanner sc = new Scanner(System.in);

//     int size;
//     int array1[];

//     public void createArray(){
//         System.out.println("Enter the size of the array : ");
//         this.size = sc.nextInt();
//         this.array1 = new int[this.size];
//     }

//     public void enterElements(){
//         System.out.println("Enter the elements in the array : ");
//         for(int i=0; i<array1.length; i++){
//             this.array1[i] = sc.nextInt();
//         }
//     }

//     public void displayElements(){
//         System.out.print("Elements in the array are : ");
//         for(int i=0; i<this.array1.length; i++){
//             System.out.print(this.array1[i]+" ");
//         }
//     }

//     public int additionOfElements(){
//         int sum = 0;
//         System.out.print("Addition of all elements of array is : ");
//         for(int i=0; i<this.array1.length; i++){
//            sum += this.array1[i];
//         }
//         return sum;
//     }
// }

// // You can keep only one class as public and your file name should be same
// public class ArrayUsingOOP {
//     public static void main(String[] args) {
//         ArrayX arr = new ArrayX();
//         arr.createArray();
//         arr.enterElements();
//         arr.displayElements();
//         int sum = arr.additionOfElements();
//         System.out.print(sum);
//     }
// }

import java.util.*;

public class ArrayUsingOOP {
    public static void main(String[] args) {
        ArrayOOP a = new ArrayOOP();
        System.out.print("Enter the size of Array : ");
        a.enterSize();
        a.createArray();
        a.enterElements();
        a.displayElements();
    }
}

class ArrayOOP {

    Scanner sc = new Scanner(System.in);

    int size;
    int[] arr;
    public void enterSize(){

        this.size = sc.nextInt();
    }

    public void createArray(){
        this.arr = new int[this.size];
    }

    public void enterElements(){
        System.out.println("Enter the elements of Array : ");
        for(int i=0; i<this.arr.length; i++){
            
            this.arr[i] = sc.nextInt();
        }
    }

    public void displayElements(){
        for(int i=0; i<this.arr.length; i++){
           System.out.print(  this.arr[i] + " ");
        }
    }
}