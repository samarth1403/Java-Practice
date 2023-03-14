public class equalsMethod {
    public static void main(String[] args) {
        String a = "Samarth Ikkalaki";
        String b = "Samarth Ikkalaki";
        //System.out.println(a.equals(b)); // equals method compares the actual data of two objects
        
        System.out.println(a == b); // "==" operator will compares the hashcodes of two objects
        // Thus for comparison equals method is the better option
        System.out.println("Hashcode of a : "+a.hashCode());  
        System.out.println("Hashcode of b : "+b.hashCode()); 
    }
}