/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exame1lab_renatolizardo;

import java.util.Date;




public class libros {
    String titulo;
    String descripcion;
    int puntaje;
    int copias_disponible;
    String genero;
    double valor;
    String edicion;
    String autor;
    Date aniopublicacion;

    public libros(String titulo, String descripcion, int puntaje, int copias_disponible, String genero, double valor, String edicion, String autor, Date aniopublicacion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.puntaje = puntaje;
        this.copias_disponible = copias_disponible;
        this.genero = genero;
        this.valor = valor;
        this.edicion = edicion;
        this.autor = autor;
        this.aniopublicacion = aniopublicacion;
    }

    public libros() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getCopias_disponible() {
        return copias_disponible;
    }

    public void setCopias_disponible(int copias_disponible) {
        this.copias_disponible = copias_disponible;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getAniopublicacion() {
        return aniopublicacion;
    }

    public void setAniopublicacion(Date aniopublicacion) {
        this.aniopublicacion = aniopublicacion;
    }

    @Override
    public String toString() {
        return "titulo=" + titulo + ", descripcion=" + descripcion + ", puntaje=" + puntaje + ", copias_disponible=" + copias_disponible + ", genero=" + genero + ", valor=" + valor + ", edicion=" + edicion + ", autor=" + autor + ", aniopublicacion=" + aniopublicacion + '}';
    }
    
    
    
    
    
    
}
