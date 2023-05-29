/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miscelania2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author tadeo
 */
public class Conexion  {
    Connection conectar;
    String bd = "miscelaniagarcia";
    String url = "jdbc:mysql://localhost:3306/";
    String usuario = "root";
    String contraseña = "tadeo";
    String driver = "com.mysql.cj.jdbc.Driver";
    
    public Connection estableceConexion () throws SQLException{
        try{
            Class.forName(this.driver);
            conectar = DriverManager.getConnection(url+bd,usuario,contraseña);
            conectar.setAutoCommit(false);
            conectar.commit();
            //JOptionPane.showMessageDialog(null," Se conecto");
            
        }catch (Exception e){
            //conectar.rollback();
            JOptionPane.showMessageDialog(null," No se conecto");
        }
        return conectar;
    }

    void commit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
