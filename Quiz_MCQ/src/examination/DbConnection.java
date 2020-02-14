/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examination;

import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author User
 */
public class DbConnection{
        Connection con;
        Statement stm;
        
        public DbConnection() throws ClassNotFoundException
        {
            try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quizdatabase","root","");
            stm = con.createStatement();
            }
            catch(SQLException e)
            {
            }
        }
        
    	public void manipulate(String query) throws ClassNotFoundException, SQLException
	{
		stm.executeUpdate(query);
	}

}
