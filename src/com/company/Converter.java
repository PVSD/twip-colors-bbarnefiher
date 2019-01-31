package com.company;

/**
 * Created by bb222 on 1/29/19.
 */
public class Converter {
    public Converter(String a, String conversionType){
        int theColor = Integer.parseInt(a);
        String theColorHex = toHex(theColor);

    }
    int[] toHexAnswerArray =new int[99];
    String toHexAnswer = "";
    public String toHex(int a){
        int count = 0;
        while(a / 16 != 0){

            toHexAnswerArray[count] = a % 16;
            a = a / 16;
            count++;
        }

        for (int i = 0; i < toHexAnswerArray.length; i++) {
            toHexAnswer += toHexAnswerArray[i];
        }
        return toHexAnswer;
    }

}
