/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javarmi.TaxCalculation;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class TaxCalculatorServer {
    public static void main(String[] args) {
        try {
            TaxCalculator calculator = new TaxCalculatorImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("TaxCalculator", calculator);
            System.out.println("Tax Calculator server ready.");
        } catch (RemoteException | AlreadyBoundException e) {
            e.printStackTrace();
        }
    }
}