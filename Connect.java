/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author ANIS
 */
public class Connect {
    public static Connection ConnectDB() {
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            Connection obj = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:XE", "Claywe", "wee");
            return obj;
        
        }catch(Exception exc){
            JOptionPane.showMessageDialog(null, exc);
            return null;
        }
    }

    static void forName(String oraclejdbcOracleDriver) {
        //To change body of generated methods, choose Tools | Templates.
    }
}
