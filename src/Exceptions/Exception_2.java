package Exceptions;

import java.io.FileNotFoundException;

public class Exception_2 {

    public static void main(String[] args) {

//        FileNotFoundException -- checked expection yani Compile Time

//        FileNotFoundException e = new FileNotFoundException();
//        NullPointerException b = new NullPointerException();
//        throw b;

        createUserName( "5-A lamettin" );


    }

    public static void createUserName(String name){

        String [] Rname = name.split("");
        System.out.println(Rname[0]);
        System.out.println(Rname[3]);

       // Integer i = Integer.parseInt(Rname[0]);
        //System.out.println(Rname.toString());



    }
}
