/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.javarmi.SimpleProgram;


import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloService extends Remote {
    public String echo(String input) throws RemoteException;
}

