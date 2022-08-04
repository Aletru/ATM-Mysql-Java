/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.Scanner;

/**
 *
 * @author a2456
 */
public class Proyecto {
     static float setSaldo;
    public static int saldo=5000;
    public static float retiro=0;
    public static float deposito=0;
    public static String cuenta="13807619485";
    public static String nip="1234";
    
    Scanner sc= new Scanner(System.in);
    
    public void setSaldo(int saldo){
         this.saldo=saldo;
    }
    public int getSaldo(){
        return saldo;
    }
    public void setRetiro(float retiro){
         retiro=sc.nextFloat();
    }
    public float getRetiro(){
        return retiro;
    }
    
     public void setDeposito(float deposito){
        deposito=sc.nextFloat();
        
    }
    public float getDeposito(){
        return deposito;
    }
    public void setCuenta(String cuenta){
        this.cuenta=cuenta;
    }
    public String getCuenta(){
        return cuenta;
    }
     public void setNip(String nip){
        this.nip=nip;
    }
    public String getNip(){
        return nip;
    }
    
    public static Proyecto id=new Proyecto();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        id.setSaldo(5000);
        id.setCuenta(cuenta);
        id.setNip(nip);
        inicio i = new inicio();
        i.setVisible(true);
    }
    
}
