public class exceptionDemoSolution {
  public static void main(String[] args) {
    int a = 13;
    int b = 14;

    try {
        System.out.println("The sum of two numbers is : " + (a + b ));
    } catch (ArithmeticException e) {
        // TODO: handle exception
        System.out.println(e);
    }
    catch (NullPointerException e){
        System.out.println(e);
    }
    catch(Exception e){ // This catch block is called as generalized catch block as it accepts object of Exception class . This catch block should be written at the end of all other catch blocks .
        System.out.println(e);
    }
  }
}