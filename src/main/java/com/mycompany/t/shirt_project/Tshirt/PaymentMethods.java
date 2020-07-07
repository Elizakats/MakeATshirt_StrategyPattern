/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.t.shirt_project.Tshirt;

import com.mycompany.t.shirt_project.Tshirt.validation.CheckIntegerNumbers;
import com.mycompany.t.shirt_project.payment.Cash;
import com.mycompany.t.shirt_project.payment.CreditCard;
import com.mycompany.t.shirt_project.payment.MoneyTransfer;

/**
 *
 * @author ELIZA
 */
public class PaymentMethods {

    public PayTshirt choosePaymentMethod() {

        PayTshirt p = null;

        System.out.println("Choose the payment method by typing its number:");
        System.out.println("1.Cash");
        System.out.println("2.Credit/Debit card");
        System.out.println("3.Money Transfer");

        int choice = CheckIntegerNumbers.insertAndCheckIntNumberInARange(1, 3);

        switch (choice) {
            case 1:
                p = new PayTshirt(new Cash());
                break;
            case 2:
                p = new PayTshirt(new CreditCard());
                break;
            case 3:
                p = new PayTshirt(new MoneyTransfer());
                break;
        }
        return p;
    }

}
