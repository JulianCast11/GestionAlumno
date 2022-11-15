/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author RYZEN 5
 */
public class Materia {
    
    private Integer idMateria;
    private String nombreM;
    private String profesor;
    private String creditos;

    public Materia() {
    }

    public Materia(Integer idMateria, String nombreM, String profesor, String creditos) {
        this.idMateria = idMateria;
        this.nombreM = nombreM;
        this.profesor = profesor;
        this.creditos = creditos;
    }

    public Integer getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Integer idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombreM;
    }

    public void setNombre(String nombreM) {
        this.nombreM = nombreM;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    @Override
    public String toString() {
        return "Informacion De La Materia{" + "idMateria=" + idMateria + ", nombre=" + nombreM + ", profesor=" + profesor + ", creditos=" + creditos + '}';
    }
    
    
    
}
