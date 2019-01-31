package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner stringReader = new Scanner(System.in);
        System.out.println("Do you want to convert an RGB triplet, hexadecimal, or a named color?\nType 'triplet', 'hexadecimal', or 'color'.");
        String userInput = stringReader.nextLine();
        String userConvert;
        String conversionType;
        if (userInput.trim().equalsIgnoreCase("triplet")){
            System.out.println("Please enter your RGB triplet in the following format:\nRRRGGGBBB\nEx: 255062001");
            userConvert = stringReader.nextLine();
            conversionType = "triplet";
            Converter color = new Converter(userConvert, conversionType);
        }
        else if (userInput.trim().equalsIgnoreCase("hexadecimal")){
            System.out.println("Please enter your hexadecimal code in the following format:\nFFFFFF\nEx: ACDC01");
            userConvert = stringReader.nextLine();
            conversionType = "hexadecimal";
            Converter color = new Converter(userConvert, conversionType);
        }
        else if (userInput.trim().equalsIgnoreCase("color")){
            System.out.println("Please enter your color name. Make sure it is one of the 140 common HTML colors.");
            userConvert = stringReader.nextLine();
            conversionType = "name";
            Converter color = new Converter(userConvert, conversionType);

        }
        else {
            System.out.println("Sorry, but I do not know what you mean.");
        }

    }
}
