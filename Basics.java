//
//

/*
 * Java Basics Topics
 * 1. Flowchart -- Graphical Solution to the Problems. Compiler always look for the main function when we run java file .
 * 2. Variables -- Container holding the data 
 * 3. Data Types -- int short long float double char byte boolean || java is typed lang We have to define data types
 * 4. Input / Output
 * 
 */
import java.util.*;
public class Basics {
    
    public static void sumOfTwoNumbers(int a , int b){
        System.out.println(a+b);
    }
    public static void areaOfCircle(int radius){
        final float PI = 3.14F;
        System.out.println(PI*radius*radius);
    }

    public static boolean isOdd(int a){
        if(a % 2 == 0){
            return false;
        }
        return true;
    }

    public static void input(int b){
        System.out.println(b);
    }

    public static void numbersfrom_1_to_10(int a){
        for(int i=1; i<=a; i++){
            System.out.println(i);
        }

        // int i = 1;
        // while( i <= a){
        //    System.out.println(i);
        //    i++;
        // }

        // int i =1 ;
        // do{
        //     System.out.println(i);
        //     i++;
        // }while(i<=0);
    }

    public static void sumOfnaturalNumbers(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum += i;
        }
        System.out.println(sum);
    }

    public static void starpattern(int n){
        for(int i=1; i<=n; i++){
            System.out.println("* * * *");
        }
    }

    public static void reverseNumber(int n){
        while(n > 0){
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n / 10;
        }
    }

    public static void reverseNumberWithoutPrint(int n){
        int num = 0;
        while(n > 0){
            int lastDigit = n % 10;
            num = num*10 + lastDigit;
            n = n/10;
        }
        System.out.println(num);
    }

    public static void onlyEvenNumbers(int n){
        for(int i=1; i<=n; i++){
            if(i%2 == 0){
                if(i==6){
                    //break;
                    continue;
                }
                System.out.println(i);
            }
        }
    }

    public static void numbersFromUser(){
        Scanner sc =  new Scanner(System.in);
        while(true){
            int a = sc.nextInt();
        }
    }

    public static boolean isPrime(int n){
        boolean isPrime = true;
            if(n == 2){
                isPrime = true;
            }
    
            else{
                for(int i=2; i<= Math.sqrt(n); i++){
                    if(n%i == 0){
                        isPrime = false;
                    }
                }
            }
        
        return isPrime;
    }

    public static void findFactorial(int n){
        int factorial = 1;
        for(int i=1; i<= n; i++){
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }

    public static void seriesOfPrimeNumbers(int n){
        for(int i=1; i<=n; i++){
            if(i==2){
               System.out.println(i);
            }
            else{
                for(int j=2; j<=Math.ceil(Math.sqrt(i)); j++){
                    if(i%j == 0){
                        break;
                    }
                    else{
                        System.out.println(i);
                        break;
                    }
                }
            }
        }
    }

    public static void binaryToDecimal(int binary){
        int decimal = 0;
        int power = 0;
        while(binary > 0){
            int lastDigit = binary % 10;
            decimal = decimal + lastDigit*(int)(Math.pow(2,power));
            binary = binary / 10;
            power++;
        }
        System.out.println(decimal);
    }

    public static void decimalToBinary(int decimal){
        int Binary = 0;
        int power = 0;
        while(decimal > 0){
            int remainder = decimal % 2;
            Binary = Binary + remainder*(int)Math.pow(10,power);
            decimal = decimal / 2;
            power++;
        }
        System.out.print(Binary);
    }

    public static void main(String[] args) {
        //sumOfTwoNumbers(5,6);
        //areaOfCircle(5);
        //isOdd(4);
        //Scanner sc = new Scanner(System.in);
        //input(a);
        //numbersfrom_1_to_10(10);
        //sumOfnaturalNumbers(5);
        //starpattern(4);
        //reverseNumber(123);
        //reverseNumberWithoutPrint(413);
        //onlyEvenNumbers(10);
        //numbersFromUser();
        // boolean isPrime = isPrime(5);
        // System.out.println(isPrime);
        //findFactorial(5);
        //seriesOfPrimeNumbers(20);
        //binaryToDecimal(1000);
        //decimalToBinary(4);
    }
}