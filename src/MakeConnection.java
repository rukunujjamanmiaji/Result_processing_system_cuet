/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package result_processing_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author RUKUNUJJAMAN MIAJI
 */
public class MakeConnection
{
    public static Connection getDatabaseConnection()
    {
        try 
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");

        } catch (ClassNotFoundException e) 
        {
            System.out.println(e.toString());
        }
        Connection conn = null;
        try 
        {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "RUKU", "1104028");
        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        }
        return conn;
    }
}
