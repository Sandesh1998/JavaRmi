/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javarmi.AreaOfCircle;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CircleAreaImpl extends UnicastRemoteObject implements CircleArea {

    public CircleAreaImpl() throws RemoteException {
        super();
    }
    

    @Override
    public double getArea(double radius) throws RemoteException {
        return Math.PI * radius * radius;
    }
    
}