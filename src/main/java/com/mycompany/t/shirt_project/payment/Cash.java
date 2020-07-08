/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.t.shirt_project.payment;

import com.mycompany.t.shirt_project.Tshirt.Tshirt;

/**
 *
 * @author ELIZA
 */
public class Cash implements Payment {

    @Override
    public void paymentMethod(Tshirt tshirt) {
        System.out.println("Pay with cash: "
                + (tshirt.getColor().cost + tshirt.getFabric().cost + tshirt.getSize().cost)
                + " euros");
    }

}
