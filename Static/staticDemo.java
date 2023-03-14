public class staticDemo {
    static {
        System.out.println("Inside a static block of a class which contains a main function");
    }

    public staticDemo(){
        System.out.println("Inside a constructor of staticDemo class");
    }
    public static void main(String[] args) {
        System.out.println("Inside a main function");
        System.out.println("The static variable No1 is"+ Demo.No1);
        Demo.gun();
        Demo obj1 = new Demo();

        System.out.println("The non static variable No1 is"+ obj1.No1);
        obj1.fun();

    }
}

class Demo {
    public static int No1;
    public int No2;

    static                   // static block
    {
         System.out.println("Inside static block of Demo class");
         No1 = 51;
    } 

    public Demo()              // Constructor
     {
          System.out.println("Inside constructor");
          No2 = 21;
     }

     public void fun(){
         // Non static method can access static as well as non static data
          // We can use this keyword
        System.out.println("Inside a non-static method fun");
        System.out.println("Value of static variable No1 :" + this.No1);
        System.out.println("Value of non-static variable No2 :" + this.No2);
     }

    public static void gun(){
        // Ststic method can access only static data
          // We cant use this keyword
         System.out.println("Inside static method gun");
         System.out.println("Value of static variable No1 : "+ No1);
    }




}