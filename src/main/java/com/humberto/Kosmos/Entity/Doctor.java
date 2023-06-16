package com.humberto.Kosmos.Entity;

import javax.persistence.*;

@Entity
@Table(name = "DOCTORES")
public class Doctor
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "Nombre")
    String nombre;
    @Column(name = "Apellido_Paterno")
    String apellidoPaterno;
    @Column(name = "Apellido_Materno")
    String apellidoMaterno;
    @Column(name = "Especialidad")
    String especialidad;

    public Doctor()
    {

    }
    public Doctor(Long id, String nombre, String apellidoPaterno, String apellidoMaterno, String especialidad)
    {
        this.id = id;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.especialidad = especialidad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
