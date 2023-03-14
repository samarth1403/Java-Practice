// userdefined exception class always inherits the Exception class
public class userdefinedException {
    public static void main(String[] args) {
        int age = 16;

        try {
            if(age < 15){
                AgeInvalidException aobj = new AgeInvalidException("Your age is not valid");
                throw aobj;
            }
            else {
                System.out.println("Your age is valid")
            }
        } catch ( AgeInvalidException aobj ) {
            // TODO: handle exception
            System.out.println(aobj);
        }

    
    }
}

class AgeInvalidException extends Exception {
    AgeInvalidException(String str){
        super(str);
    }
}