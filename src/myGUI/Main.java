package myGUI;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jacob
 */
public class Main {
    public static void main(String[] args) {
        
        Connection connection  = null;
		try {  
			Class.forName("org.sqlite.JDBC");  
			connection = DriverManager.getConnection("jdbc:sqlite:databas.");  

		} catch (Exception e) {  
			e.printStackTrace();  
		} finally {  
			try {  
				connection.close();  
			} catch (Exception e) {  
				e.printStackTrace();  
			}  
		}  
        
        MenyGUI s = new MenyGUI();
        s.setVisible(true);
    }
    
}
