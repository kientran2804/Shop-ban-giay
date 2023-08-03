/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Giao_dien;

/**
 *
 * @author ASUS
 */
public class NewClass {
    public static void main(String[] args) {
         
      int min = 50;
      int max = 100;
      //Generate random double value from 50 to 100 
      System.out.println("Random value in double from "+min+" to "+max+ ":");
      double random_double = Math.random() * (max - min + 1) + min; 
      System.out.println(random_double);
        
      //Generate random int value from 50 to 100 
      System.out.println("Random value in int from "+min+" to "+max+ ":");
      int random_int = (int)(Math.random() * (max - min + 1) + min);
      System.out.println(random_int);
    }
    
}
