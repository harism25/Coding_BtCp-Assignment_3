/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myprj.assignment3.domain;

import java.text.DecimalFormat;


/**
 *
 * @author haris
 */
public class TShirt
{

    private Color Color;
    private Size Size;
    private Fabric Fabric;
    private double price;

    public TShirt(Color Color, Size Size, Fabric Fabric)
    {
        this.Color = Color;
        this.Size = Size;
        this.Fabric = Fabric;
        this.price = 15 + (double)(this.getColor().ordinal() * 0.5)
                + (double)(this.getSize().ordinal() * 0.9)
                + (double)(this.getFabric().ordinal() * 1.4);
    }

    public TShirt()
    {

    }

    public Color getColor()
    {
        return Color;
    }

    public void setColor(Color Color)
    {
        this.Color = Color;
    }

    public Size getSize()
    {
        return Size;
    }

    public void setSize(Size Size)
    {
        this.Size = Size;
    }

    public Fabric getFabric()
    {
        return Fabric;
    }

    public void setFabric(Fabric Fabric)
    {
        this.Fabric = Fabric;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("TShirt: | Color :  ").append(Color);
        sb.append(("\n") + "        | Size :  ").append(Size);
        sb.append(("\n") + "        | Fabric :  ").append(Fabric);
        sb.append(("\n") + "        | Price :  ").append(new DecimalFormat("#.##").format(price));
        sb.append(" \n");
        return sb.toString();
    }

}
