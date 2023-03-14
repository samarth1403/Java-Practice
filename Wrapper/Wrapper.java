public class Wrapper {
    public static void main(String[] args) {
        int a = 10;
        Integer iobj = new Integer(a); // Boxing == conversion of primitive dataa type into its wrapper class
        System.out.println(a);
        System.out.println(iobj);

        int x = iobj;       // Unboxing - Converting Wrapper to premitive datatype
        System.out.println(x);
    }
}