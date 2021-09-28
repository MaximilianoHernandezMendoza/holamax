package com.holamax.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import com.holamax.example.RegisterAction;

public class user {
	
	// public static Connection con;
	
	public static Connection createConnection(){
		Connection con=null;
		String url="jdbc:mysql://mysql://localhost:3306/db_prueba1";
		String username="root";
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			}catch(ClassNotFoundException e){
				e.printStackTrace();
				System.out.println("error en diver ");
			}
			con=DriverManager.getConnection(url,username,"");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("error en base de datos ");
		}
		return con;
		
	}
	
	/*
	
	public static Connection connectionz () throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://mysql://localhost:3306/db_prueba1","root","");
		return con;
	}
	
	
	public static int register(RegisterAction ra) {
		int flag =0;
		try {
		PreparedStatement pst = connectionz() .prepareStatement("INSERT INTO 'table1' ('idtabla', 'nombre', 'apellidos', 'contrasena')"
				+ " VALUES (?, ?, ?, ?);");
		pst.setString(1, ra.getClave());
		pst.setString(2, ra.getHombre());
		pst.setString(3, ra.getApellidos());
		pst.setString(4, ra.getContra());
		
		flag = pst.executeUpdate();
		
		} catch (Exception ex) {
 			ex.printStackTrace();  
		}
		return flag;
	}
	
	*/
}
