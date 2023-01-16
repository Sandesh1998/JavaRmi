/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.javarmi.AreaOfCircle;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CircleArea extends Remote {
  public double getArea(double radius) throws RemoteException;
}