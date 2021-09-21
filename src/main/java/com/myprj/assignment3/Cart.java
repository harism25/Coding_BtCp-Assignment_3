/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myprj.assignment3;

import com.myprj.assignment3.domain.TShirt;
import com.myprj.assignment3.pay.StrategyPayment;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author haris
 */
public class Cart
{

    private List<TShirt> itemsForOrder;

    public void Cart()
    {
        itemsForOrder = new ArrayList<TShirt>();
    }

    public void addItem(TShirt tshirt)
    {
        if (itemsForOrder == null)
        {
            itemsForOrder = new ArrayList<TShirt>();
        }
        itemsForOrder.add(tshirt);
    }

    public void removeItem(TShirt tshirt)
    {
        itemsForOrder.remove(tshirt);
    }

    public double totalOrderCost()
    {
        double sum = 0.0;

        for (int i = 0; i < itemsForOrder.size(); i++)
        {
            sum += itemsForOrder.get(i).getPrice();
        }
        return sum;
    }

    public void executePayment(StrategyPayment paymentMethod)
    {
        double sum = 0.0;

        sum = totalOrderCost();

        paymentMethod.payment(sum);
    }
}
