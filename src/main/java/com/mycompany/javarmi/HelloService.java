    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javarmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author sagar
 */
public interface HelloService extends Remote {
    public String echo(String input) throws RemoteException;
}
