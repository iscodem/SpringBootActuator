package com.iscodem.demodavid.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@Entity
@Table(name = "tabla_persona") //Renombra la creación de la tabla en base de datos
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Persona {
    @Id
    @GeneratedValue()
    private int id;
    @Column(nullable = false)
    private String nombres;
    @Column(nullable = false)
    private String apellidos;
    @Column(nullable = false)
    private Date fecNac;
    @Column(nullable = false)
    private int edad;
    private String dni;

    public Persona(int id, String nombres, String apellidos, Date fecNac, int edad, String dni) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fecNac = fecNac;
        this.edad = edad;
        this.dni = dni;
    }

    public Persona() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFecNac() {
        return fecNac;
    }

    public void setFecNac(Date fecNac) {
        this.fecNac = fecNac;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}