/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javarmi.TaxCalculation;


import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class TaxCalculatorClient {
    public static void main(String[] args) throws MalformedURLException {
        try {
            TaxCalculator calculator = (TaxCalculator) Naming.lookup("rmi://localhost:1099/TaxCalculator");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter amount: ");
            double amount = scanner.nextDouble();
            System.out.print("Enter tax rate: ");
            double rate = scanner.nextDouble();
            calculator.setTaxRate(rate);
            double tax = calculator.calculateTax(amount);
            System.out.println("Tax: " + tax);
        } catch (RemoteException | NotBoundException e) {
            e.printStackTrace();
        }
    }
}

