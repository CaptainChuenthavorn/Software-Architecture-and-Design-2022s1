//63010124 Chakkapat Chuenthavorn
package com.solid.lsp;

import java.awt.*;

public class Main {

    private static final int width = 4;
    private static final int height = 5;

    public static void main(String[] args) {
        //call Shape class instead Rectangle class
        Shape reg1 = new Rectangle(width, height);
        System.out.println("==== Rectangle ====");
        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
        System.out.println("Area = " + reg1.getArea());
        //call Shape class instead Rectangle class
        //pass initiate width to parameter first
        Shape reg2 = new Square(width);
        System.out.println("====   Square  ====");
        System.out.println("Width = " + width);
        System.out.println("Area = " + reg2.getArea());
        //set new height to square to print Area out
        reg2.setHeight(height);
        System.out.println("Height = " + height);
        System.out.println("Area = " + reg2.getArea());
    }
}
