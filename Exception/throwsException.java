public class throwsException {
    public static void main(String[] args) {

        Arithmetic obj = new Arithmetic();

        try {
            int sum = obj.add(5,10);
            System.out.println("Sum of two numbers is : " + sum);
        } catch (ArithmeticException eobj) {
            System.out.println(eobj);
        }
    }
}

class Arithmetic {
    public int add(int a , int b) throws ArithmeticException {
        return a + b ;
    }
}