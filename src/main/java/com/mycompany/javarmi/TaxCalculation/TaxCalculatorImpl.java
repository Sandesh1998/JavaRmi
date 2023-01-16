/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javarmi.TaxCalculation;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class TaxCalculatorImpl extends UnicastRemoteObject implements TaxCalculator {
    private double taxRate;

    public TaxCalculatorImpl() throws RemoteException {
        taxRate = 0.1;
    }

    /**
     *
     * @param amount
     * @return
     * @throws RemoteException
     */
    @Override
    public double calculateTax(double amount) throws RemoteException {
        return taxRate * amount;
    }

    @Override
    public void setTaxRate(double rate) throws RemoteException {
        taxRate = rate;
    }
}
