/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;

/**
 *
 * @author captain
 */
public class bd {
    Connection conectar= null;
    
   public Connection conexion(){
       
       try{
           Class.forName("com.mysql.jdbc.Driver");
           conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/usuario","user","password");
          JOptionPane.showMessageDialog(null, "Conexion Exitosa");
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error de conexion");
           
       }
       
       return conectar;
   } 
}
