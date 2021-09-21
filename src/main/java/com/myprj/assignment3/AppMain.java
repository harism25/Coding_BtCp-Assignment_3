/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myprj.assignment3;

import com.myprj.assignment3.domain.TShirt;
import com.myprj.assignment3.pay.BankTransfer;
import com.myprj.assignment3.pay.CashPayment;
import com.myprj.assignment3.pay.CreditCardPayment;
import com.myprj.assignment3.util.ItemGenerator;

/**
 *
 * @author haris
 */
public class AppMain
{

    public static void main(String[] args)
    {
        
        
        Cart shopCart = new Cart();
        
        
        ItemGenerator gnrtr = new ItemGenerator();
        TShirt tsrt = new TShirt(gnrtr.randomColor(), gnrtr.randomSize(), gnrtr.randomFabric());
        
        System.out.println(tsrt.toString());

        
        shopCart.addItem(tsrt);
        shopCart.executePayment(new CashPayment());
        shopCart.executePayment(new CreditCardPayment("MASTERCARD", "Marentakis",
                "Haris", "5566 9988 2266 4400", "09/2022", "007"));
        shopCart.executePayment(new BankTransfer("Papadopoulos", "Nikos", "Markou",
                "Michael", "Eurobank", "Ethniki", "GR6245551108799966630311",
                "GR5511096663031162458799", "Euro/442", "Ethn/795"));
    }
}
