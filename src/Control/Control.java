package Control;

import DAO.RegistrarAlumno;
import DAO.RegistrarMateria;
import DAO.RegistrarMatricula;
import DTO.Alumno;
import DTO.Materia;
import DTO.Matricula;
import Servicios.Conexion;
import java.sql.Date;

/**
 *
 * @author RAZEN 5
 */
public class Control {

    private RegistrarAlumno ra = new RegistrarAlumno();
    private RegistrarMateria rm = new RegistrarMateria();
    private RegistrarMatricula rmtri = new RegistrarMatricula();

    public void registrar(Alumno a, Materia m, Matricula mt) {

        try {
            //   RegistrarProducto rp = new RegistrarProducto();

            ra.registrar(Conexion.obtener(), a);
            rm.registrar(Conexion.obtener(), m);
            rmtri.registrar(Conexion.obtener(), mt);
        } catch (Exception e) {

        }

    }

    public void actualizarA(Integer idAlumno, String nombre, String apellido, String email, String genero) {
        try {
            //  RegistrarProducto rp=new RegistrarProducto();
            ra.actualizar(Conexion.obtener(), idAlumno, nombre, apellido, email, genero);
        } catch (Exception e) {

        }
    }
    
    public void actualizarM(Integer idMateria,String nombre,String profesor,String creditos) {
        try {
            //  RegistrarProducto rp=new RegistrarProducto();
            rm.actualizar(Conexion.obtener(), idMateria, nombre, profesor, creditos);
        } catch (Exception e) {

        }
    }
    
    public void actualizarMt(Integer idMatricula,Integer idAlumno,Integer idMateria ,Date fechaMatricula) {
        try {
            //  RegistrarProducto rp=new RegistrarProducto();
            rmtri.actualizar(Conexion.obtener(), idMatricula, idAlumno, idMateria, fechaMatricula);
        } catch (Exception e) {

        }
    }

    public Alumno buscarAlumno(Integer idAlumno) {
        try {
            return ra.buscar(Conexion.obtener(), idAlumno);
        } catch (Exception e) {

        }
        return null;
    }
    
    public Materia buscarMateria(Integer idMateria) {
        try {
            return rm.buscar(Conexion.obtener(), idMateria);
        } catch (Exception e) {

        }
        return null;
    }
    
    public Matricula buscarMatricula(Integer idMatricula) {
        try {
            return rmtri.buscar(Conexion.obtener(), idMatricula);
        } catch (Exception e) {

        }
        return null;
    }
    
    public void eliminar(Integer idAlumno, Integer idMateria, Integer idMatricula){
        try{
            //RegistrarProducto rp=new RegistrarProducto();
            ra.eliminar(Conexion.obtener(), idAlumno);
            rm.eliminar(Conexion.obtener(), idMateria);
            rmtri.eliminar(Conexion.obtener(), idMatricula);
        }catch(Exception e){
            
        }
    }

}
