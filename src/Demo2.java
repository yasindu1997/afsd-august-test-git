//plug scanner

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {

        //scanner setup
        Scanner scan = new Scanner(System.in);

        //scan.next();

        byte val1 = 34;
        short val2 = 56;
        int val3 = 12;
        long val4 = 78;

        float val5 = 2.56f;
        double val6 = 7.89;

        char val7 = 'A';

        boolean val8 = false;

        String val9 = "Yasindu";

        /// ///////////////////////

        //conversion
        byte num3 = 13;

        int num4 = num3;

        /// ////////////////

        //casting
        int num5 = 67;

        short num6 = (short) num5;

        /// /////////////////////////

        int value1 = 132;
        byte value2 = (byte) value1;
        System.out.println(value2);

        /// /////////////////

        char val12 = 'A';
        int val13 = val12;

        System.out.println(val13);

        /// //////////////////

        int val14 = 65;
        char val15 = (char) val14;
        System.out.println(val15);

        /// ////////////////////

        //if, else, elseif, switch ---> flow controllers

        //>, <, >=, <=, ==, != -----> relational operators

        //true, false, a statement that generates true or false

        int age = 18;

        if(age>18){
            System.out.println("Hello....");
        }

        if(age>18){
            System.out.println("Hello....");
        }else{
            System.out.println("Call police...");
        }

        if(age>18){
            System.out.println("Hello....");
        }else if(age>15){
            System.out.println("hiiii....");
        }else if(age>12){
            System.out.println("yasindu....");
        }else {
            System.out.println("Call police...");
        }


    }
}
