/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author RYZEN 5
 */
public class RegistrarMateria {
    
    public static void registrar(Connection cn, Materia m) throws SQLException {
        try {
            PreparedStatement consulta;
            consulta = cn.prepareStatement("Insert into materia(idMateria,nombre,profesor,creditos) Values(?,?,?,?)");
            consulta.setInt(1, m.getIdMateria());
            consulta.setString(2, m.getNombre());
            consulta.setString(4, m.getProfesor());
            consulta.setString(5, m.getCreditos());
            consulta.executeUpdate();
            System.out.println("guarda");
        } catch (SQLException e) {
            System.out.println("E guardar");
            throw new SQLException(e);
        }
    }
    
    public static Materia buscar(Connection cn,Integer idMateria) throws SQLException{
        Materia m =new Materia();
        try{
            PreparedStatement consulta;
            consulta=cn.prepareStatement("Select nombre as name , profesor as pro , creditos as cre from materia where idMateria='"+idMateria+"'");
            ResultSet rs=consulta.executeQuery();
            if(rs.next()){
                m.setNombre(rs.getString("name"));
                m.setProfesor(rs.getString("pro"));
                m.setCreditos(rs.getString("cre"));
                
            }
        }catch(SQLException e){
            throw new SQLException(e);
        }
        return m;
    }
    
    public static void actualizar(Connection cn,Integer idMateria,String nombre,String profesor,String creditos) throws SQLException{
        try{
            PreparedStatement consulta;
            consulta=cn.prepareStatement("UPDATE materia set nombre='"+nombre+"' ,profesor='"+profesor+"',creditos='"+creditos+"' where idMateria='"+idMateria+"'");
            consulta.executeUpdate();
            System.out.println("Actualiza");
        }catch(SQLException e){
            System.out.println("E actualizar");
            throw new SQLException(e);
        }
    }
    
    public static void eliminar(Connection cn,Integer idMateria) throws SQLException{
        try{
            PreparedStatement consulta;
            consulta=cn.prepareStatement("DELETE from materia where idMateria='"+idMateria+"'");
            consulta.executeUpdate();
            System.out.println("Elimina");
        }catch(SQLException e){
            System.out.println("    E eliminar");
            throw new SQLException(e);
        }
    }
    
}
