/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javarmi.VolumeofRectangle;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class RectangleClient {

    public static void main(String[] args) throws MalformedURLException {
        try {
            RectangleInterface rectangle = (RectangleInterface) java.rmi.Naming.lookup("rmi://localhost:1099/rectangle");
            rectangle.setDimensions(5, 20);
            System.out.println("Volume of rectangle : " + rectangle.getVolume());
        } catch (RemoteException | NotBoundException e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
