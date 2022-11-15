/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.sql.Date;

/**
 *
 * @author RYZEN 5
 */
public class Matricula {
    
    private Integer idMatricula;
    private Integer idAlumno;
    private Integer idMateria;
    private Date fechaMatricula;

    public Matricula() {
    }

    public Matricula(Integer idMatricula, Integer idAlumno, Integer idMateria, Date fechaMatricula) {
        this.idMatricula = idMatricula;
        this.idAlumno = idAlumno;
        this.idMateria = idMateria;
        this.fechaMatricula = fechaMatricula;
    }

    public Integer getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(Integer idMatricula) {
        this.idMatricula = idMatricula;
    }

    public Integer getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Integer getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Integer idMateria) {
        this.idMateria = idMateria;
    }

    public Date getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(Date fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    @Override
    public String toString() {
        return "Informacion De La Matricula{" + "idMatricula=" + idMatricula + ", idAlumno=" + idAlumno + ", idMateria=" + idMateria + ", fechaMatricula=" + fechaMatricula + '}';
    }
    
}
