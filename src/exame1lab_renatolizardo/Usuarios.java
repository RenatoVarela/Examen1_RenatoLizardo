/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exame1lab_renatolizardo;

import java.util.ArrayList;
import java.util.Date;


public class Usuarios {
    String nombre_usuario;
    String contrasena;
    Date fecha_nacimiento;
    String num_telefono;
    String correo_electronico;
    String nombre_completo;
    String genero;
    ArrayList<libros> libros = new ArrayList();
    ArrayList<Object> amigos = new ArrayList();

    public Usuarios(String nombre_usuario, String contrasena, Date fecha_nacimiento, String num_telefono, String correo_electronico, String nombre_completo, String genero) {
        this.nombre_usuario = nombre_usuario;
        this.contrasena = contrasena;
        this.fecha_nacimiento = fecha_nacimiento;
        this.num_telefono = num_telefono;
        this.correo_electronico = correo_electronico;
        this.nombre_completo = nombre_completo;
        this.genero = genero;
    }

    public Usuarios() {
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getNum_telefono() {
        return num_telefono;
    }

    public void setNum_telefono(String num_telefono) {
        this.num_telefono = num_telefono;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public ArrayList<libros> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<libros> libros) {
        this.libros = libros;
    }

    public ArrayList<Object> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Object> amigos) {
        this.amigos = amigos;
    }

    @Override
    public String toString() {
        return "nombre_usuario=" + nombre_usuario + ", contrasena=" + contrasena + ", fecha_nacimiento=" + fecha_nacimiento + ", num_telefono=" + num_telefono + ", correo_electronico=" + correo_electronico + ", nombre_completo=" + nombre_completo + ", genero=" + genero + ", libros=" + libros + ", amigos=" + amigos + '}';
    }
    
    
    
    
    
    
   
    
    
}
