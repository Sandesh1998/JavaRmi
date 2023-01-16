/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javarmi.VolumeofRectangle;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RectangleServer extends UnicastRemoteObject implements RectangleInterface {

    private double length;
    private double width;

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        // create and export remote object
        RectangleServer rectangle = new RectangleServer();
        java.rmi.registry.LocateRegistry.createRegistry(1099);
        java.rmi.Naming.rebind("rmi://localhost:1099/rectangle", rectangle);
        System.out.println("Rectangle server is ready.");
    }

    public RectangleServer() throws RemoteException {
        super();
        length = 0;
        width = 0;
    }

    @Override
    public void setDimensions(double l, double w) throws RemoteException {
        length = l;
        width = w;
    }

    @Override
    public double getVolume() throws RemoteException {
        return length * width;
    }
}

interface RectangleInterface extends java.rmi.Remote {

    public void setDimensions(double l, double w) throws RemoteException;

    public double getVolume() throws RemoteException;
}
