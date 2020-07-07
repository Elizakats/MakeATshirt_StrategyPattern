/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.t.shirt_project.application;

import com.mycompany.t.shirt_project.Tshirt.CreateTshirt;
import com.mycompany.t.shirt_project.Tshirt.Tshirt;
import com.mycompany.t.shirt_project.Tshirt.PayTshirt;
import com.mycompany.t.shirt_project.Tshirt.PaymentMethods;
import com.mycompany.t.shirt_project.enums.Color;
import com.mycompany.t.shirt_project.enums.Fabric;
import com.mycompany.t.shirt_project.enums.Size;
import com.mycompany.t.shirt_project.payment.Cash;

/**
 *
 * @author ELIZA
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Hello! Make your T-Shirt!");
        //Make a Tshirt with user's inputs
        CreateTshirt t = new CreateTshirt();
        Color color = t.chooseColor();
        Fabric fabric = t.chooseFabric();
        Size size = t.chooseSize();

        Tshirt tshirt = new Tshirt(color, fabric, size);
        
        //Ask user the payment method and print the total price
        PaymentMethods pay= new PaymentMethods();
        pay.choosePaymentMethod().tshirtPrice(tshirt);



    }

}
