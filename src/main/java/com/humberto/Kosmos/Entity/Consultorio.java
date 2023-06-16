package com.humberto.Kosmos.Entity;

import javax.persistence.*;

@Entity
@Table(name = "CONSULTORIO")
public class Consultorio
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "Numero_Consultorio")
    String numConsultorio;
    @Column(name = "Piso")
    String piso;

    public Consultorio()
    {

    }

    public Consultorio(Long id, String numConsultorio, String piso) {
        this.id = id;
        this.numConsultorio = numConsultorio;
        this.piso = piso;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumConsultorio() {
        return numConsultorio;
    }

    public void setNumConsultorio(String numConsultorio) {
        this.numConsultorio = numConsultorio;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }
}
