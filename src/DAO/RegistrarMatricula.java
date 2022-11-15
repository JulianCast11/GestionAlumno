/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.Matricula;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author RYZEN 5
 */
public class RegistrarMatricula {
    
    public static void registrar(Connection cn, Matricula mt) throws SQLException {
        try {
            PreparedStatement consulta;
            consulta = cn.prepareStatement("Insert into matricula(idMatricula,idAlumno,idMateria,fechaMatricula) Values(?,?,?,?,?)");
            consulta.setInt(1, mt.getIdMatricula());
            consulta.setInt(2, mt.getIdAlumno());
            consulta.setInt(3, mt.getIdMatricula());
            consulta.setDate(4, mt.getFechaMatricula());
            consulta.executeUpdate();
            System.out.println("guarda");
        } catch (SQLException e) {
            System.out.println("E guardar");
            throw new SQLException(e);
        }
    }
    
    public static Matricula buscar(Connection cn,Integer idMatricula) throws SQLException{
        Matricula ma=new Matricula();
            try{
            PreparedStatement consulta;
            consulta=cn.prepareStatement("Select idAlumno as ia , idMateria as im , fechaMatricula as fm from producto where idMatricula='"+idMatricula+"'");
            ResultSet rs=consulta.executeQuery();
            if(rs.next()){
                ma.setIdAlumno(rs.getInt("ia"));
                ma.setIdMateria(rs.getInt("im"));
                ma.setFechaMatricula(rs.getDate("fm"));
                
            }
        }catch(SQLException e){
            throw new SQLException(e);
        }
        return ma;
    }
    
    public static void actualizar(Connection cn,Integer idMatricula,Integer idAlumno,Integer idMateria ,Date fechaMatricula) throws SQLException{
        try{
            PreparedStatement consulta;
            consulta=cn.prepareStatement("UPDATE matricula set idAlumno='"+idAlumno+"' , idMateria='"+idMateria+"' ,fechaMatricula='"+fechaMatricula+"' where idMatricula='"+idMatricula+"'");
            consulta.executeUpdate();
            System.out.println("Actualiza");
        }catch(SQLException e){
            System.out.println("E actualizar");
            throw new SQLException(e);
        }
    }
    
    public static void eliminar(Connection cn,Integer idMatricula) throws SQLException{
        try{
            PreparedStatement consulta;
            consulta=cn.prepareStatement("DELETE from matricula where idMatricula='"+idMatricula+"'");
            consulta.executeUpdate();
            System.out.println("Elimina");
        }catch(SQLException e){
            System.out.println("    E eliminar");
            throw new SQLException(e);
        }
    }
    
}
