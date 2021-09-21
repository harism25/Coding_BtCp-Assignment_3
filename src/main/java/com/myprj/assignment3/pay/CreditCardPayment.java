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
public class CreditCardPayment implements StrategyPayment
{

    private String crCardType;
    private String crCrdOwnerSrnm;
    private String crCrdOwnerNm;
    private String crCardNo;
    private String crCrdExDate;
    private String crCardCvv;

    public CreditCardPayment(String crCardType, String crCrdOwnerSrnm, String crCrdOwnerNm, String crCardNo, String crCrdExDate, String crCardCvv)
    {
        this.crCardType = crCardType;
        this.crCrdOwnerSrnm = crCrdOwnerSrnm;
        this.crCrdOwnerNm = crCrdOwnerNm;
        this.crCardNo = crCardNo;
        this.crCrdExDate = crCrdExDate;
        this.crCardCvv = crCardCvv;
    }

    public CreditCardPayment()
    {

    }

    public String getcrCardType()
    {
        return crCardType;
    }

    public void setcrCardType(String crCardType)
    {
        this.crCardType = crCardType;
    }

    public String getcrCrdOwnerSrnm()
    {
        return crCrdOwnerSrnm;
    }

    public void setcrCrdOwnerSrnm(String crCrdOwnerSrnm)
    {
        this.crCrdOwnerSrnm = crCrdOwnerSrnm;
    }

    public String getCrCrdOwnerNm()
    {
        return crCrdOwnerNm;
    }

    public void setCrCrdOwnerNm(String crCrdOwnerNm)
    {
        this.crCrdOwnerNm = crCrdOwnerNm;
    }

    public String getcrCardNo()
    {
        return crCardNo;
    }

    public void setcrCardNo(String crCardNo)
    {
        this.crCardNo = crCardNo;
    }

    public String getcrCrdExDate()
    {
        return crCrdExDate;
    }

    public void setcrCrdExDate(String crCrdExDate)
    {
        this.crCrdExDate = crCrdExDate;
    }

    public String getcrCardCvv()
    {
        return crCardCvv;
    }

    public void setcrCardCvv(String crCardCvv)
    {
        this.crCardCvv = crCardCvv;
    }

    @Override
    public void payment(double amount)
    {
        System.out.println("Your payment with credit card number: '" + this.crCardNo + "' was successful!");
        System.out.println("\n");
    }

}
