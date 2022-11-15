/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.Alumno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author RYZEN 5
 */
public class RegistrarAlumno {
    
    public static void registrar(Connection cn, DTO.Alumno a) throws SQLException {
        try {
            PreparedStatement consulta;
            consulta = cn.prepareStatement("Insert into alumno(idAlumno,nombre,apellido,email,genero) Values(?,?,?,?,?)");
            consulta.setInt(1, a.getIdAlumno());
            consulta.setString(2, a.getNombre());
            consulta.setString(3, a.getApellido());
            consulta.setString(4, a.getEmail());
            consulta.setString(5, a.getGenero());
            consulta.executeUpdate();
            System.out.println("guarda");
        } catch (SQLException e) {
            System.out.println("E guardar");
            throw new SQLException(e);
        }
    }
    
    public static Alumno buscar(Connection cn,Integer idAlumno) throws SQLException{
        Alumno a =new Alumno();
        try{
            PreparedStatement consulta;
            consulta=cn.prepareStatement("Select nombre as name , apellido as ape , email as ema , genero as gen from alumno where idAlumno='"+idAlumno+"'");
            ResultSet rs=consulta.executeQuery();
            if(rs.next()){
                a.setNombre(rs.getString("name"));
                a.setApellido(rs.getString("ape"));
                a.setEmail(rs.getString("ema"));
                a.setGenero(rs.getString("gen"));
                
            }
        }catch(SQLException e){
            throw new SQLException(e);
        }
        return a;
    }
    
    public static void actualizar(Connection cn,Integer idAlumno,String nombre,String apellido ,String email,String genero) throws SQLException{
        try{
            PreparedStatement consulta;
            consulta=cn.prepareStatement("UPDATE alumno set nombre='"+nombre+"' , apellido='"+apellido+"' ,email='"+email+"',genero='"+genero+"' where idAlumno='"+idAlumno+"'");
            consulta.executeUpdate();
            System.out.println("Actualiza");
        }catch(SQLException e){
            System.out.println("E actualizar");
            throw new SQLException(e);
        }
    }
    
    public static void eliminar(Connection cn,Integer idAlumno) throws SQLException{
        try{
            PreparedStatement consulta;
            consulta=cn.prepareStatement("DELETE from alumno where idAlumno='"+idAlumno+"'");
            consulta.executeUpdate();
            System.out.println("Elimina");
        }catch(SQLException e){
            System.out.println("    E eliminar");
            throw new SQLException(e);
        }
    }
    
}
