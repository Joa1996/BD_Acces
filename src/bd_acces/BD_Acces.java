
package bd_acces;

import java.sql.SQLException;
import java.util.*;
import javax.swing.JOptionPane;

public class BD_Acces {

   
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
               Conexion c=new Conexion();
        System.out.println("Ingresando datos a una BD ACCESS"+"\n");
        System.out.println("Empezamos\n");
        System.out.println("Ingrese la Identificacion");
        String id=sc.nextLine();
        System.out.println("Ingrese el Nombre");
        String n=sc.nextLine();
        System.out.println("Ingrese el Apellido");
        String ape=sc.nextLine();
        System.out.println("Ingrese la ocupacion");
        String ocu=sc.nextLine();
        
        System.out.println("Cargar a DB?");
        System.out.println("S=SI ____N=NO");
        String dec=sc.nextLine();
        
        if(dec.equalsIgnoreCase("S"))
        {
 
        
        c.conectarBaseDeDatos();
  String SQL="insert into   BD(Identificacion,Nombre,Apellido,Ocupacion) values"+"('"+id+"','"+n+"','"+ape+"','"+ocu+"')";    
  try{ 
         
//conectamos.. 
  c.sentencia.executeUpdate(SQL);        
//insertamos los datos un SQL normal.. 

    } catch (SQLException ex) {
             //Mensaje que saldrá cuando ocurra un error al ingresar los datos
            JOptionPane.showMessageDialog(null, "Error, sus datos no fueron ingresados\n" + ex);
        }
      c.cerrar();//Llamamos al metodo cerrar para cerrar la  conexion con la BD Access
        }
    
    
    
    }
    
    
}
