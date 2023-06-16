package com.humberto.Kosmos.Service;

import com.humberto.Kosmos.Entity.Citas;

import java.time.LocalDate;
import java.util.List;

public interface CitasServices
{
    List<Citas> getAll();
    List<Citas> findByNombre(String nombre);
    List<Citas> findByConsultorio(String consultorio);
    List<Citas> findByFecha(LocalDate fechaCita);
    Citas crearCita(Citas citas);
}
