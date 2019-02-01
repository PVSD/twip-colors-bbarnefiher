package com.company;
import javax.swing.text.html.HTML;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {


        HTMLColors AliceBlue = new HTMLColors(0, "AliceBlue", "F0F8FF");
        HTMLColors AntiqueWhite = new HTMLColors(1, "AntiqueWhite", "FAEBD7");
        HTMLColors Aqua = new HTMLColors(2, "Aqua", "00FFFF");
        HTMLColors Aquamarine = new HTMLColors(3, "Aquamarine", "7FFFD4");
        HTMLColors Azure = new HTMLColors(4, "Azure", "F0FFFF");
        HTMLColors Beige = new HTMLColors(5, "Beige", "F5F5DC");
        HTMLColors Bisque = new HTMLColors(6, "Bisque", "FFE4C4");
        HTMLColors Black = new HTMLColors(7, "Black", "000000");
        HTMLColors BlanchedAlmond = new HTMLColors(8, "BlanchedAlmond", "FFEBCD");
        HTMLColors Blue = new HTMLColors(9, "Blue", "0000FF");
        HTMLColors BlueViolet = new HTMLColors(10, "BlueViolet", "8A2BE2");
        HTMLColors Brown = new HTMLColors(11, "Brown", "A52A2A");
        HTMLColors BurlyWood = new HTMLColors(12, "BurlyWood", "DEB887");
        HTMLColors CadetBlue = new HTMLColors(13, "CadetBlue", "5F9EA0");
        HTMLColors Chartreuse = new HTMLColors(14, "Chartreuse", "7FFF00");
        HTMLColors Chocolate = new HTMLColors(15, "Chocolate", "D2691E");
        HTMLColors Coral = new HTMLColors(16, "Coral", "FF7F50");
        HTMLColors CornflowerBlue = new HTMLColors(17, "CornflowerBlue", "6495ED");
        HTMLColors Cornsilk = new HTMLColors(18, "Cornsilk", "FFF8DC");
        HTMLColors Crimson = new HTMLColors(19, "Crimson", "DC143C");
        HTMLColors Cyan = new HTMLColors(20, "Cyan", "00FFFF");
        HTMLColors DarkBlue = new HTMLColors(21, "DarkBlue", "00008B");
        HTMLColors DarkCyan = new HTMLColors(22, "DarkCyan", "008B8B");
        HTMLColors DarkGoldenRod = new HTMLColors(23, "DarkGoldenRod", "B8860B");
        HTMLColors DarkGray = new HTMLColors(24, "DarkGray", "A9A9A9");
        HTMLColors DarkGreen = new HTMLColors(25, "DarkGreen", "006400");
        HTMLColors DarkKhaki = new HTMLColors(26, "DarkKhaki", "BDB76B");
        HTMLColors DarkMagenta = new HTMLColors(27, "DarkMagenta", "8B008B");
        HTMLColors DarkOliveGreen = new HTMLColors(28, "DarkOliveGreen", "556B2F");
        HTMLColors DarkOrange = new HTMLColors(29, "DarkOrange", "FF8C00");
        HTMLColors DarkOrchid = new HTMLColors(30, "DarkOrchid", "9932CC");
        HTMLColors DarkRed = new HTMLColors(31, "DarkRed", "8B0000");
        HTMLColors DarkSalmon = new HTMLColors(32, "DarkSalmon", "E9967A");
        HTMLColors DarkSeaGreen = new HTMLColors(33, "DarkSeaGreen", "8FBC8F");
        HTMLColors DarkSlateBlue = new HTMLColors(34, "DarkSlateBlue", "483D8B");
        HTMLColors DarkSlateGray = new HTMLColors(35, "DarkSlateGray", "2F4F4F");
        HTMLColors DarkTurquoise = new HTMLColors(36, "DarkTurquoise", "00CED1");
        HTMLColors DarkViolet = new HTMLColors(37, "DarkViolet", "9400D3");
        HTMLColors DeepPink = new HTMLColors(38, "DeepPink", "FF1493");
        HTMLColors DeepSkyBlue = new HTMLColors(39, "DeepSkyBlue", "00BFFF");
        HTMLColors DimGray = new HTMLColors(40, "DimGray", "696969");
        HTMLColors DodgerBlue = new HTMLColors(41, "DodgerBlue", "1E90FF");
        HTMLColors FireBrick = new HTMLColors(42, "FireBrick", "B22222");
        HTMLColors FloralWhite = new HTMLColors(43, "FloralWhite", "FFFAF0");
        HTMLColors ForestGreen = new HTMLColors(44, "ForestGreen", "228B22");
        HTMLColors Fuchsia = new HTMLColors(45, "Fuchsia", "FF00FF");
        HTMLColors Gainsboro = new HTMLColors(46, "Gainsboro", "DCDCDC");
        HTMLColors GhostWhite = new HTMLColors(47, "GhostWhite", "F8F8FF");
        HTMLColors Gold = new HTMLColors(48, "Gold", "FFD700");
        HTMLColors GoldenRod = new HTMLColors(49, "GoldenRod", "DAA520");
        HTMLColors Gray = new HTMLColors(50, "Gray", "808080");
        HTMLColors Green = new HTMLColors(51, "Green", "008000");
        HTMLColors GreenYellow = new HTMLColors(52, "GreenYellow", "ADFF2F");
        HTMLColors HoneyDew = new HTMLColors(53, "HoneyDew", "F0FFF0");
        HTMLColors HotPink = new HTMLColors(54, "HotPink", "FF69B4");
        HTMLColors IndianRed = new HTMLColors(55, "IndianRed", "CD5C5C");
        HTMLColors Indigo = new HTMLColors(56, "Indigo", "4B0082");
        HTMLColors Ivory = new HTMLColors(57, "Ivory", "FFFFF0");
        HTMLColors Khaki = new HTMLColors(58, "Khaki", "F0E68C");
        HTMLColors Lavender = new HTMLColors(59, "Lavender", "E6E6FA");
        HTMLColors LavenderBlush = new HTMLColors(60, "LavenderBlush", "FFF0F5");
        HTMLColors LawnGreen = new HTMLColors(61, "LawnGreen", "7CFC00");
        HTMLColors LemonChiffon = new HTMLColors(62, "LemonChiffon", "FFFACD");
        HTMLColors LightBlue = new HTMLColors(63, "LightBlue", "ADD8E6");
        HTMLColors LightCoral = new HTMLColors(64, "LightCoral", "F08080");
        HTMLColors LightCyan = new HTMLColors(65, "LightCyan", "E0FFFF");
        HTMLColors LightGoldenRodYellow = new HTMLColors(66, "LightGoldenRodYellow", "FAFAD2");
        HTMLColors LightGray = new HTMLColors(67, "LightGray", "D3D3D3");
        HTMLColors LightGreen = new HTMLColors(68, "LightGreen", "90EE90");
        HTMLColors LightPink = new HTMLColors(69, "LightPink", "FFB6C1");
        HTMLColors LightSalmon = new HTMLColors(70, "LightSalmon", "FFA07A");
        HTMLColors LightSeaGreen = new HTMLColors(71, "LightSeaGreen", "20B2AA");
        HTMLColors LightSkyBlue = new HTMLColors(72, "LightSkyBlue", "87CEFA");
        HTMLColors LightSlateGray = new HTMLColors(73, "LightSlateGray", "778899");
        HTMLColors LightSteelBlue = new HTMLColors(74, "LightSteelBlue", "B0C4DE");
        HTMLColors LightYellow = new HTMLColors(75, "LightYellow", "FFFFE0");
        HTMLColors Lime = new HTMLColors(76, "Lime", "00FF00");
        HTMLColors LimeGreen = new HTMLColors(77, "LimeGreen", "32CD32");
        HTMLColors Linen = new HTMLColors(78, "Linen", "FAF0E6");
        HTMLColors Magenta = new HTMLColors(79, "Magenta", "FF00FF");
        HTMLColors Maroon = new HTMLColors(80, "Maroon", "800000");
        HTMLColors MediumAquaMarine = new HTMLColors(81, "MediumAquaMarine", "66CDAA");
        HTMLColors MediumBlue = new HTMLColors(82, "MediumBlue", "0000CD");
        HTMLColors MediumOrchid = new HTMLColors(83, "MediumOrchid", "BA55D3");
        HTMLColors MediumPurple = new HTMLColors(84, "MediumPurple", "9370DB");
        HTMLColors MediumSeaGreen = new HTMLColors(85, "MediumSeaGreen", "3CB371");
        HTMLColors MediumSlateBlue = new HTMLColors(86, "MediumSlateBlue", "7B68EE");
        HTMLColors MediumSpringGreen = new HTMLColors(87, "MediumSpringGreen", "00FA9A");
        HTMLColors MediumTurquoise = new HTMLColors(88, "MediumTurquoise", "48D1CC");
        HTMLColors MediumVioletRed = new HTMLColors(89, "MediumVioletRed", "C71585");
        HTMLColors MidnightBlue = new HTMLColors(90, "MidnightBlue", "191970");
        HTMLColors MintCream = new HTMLColors(91, "MintCream", "F5FFFA");
        HTMLColors MistyRose = new HTMLColors(92, "MistyRose", "FFE4E1");
        HTMLColors Moccasin = new HTMLColors(93, "Moccasin", "FFE4B5");
        HTMLColors NavajoWhite = new HTMLColors(94, "NavajoWhite", "FFDEAD");
        HTMLColors Navy = new HTMLColors(95, "Navy", "000080");
        HTMLColors OldLace = new HTMLColors(96, "OldLace", "FDF5E6");
        HTMLColors Olive = new HTMLColors(97, "Olive", "808000");
        HTMLColors OliveDrab = new HTMLColors(98, "OliveDrab", "6B8E23");
        HTMLColors Orange = new HTMLColors(99, "Orange", "FFA500");
        HTMLColors OrangeRed = new HTMLColors(100, "OrangeRed", "FF4500");
        HTMLColors Orchid = new HTMLColors(101, "Orchid", "DA70D6");
        HTMLColors PaleGoldenRod= new HTMLColors(102, "PaleGoldenRod", "EEE8AA");
        HTMLColors PaleGreen= new HTMLColors(103, "PaleGreen", "98FB98");
        HTMLColors PaleTurquoise = new HTMLColors(104, "PaleTurquoise", "AFEEEE");
        HTMLColors PaleVioletRed = new HTMLColors(105, "PaleVioletRed", "DB7093");
        HTMLColors PapayaWhip = new HTMLColors(106, "PapayaWhip", "FFEFD5");
        HTMLColors PeachPuff = new HTMLColors(107, "PeachPuff", "FFDAB9");
        HTMLColors Peru = new HTMLColors(108, "Peru", "CD853F");
        HTMLColors Pink = new HTMLColors(109, "Pink", "FFC0CB");
        HTMLColors Plum = new HTMLColors(110, "Plum", "DDA0DD");
        HTMLColors PowderBlue = new HTMLColors(111, "PowderBlue", "B0E0E6");
        HTMLColors Purple = new HTMLColors(112, "Purple", "800080");
        HTMLColors RebeccaPurple = new HTMLColors(113, "RebeccaPurple", "663399");
        HTMLColors Red = new HTMLColors(114, "Red", "FF0000");
        HTMLColors RosyBrown = new HTMLColors(115, "RosyBrown", "BC8F8F");
        HTMLColors RoyalBlue = new HTMLColors(116, "RoyalBlue", "4169E1");
        HTMLColors SaddleBrown = new HTMLColors(117, "SaddleBrown", "8B4513");
        HTMLColors Salmon = new HTMLColors(118, "Salmon", "FA8072");
        HTMLColors SandyBrown = new HTMLColors(119, "SandyBrown", "F4A460");
        HTMLColors SeaGreen = new HTMLColors(120, "SeaGreen", "2E8B57");
        HTMLColors SeaShell = new HTMLColors(121, "SeaShell", "FFF5EE");
        HTMLColors Sienna = new HTMLColors(122, "Sienna", "A0522D");
        HTMLColors Silver = new HTMLColors(123, "Silver", "C0C0C0");
        HTMLColors SkyBlue = new HTMLColors(124, "SkyBlue", "87CEEB");
        HTMLColors SlateBlue = new HTMLColors(125, "SlateBlue", "6A5ACD");
        HTMLColors SlateGray = new HTMLColors(126, "SlateGray", "708090");
        HTMLColors Snow = new HTMLColors(127, "Snow", "FFFAFA");
        HTMLColors SpringGreen = new HTMLColors(128, "SpringGreen", "00FF7F");
        HTMLColors SteelBlue = new HTMLColors(129, "SteelBlue", "4682B4");
        HTMLColors Tan = new HTMLColors(130, "Tan", "D2B48C");
        HTMLColors Teal = new HTMLColors(131, "Teal", "008080");
        HTMLColors Thistle = new HTMLColors(132, "Thistle", "D8BFD8");
        HTMLColors Tomato = new HTMLColors(133, "Tomato", "FF6347");
        HTMLColors Turquoise = new HTMLColors(134, "Turquoise", "40E0D0");
        HTMLColors Violet = new HTMLColors(135, "Violet", "EE82EE");
        HTMLColors Wheat = new HTMLColors(136, "Wheat", "F5DEB3");
        HTMLColors White = new HTMLColors(137, "White", "FFFFFF");
        HTMLColors WhiteSmoke = new HTMLColors(138, "WhiteSmoke", "F5F5F5");
        HTMLColors Yellow = new HTMLColors(139, "Yellow", "FFFF00");
        HTMLColors YellowGreen = new HTMLColors(140, "YellowGreen", "9ACD32");


        HTMLColors[] AllColors = {AliceBlue, AntiqueWhite, Aqua, Aquamarine, Azure, Beige, Bisque, Black, BlanchedAlmond, Blue, BlueViolet, Brown, BurlyWood, CadetBlue, Chartreuse, Chocolate, Coral, CornflowerBlue, Cornsilk, Crimson, Cyan, DarkBlue, DarkCyan, DarkGoldenRod, DarkGray, DarkGreen, DarkKhaki, DarkMagenta, DarkOliveGreen, DarkOrange, DarkOrchid, DarkRed, DarkSalmon, DarkSeaGreen, DarkSlateBlue, DarkSlateGray, DarkTurquoise, DarkViolet, DeepPink, DeepSkyBlue, DimGray, DodgerBlue, FireBrick, FloralWhite, ForestGreen, Fuchsia, Gainsboro, GhostWhite, Gold, GoldenRod, Gray, Green, GreenYellow, HoneyDew, HotPink, IndianRed, Indigo, Ivory, Khaki, Lavender, LavenderBlush, LawnGreen, LemonChiffon, LightBlue, LightCoral, LightCyan, LightGoldenRodYellow, LightGray, LightGreen, LightPink, LightSalmon, LightSeaGreen, LightSkyBlue, LightSlateGray, LightSteelBlue, LightYellow, Lime, LimeGreen, Linen, Magenta, Maroon, MediumAquaMarine, MediumBlue, MediumOrchid, MediumPurple, MediumSeaGreen, MediumSlateBlue, MediumSpringGreen, MediumTurquoise, MediumVioletRed, MidnightBlue, MintCream, MistyRose, Moccasin, NavajoWhite, Navy, OldLace, Olive, OliveDrab, Orange, OrangeRed, Orchid, PaleGoldenRod, PaleGreen, PaleTurquoise, PaleVioletRed, PapayaWhip, PeachPuff, Peru, Pink, Plum, PowderBlue, Purple, RebeccaPurple, Red, RosyBrown, RoyalBlue, SaddleBrown, Salmon, SandyBrown, SeaGreen, SeaShell, Sienna, Silver, SkyBlue, SlateBlue, SlateGray, Snow, SpringGreen, SteelBlue, Tan, Teal, Thistle, Tomato, Turquoise, Violet, Wheat, White, WhiteSmoke, Yellow, YellowGreen};

        

        Scanner stringReader = new Scanner(System.in);
        System.out.println("Do you want to convert an RGB triplet, hexadecimal, or a named color?\nType 'triplet', 'hexadecimal', or 'color'.");
        String userInput = stringReader.nextLine();
        String userConvert;
        String conversionType;

        Converter color = null;

        if (userInput.trim().equalsIgnoreCase("triplet")){
            System.out.println("Please enter your RGB triplet in the following format:\nRRRGGGBBB\nEx: 255062001");
            userConvert = stringReader.nextLine();
            conversionType = "triplet";
            color = new Converter(userConvert, conversionType);
            System.out.println("Hexadecimal value: " + color.getHex());

            for (int i = 0; i < AllColors.length; i++) {
                Converter temp = new Converter(AllColors[i].getHex(), "hexadecimal");
                if (userConvert.equals(temp.getDec())){
                    System.out.println("Your color is one of the 140 HTML colors! It is: " + AllColors[i].getName());
                }
                else {
                    System.out.println("Your color is not one of the 140 HTML colors.");
                }
            }


        }
        else if (userInput.trim().equalsIgnoreCase("hexadecimal")){
            System.out.println("Please enter your hexadecimal code in the following format:\nRRGGBB\nEx: ACDC01");
            userConvert = stringReader.nextLine().toUpperCase();
            conversionType = "hexadecimal";
            color = new Converter(userConvert, conversionType);
            System.out.println("Decimal value: " + color.getDec());

            for (int i = 0; i < AllColors.length; i++) {
                if (userConvert.toUpperCase().equals(AllColors[i].getHex())){
                    System.out.println("Your color is one of the 140 HTML colors! It is: " + AllColors[i].getName());
                }
                else {
                    System.out.println("Your color is not one of the 140 HTML colors.");
                }
            }

        }
        else if (userInput.trim().equalsIgnoreCase("color")){
            System.out.println("Please enter your color name. Make sure it is one of the 140 common HTML colors.");
            userConvert = stringReader.nextLine();
            conversionType = "name";
            for (int i = 0; i < AllColors.length; i++) {
                if (userConvert.equalsIgnoreCase(AllColors[i].getName())) {
                    System.out.println("Hexadecimal value: " + AllColors[i].getHex());
                    Converter temp = new Converter(AllColors[i].getHex(), "hexadecimal");
                    System.out.println("Decimal value: " + temp.getDec());
                    System.exit(0);
                }

            }
            System.out.println("That is not one of the 140 HTML colors.");

        }
        else {
            System.out.println("Sorry, but I do not know what you mean.");
        }

    }
}
