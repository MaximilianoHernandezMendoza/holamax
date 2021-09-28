package com.holamax.example;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class gestionPersonas {
	public void Registrar_entrada(RegisterAction data) { // traer todos los datos de registeraction
		Connection cnx = null;
		PreparedStatement pstm = null;
		
		try {
			cnx = user.createConnection();
			String sql = "INSERT INTO 'table1' ('idtabla', 'nombre', 'apellidos', 'contrasena' VALUES (?, ?, ?, ?);";
			pstm = cnx.prepareStatement(sql);
			pstm.setString(1, data.getClave());
			pstm.setString(2, data.getHombre());
			pstm.setString(3, data.getApellidos());
			pstm.setString(4, data.getContra());
		pstm.executeUpdate();
		
		} catch (Exception ex) {
 			ex.printStackTrace();  
		}finally{
			try {
				if(pstm != null) {
					pstm.close();
				}if(cnx != null) {
					cnx.close();
				}
			}catch (Exception e2){
				e2.printStackTrace();
			}
		}
		
		
	}

}
