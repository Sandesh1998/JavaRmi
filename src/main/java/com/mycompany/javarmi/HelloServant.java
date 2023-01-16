/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javarmi;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author sagar
 */
public class HelloServant extends UnicastRemoteObject implements HelloService{

    public HelloServant() throws RemoteException {
        super();
    }
    

    @Override
    public String echo(String input) throws RemoteException {
        return "From Server:" + input ;
    }
    
}
