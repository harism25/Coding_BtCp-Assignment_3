/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myprj.assignment3.util;

import com.myprj.assignment3.domain.Color;
import com.myprj.assignment3.domain.Fabric;
import com.myprj.assignment3.domain.Size;
import java.util.Random;

/**
 *
 * @author haris
 */
public class ItemGenerator
{

    public ItemGenerator()
    {

    }

    public Color randomColor()
    {
        Random random = new Random();

        Color randomColor;
        randomColor = Color.values()[random.nextInt(Color.values().length)];
        return randomColor;
    }

    public Size randomSize()
    {
        Random random = new Random();

        Size randomSize;
        randomSize = Size.values()[random.nextInt(Size.values().length)];
        return randomSize;
    }

    public Fabric randomFabric()
    {
        Random random = new Random();

        Fabric randomFabric;
        randomFabric = Fabric.values()[random.nextInt(Fabric.values().length)];
        return randomFabric;
    }

}
