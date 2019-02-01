package com.company;
import java.util.*;

/**
 * Created by bb222 on 1/29/19.
 */
public class Converter {
    public StringBuffer theColorHex = new StringBuffer();
    public StringBuffer theColorDec = new StringBuffer();
    public Converter(String a, String conversionType){
        int theColor = -1;



        //sets theColorHex
        if (conversionType.equals("triplet")){

            int one = Integer.parseInt(a.substring(0, 3));
        //    System.out.println(toHex(one));
            theColorHex.append(toHex(one));

            int two = Integer.parseInt(a.substring(3,6));
       //    System.out.println(toHex(two));
            theColorHex.append(toHex(two));
            int three = Integer.parseInt(a.substring(6,9));
      //      System.out.println(toHex(three));
            theColorHex.append(toHex(three));
       //     System.out.println("thecolorhex = " + theColorHex.toString());
            }

        if (conversionType.equals("hexadecimal")){
            theColorDec.append( toDec(a.substring(0,2)));
            theColorDec.append( toDec(a.substring(2,4)));
            theColorDec.append( toDec(a.substring(4,6)));
        }


    }
    public String getHex(){
        return theColorHex.toString();
    }

    public String toHex(int a){
        char[] hexChars = {'0', '1' ,'2' ,'3' ,'4' ,'5' ,'6' ,'7' ,'8' ,'9' ,'A' ,'B' ,'C' ,'D' ,'E' ,'F'};
        int remainder;
        StringBuffer toHexAnswer = new StringBuffer();
        remainder = 0;
        toHexAnswer.delete(0, toHexAnswer.length());
        if (a < 16){
            return 0 + String.valueOf(a);
        }
        while(a > 0){
            remainder = a % 16;
            toHexAnswer.append(hexChars[remainder]);
            a /= 16;
        }

        return toHexAnswer.reverse().toString();
    }


    public int toDec(String a){
        int toDecAnswer = 0;
        String hexChars = "0123456789ABCDEF";
        for (int i = 0; i < a.length(); i++) {
            toDecAnswer = 16 * toDecAnswer + hexChars.indexOf(a.charAt(i));
        }
        return toDecAnswer;
    }


    public String getDec(){
        return theColorDec.toString();
    }
}
