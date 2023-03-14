public class typesOfInheritance {
    public static void main(String[] args) {
        B b1 = new B();
        //System.out.println(b1.a);

        C c1 = new C();
        //System.out.println(c1.a);

        D d1 = new D();
        //System.out.println(d1.a);
        System.out.println(c1.e);
    }
}

class A {
    int a = 10;
}

class B extends A { // Single level Inheritance
    int b = 20;
}

class C extends B { // Multi level Inheritance
    int c = 30;
}

class D extends A { // Herarchial inheritance
    int d = 40;
}

class D extends E { // Multiple inheritance which is not allowed in java as it gives ambiguity error
    
} 

class E {
    int e = 20;
}
