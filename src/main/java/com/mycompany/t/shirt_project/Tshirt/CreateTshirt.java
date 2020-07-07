/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.t.shirt_project.Tshirt;

import com.mycompany.t.shirt_project.Tshirt.validation.CheckIntegerNumbers;
import com.mycompany.t.shirt_project.enums.Color;
import com.mycompany.t.shirt_project.enums.Fabric;
import com.mycompany.t.shirt_project.enums.Size;

/**
 *
 * @author ELIZA
 */
public class CreateTshirt {

    public Color chooseColor() {
        Color color = null;

        System.out.println("Choose Color by typing its number:");
        System.out.println("1.Red");
        System.out.println("2.Orange");
        System.out.println("3.Yellow");
        System.out.println("4.Green");
        System.out.println("5.Blue");
        System.out.println("6.Indigo");
        System.out.println("7.Violet");

        int choice = CheckIntegerNumbers.insertAndCheckIntNumberInARange(1, 7);

        switch (choice) {
            case 1:
                color = color.RED;
                break;
            case 2:
                color = color.ORANGE;
                break;
            case 3:
                color = color.YELLOW;
                break;
            case 4:
                color = color.GREEN;
                break;
            case 5:
                color = color.BLUE;
                break;
            case 6:
                color = color.INDIGO;
                break;
            case 7:
                color = color.VIOLET;
                break;
        }
        return color;
    }
    
     public Fabric chooseFabric() {
        Fabric fabric = null;

        System.out.println("Choose Fabric by typing its number:");
        System.out.println("1.Wool");
        System.out.println("2.Cotton");
        System.out.println("3.Polyester");
        System.out.println("4.Rayon");
        System.out.println("5.Linen");
        System.out.println("6.Chashmere");
        System.out.println("7.Silk");

        int choice = CheckIntegerNumbers.insertAndCheckIntNumberInARange(1, 7);

        switch (choice) {
            case 1:
                fabric = fabric.WOOL;
                break;
            case 2:
                fabric = fabric.COTTON;
                break;
            case 3:
                fabric = fabric.POLYESTER;
                break;
            case 4:
                fabric = fabric.RAYON;
                break;
            case 5:
                fabric = fabric.LINEN;
                break;
            case 6:
                fabric = fabric.CASHMERE;
                break;
            case 7:
                fabric = fabric.SILK;
                break;
        }
        return fabric;
    }
     
     public Size chooseSize() {
        Size size = null;

        System.out.println("Choose Size by typing its number:");
        System.out.println("1.XS");
        System.out.println("2.S");
        System.out.println("3.M");
        System.out.println("4.L");
        System.out.println("5.XL");
        System.out.println("6.XXL");
        System.out.println("7.XXXL");

        int choice = CheckIntegerNumbers.insertAndCheckIntNumberInARange(1, 7);

        switch (choice) {
            case 1:
                size= size.XS;
                break;
            case 2:
                size= size.S;
                break;
            case 3:
                size= size.M;
                break;
            case 4:
                size= size.L;
                break;
            case 5:
                size= size.XL;
                break;
            case 6:
                size= size.XXL;
                break;
            case 7:
                size= size.XXXL;
                break;
        }
        return size;
    }

}
