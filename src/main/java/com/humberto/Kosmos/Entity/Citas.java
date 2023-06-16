package com.humberto.Kosmos.Entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "CITAS")
public class Citas
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @OneToOne
    @JoinColumn(name = "Id_Consultorio")
    Consultorio consultorio;
    @ManyToOne
    @JoinColumn(name = "Id_Doctor")
    Doctor doctor;
    @Column(name = "Fecha_Cita")
    LocalDate fechaCita;
    @Column(name = "Horario")
    LocalTime horario;
    @Column(name = "Nombre_Paciente")
    String nombrePaciente;

    public Citas()
    {

    }

    public Citas(Long id, Consultorio consultorio, Doctor doctor,LocalDate fechaCita, LocalTime horario, String nombrePaciente)
    {
        this.id = id;
        this.consultorio = consultorio;
        this.doctor = doctor;
        this.fechaCita = fechaCita;
        this.horario = horario;
        this.nombrePaciente = nombrePaciente;
    }

    public LocalDate getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(LocalDate fechaCita) {
        this.fechaCita = fechaCita;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }
}
