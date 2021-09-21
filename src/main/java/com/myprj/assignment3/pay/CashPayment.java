/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myprj.assignment3.pay;

/**
 *
 * @author haris
 */
public class CashPayment implements StrategyPayment
{

    @Override
    public void payment(double amount)
    {
        System.out.println("The amount of " + amount + "€ was successfully paid!");
        System.out.println("\n");
    }

}
