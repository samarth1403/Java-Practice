class Employee implements Cloneable {
    public int age;

    public Employee(int age){
        this.age = age;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class cloneMethod {
    public static void main(String[] args) {
        try{
            Employee e1 = new Employee(23);
        Employee e2 = (Employee)e1.clone();
        System.out.println("age of e1 : " + e1.age);
        System.out.println("age of e2 : " + e2.age);
        e1.age = 20;
        System.out.println("age of e1 : " + e1.age);
        System.out.println("age of e2 : " + e2.age);
        }
        catch(CloneNotSupportedException e){
            System.out.println(e);
        }
    }
}