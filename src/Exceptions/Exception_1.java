package Exceptions;

import java.util.Arrays;

public class Exception_1 {

    public static void main(String[] args) {

        try {
        System.out.println("Program started ");
//        String[] s = new String[]{"a", "b", "c"};
//        System.out.println(s[34]);
            String n = null;
            System.out.println(n.length());

         }catch (ArrayIndexOutOfBoundsException aiob){
            System.out.println("OutOFBound Exception" );
         }catch (NullPointerException e){
            System.out.println("Null exception");

         }finally {
            System.out.println("finally block ");

        }


    //    System.out.println("program ended ");

        // throw new ArrayIndexOutOfBoundsException();


//        System.out.println(s.length());

        NullPointerException npe = new NullPointerException();





    }
}
