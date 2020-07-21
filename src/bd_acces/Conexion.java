
package bd_acces;
import java.sql.*;
import javax.swing.*;

public class Conexion 
{
private Connection conexion;
public Statement sentencia;

public void conectarBaseDeDatos() 
 {
   try { 
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); //Linea que carga el driver
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar Dirver");  
        }
   try {
  conexion = DriverManager.getConnection("jdbc:ucanaccess://D:\\Cursos\\JAVA\\BD_Acces\\Base de datos11.accdb");
//En esta parte tenemos que cambiar la ruta en la que se encuentra nuestra base de datos 
//Ejemplo "jdbc:ucanaccess://C:\\Proyecto.accdb" hace referencia que esta en el disco local C
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la dirección de la base de datos");
        }
        try {
            sentencia = conexion.createStatement();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al crear la conexión con la base de datos");
        }
       }
          void cerrar() //Metodo que se usa para cerrar la conexion, recordar llamarlo aparte siempre ya que esta fuera del conectarBaseDeDatos() 
        {
        try {
            sentencia.close();
            System.out.println("Conexion cerrada");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cerrar la base de datos" + e);
        }
          }
 } 
       


             
               

    
    

