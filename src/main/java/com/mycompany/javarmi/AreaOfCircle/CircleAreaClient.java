/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javarmi.AreaOfCircle;
import java.rmi.Naming;

public class CircleAreaClient {
  public static void main(String[] args) {
    try {
      CircleArea area = (CircleArea) Naming.lookup("rmi://localhost:5099/CircleArea");
      double radius = 5.0;
      System.out.println("Area of circle with radius " + radius + " is: " + area.getArea(radius));
    } catch (Exception e) {
      e.printStackTrace();
    }
  } 
}