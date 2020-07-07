/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.t.shirt_project.Tshirt;

import com.mycompany.t.shirt_project.payment.Payment;

/**
 *
 * @author ELIZA
 */
public class PayTshirt {
    
     private Payment payment;

    
    public PayTshirt (Payment payment){
        this.payment=payment;
    }
    
    public void tshirtPrice(Tshirt tshirt){
         payment.paymentMethod(tshirt);
    };
}
