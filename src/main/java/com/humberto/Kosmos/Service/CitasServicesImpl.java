package com.humberto.Kosmos.Service;

import com.humberto.Kosmos.Entity.Citas;
import com.humberto.Kosmos.Repository.CitasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CitasServicesImpl implements CitasServices
{
    @Autowired
    CitasRepository citasRepository;

    @Override
    public List<Citas> getAll() {
        return citasRepository.findAll();
    }

    @Override
    public List<Citas> findByNombre(String nombre)
    {
        return citasRepository.findByNombre(nombre);
    }

    @Override
    public List<Citas> findByConsultorio(String consultorio)
    {
        return citasRepository.findByConsultorio(consultorio);
    }

    @Override
    public List<Citas> findByFecha(LocalDate fechaCita)
    {
        return citasRepository.findByFecha(fechaCita);
    }

    @Override
    public Citas crearCita(Citas citas)
    {
        Citas citas1 = citas;
        Integer numeroCitas = citasRepository.numeroCitas(citas1.getDoctor().getNombre(), citas1.getFechaCita());
        if (numeroCitas < 8)
        {
            
        }
        return null;
    }
}
