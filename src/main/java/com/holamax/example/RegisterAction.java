package com.holamax.example;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.Connection;
import java.sql.PreparedStatement;


import com.holamax.example.user;

//holamax/WEB-INF/example/register.jsp;


public class RegisterAction extends ActionSupport{
	
	private String clave;
	private String hombre;
	private String apellidos;
	private String contra;
	// private persona objTra;
	
	//public String ingresar() {
		
	//}
	
	
	public RegisterAction() {
		// TODO Auto-generated constructor stub
	}
	
	
	public RegisterAction(String clave, String hombre, String apellidos, String contra) { 
		super();
		this.clave = clave;
		this.hombre = hombre;
		this.apellidos = apellidos;
		this.contra = contra;
	}



	public String getClave() {
		return clave;
	}   
	
	
	public String getHombre() {
		return hombre;
	}

	public void setHombre(String hombre) {
		this.hombre = hombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getContra() {
		return contra;
	}

	public void setContra(String contra) {
		this.contra = contra;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	/*public String execute () throws Exception{
		int rec = user.register(this); //conect.java
		if(rec > 0) {
			return "SUCCESS";
		}else {
			return "ERROR";
		}
		//return "SUCCESS";
	}
	
	public String execute() {
		int i=0;
		try {
			Connection con=user.createConnection();
			PreparedStatement ps=con.prepareStatement("INSERT INTO 'table1' ('idtabla', 'nombre', 'apellidos', 'contrasena') "
					+ "VALUES (?, ?, ?, ?)");
			ps.setString(1, getClave());
			ps.setString(2, getHombre());
			ps.setString(3, getApellidos());
			ps.setString(4, getContra());
			
		}catch(Exception e){
			e.printStackTrace();
		}
		if(i>0) {
			return "success";
		}else {
			return "fail";
		}
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
		return flag;*/

}
