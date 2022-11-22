/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.malapractica.entidades;

import java.util.Date;

/**
 *
 * @author malapractica
 * @date  22-11-2022
 */
public class Persona {
    
    private String dni;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private int    edad;
    private Date   fechaNacimiento;

    /**
     * Constructor sin parámetros
     */
    public Persona() {
    }

    /**
     * Constructor con parámetros
     * @param dni
     * @param primerNombre
     * @param segundoNombre
     * @param primerApellido
     * @param segundoApellido
     * @param edad
     * @param fechaNacimiento 
     */
    public Persona(String dni, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, int edad, Date fechaNacimiento) {
        this.dni = dni;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Accesador del atributo dni
     * @return String dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * Mutador del atributo dni
     * @param String dni 
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Accesador del atributo primer nombre
     * @return String primerNombre
     */
    public String getPrimerNombre() {
        return primerNombre;
    }

    /**
     * Mutador del atributo primerNombre
     * @param String primerNombre 
     */
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    /**
     * Accesador del atributo segundo nombre
     * @return String segundoNombre
     */
    public String getSegundoNombre() {
        return segundoNombre;
    }

    /**
     * Método mutador del atributo segundoNombre
     * @param segundoNombre 
     */
    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    /**
     * Metodo accesador del atributo primerApellido
     * @return String primerApellido
     */
    public String getPrimerApellido() {
        return primerApellido;
    }

    /**
     * Metodo mutador del atributo primerApellido
     * @param String primerApellido 
     */
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    /**
     * Metodo accesador del atributo segundo apellido
     * @return String segundoApellido
     */
    public String getSegundoApellido() {
        return segundoApellido;
    }

    /**
     * Método mutador del atributo segundoApellido
     * @param String segundoApellido 
     */
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    /**
     * Método accesador del atributo edad
     * @return int edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método mutador del atributo edad
     * @param int edad 
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Método accesador del atributo fechaNacimiento
     * @return Date fechaNacimiento
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Método mutador del atributo fechaNacimiento
     * @param Date fechaNacimiento 
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Método toString de la clase Persona
     * @return 
     */
    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", primerNombre=" + primerNombre + ", segundoNombre=" + segundoNombre + ", primerApellido=" + primerApellido + ", segundoApellido=" + segundoApellido + ", edad=" + edad + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    
}
