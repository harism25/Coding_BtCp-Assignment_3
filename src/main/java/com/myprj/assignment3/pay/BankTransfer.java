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
public class BankTransfer implements StrategyPayment
{
    
    private String acntHolderSndrSrnm;
    private String acntHolderSndrNm;
    private String acntHolderRcvrSrnm;
    private String acntHolderRcvrNm;
    private String bankNameSndr;
    private String bankNameRcvr;
    private String accountIBANSndr;
    private String accountIBANRcvr;
    private String bankSwiftBicSndr;
    private String bankSwiftBicRcvr;

    
    public BankTransfer(String acntHolderSndrSrnm, String acntHolderSndrNm, String acntHolderRcvrSrnm, String acntHolderRcvrNm, String bankNameSndr, String bankNameRcvr, String accountIBANSndr, String accountIBANRcvr, String bankSwiftBicSndr, String bankSwiftBicRcvr)
    {
        this.acntHolderSndrSrnm = acntHolderSndrSrnm;
        this.acntHolderSndrNm = acntHolderSndrNm;
        this.acntHolderRcvrSrnm = acntHolderRcvrSrnm;
        this.acntHolderRcvrNm = acntHolderRcvrNm;
        this.bankNameSndr = bankNameSndr;
        this.bankNameRcvr = bankNameRcvr;
        this.accountIBANSndr = accountIBANSndr;
        this.accountIBANRcvr = accountIBANRcvr;
        this.bankSwiftBicSndr = bankSwiftBicSndr;
        this.bankSwiftBicRcvr = bankSwiftBicRcvr;
    }

    public BankTransfer()
    {
        
    }


    public String getAcntHolderSndrSrnm()
    {
        return acntHolderSndrSrnm;
    }

    public void setAcntHolderSndrSrnm(String acntHolderSndrSrnm)
    {
        this.acntHolderSndrSrnm = acntHolderSndrSrnm;
    }

    public String getAcntHolderSndrNm()
    {
        return acntHolderSndrNm;
    }

    public void setAcntHolderSndrNm(String acntHolderSndrNm)
    {
        this.acntHolderSndrNm = acntHolderSndrNm;
    }

    public String getAcntHolderRcvrSrnm()
    {
        return acntHolderRcvrSrnm;
    }

    public void setAcntHolderRcvrSrnm(String acntHolderRcvrSrnm)
    {
        this.acntHolderRcvrSrnm = acntHolderRcvrSrnm;
    }

    public String getAcntHolderRcvrNm()
    {
        return acntHolderRcvrNm;
    }

    public void setAcntHolderRcvrNm(String acntHolderRcvrNm)
    {
        this.acntHolderRcvrNm = acntHolderRcvrNm;
    }

    public String getBankNameSndr()
    {
        return bankNameSndr;
    }

    public void setBankNameSndr(String bankNameSndr)
    {
        this.bankNameSndr = bankNameSndr;
    }

    public String getBankNameRcvr()
    {
        return bankNameRcvr;
    }

    public void setBankNameRcvr(String bankNameRcvr)
    {
        this.bankNameRcvr = bankNameRcvr;
    }

    public String getAccountIBANSndr()
    {
        return accountIBANSndr;
    }

    public void setAccountIBANSndr(String accountIBANSndr)
    {
        this.accountIBANSndr = accountIBANSndr;
    }

    public String getAccountIBANRcvr()
    {
        return accountIBANRcvr;
    }

    public void setAccountIBANRcvr(String accountIBANRcvr)
    {
        this.accountIBANRcvr = accountIBANRcvr;
    }

    public String getBankSwiftBicSndr()
    {
        return bankSwiftBicSndr;
    }

    public void setBankSwiftBicSndr(String bankSwiftBicSndr)
    {
        this.bankSwiftBicSndr = bankSwiftBicSndr;
    }

    public String getBankSwiftBicRcvr()
    {
        return bankSwiftBicRcvr;
    }

    public void setBankSwiftBicRcvr(String bankSwiftBicRcvr)
    {
        this.bankSwiftBicRcvr = bankSwiftBicRcvr;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("BankTransfer{acntHolderSndrSrnm=").append(acntHolderSndrSrnm);
        sb.append(", acntHolderSndrNm=").append(acntHolderSndrNm);
        sb.append(", acntHolderRcvrSrnm=").append(acntHolderRcvrSrnm);
        sb.append(", acntHolderRcvrNm=").append(acntHolderRcvrNm);
        sb.append(", bankNameSndr=").append(bankNameSndr);
        sb.append(", bankNameRcvr=").append(bankNameRcvr);
        sb.append(", accountIBANSndr=").append(accountIBANSndr);
        sb.append(", accountIBANRcvr=").append(accountIBANRcvr);
        sb.append(", bankSwiftBicSndr=").append(bankSwiftBicSndr);
        sb.append(", bankSwiftBicRcvr=").append(bankSwiftBicRcvr);
        sb.append('}');
        return sb.toString();
    }
    
    
    @Override
    public void payment(double amount)
    {
        System.out.println("Your money transfer from: '" + this.bankNameSndr
                + ", " + this.accountIBANSndr + "' to '" + this.bankNameRcvr
                + ", " + this.accountIBANRcvr + "' was completed successfully!");
        System.out.println("\n");
    }

}

