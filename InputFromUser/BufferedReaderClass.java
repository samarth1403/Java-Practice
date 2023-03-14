// import java.io.*; 

// public class BufferedReaderClass {
//     public static void main(String[] args) {
//         InputStreamReader iobj = new InputStreamReader(System.in);
//         BufferedReader bobj = new BufferedReader(iobj);
        
//         String myname = " ";
//         int age = 0;
//         float f = 0.0f;
        
//         //Must use try catch block
//         try {
//             myname = bobj.readLine();
//             age = Integer.parseInt(bobj.readLine());
//             f = Float.parseFloat(bobj.readLine());
//         } catch (IOException e) {
//             // TODO: handle exception
//         }

//         System.out.println("Name :" + myname);
//         System.out.println("Age :" + age);
//         System.out.println("F :" + f);
//     }
// }

import java.io.*;

public class BufferedReaderClass {
    public static void main(String[] args) {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);

        String myname = " ";
        int age = 0;
        try {
            myname = bobj.readLine();
            age = Integer.parseInt(bobj.readLine());
        } catch (Exception e) {
            // TODO: handle exception
        }

        System.out.println("The name is : " + myname);
        System.out.println("The age is : " + age);
    }
}