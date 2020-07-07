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
public class MoneyTransfer implements Payment {

    @Override
    public void paymentMethod(Tshirt tshirt) {
        System.out.println("Pay with Money Transfer: "
                + (tshirt.getColor().i + tshirt.getFabric().i + tshirt.getSize().i)
                + " euros");
    }

}
