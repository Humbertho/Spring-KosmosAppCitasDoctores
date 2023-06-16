package com.humberto.Kosmos.Controller;

import com.humberto.Kosmos.Entity.Citas;
import com.humberto.Kosmos.Service.CitasServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CitasController
{
    @Autowired
    CitasServices citasServices;

    @GetMapping("/citas")
    public ResponseEntity<List<Citas>> getAllCitas()
    {
        List<Citas> citas = citasServices.getAll();
        if (citas.isEmpty())
        {
            return new ResponseEntity("No se encontraron citas", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Citas>>(citas, HttpStatus.OK);
    }

    @GetMapping("/citas/{nombre}")
    public ResponseEntity<List<Citas>> getCitaByNombre(@PathVariable String nombre)
    {
        List<Citas> citas = citasServices.findByNombre(nombre);
        if (citas.isEmpty())
        {
            return new ResponseEntity("No se encontraron citas", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Citas>>(citas, HttpStatus.OK);
    }

    @GetMapping("/citas/consultorio/{numConsultorio}")
    public ResponseEntity<List<Citas>> getCitaByConsultorio(@PathVariable String numConsultorio)
    {
        List<Citas> citas = citasServices.findByConsultorio(numConsultorio);
        if (citas.isEmpty())
        {
            return new ResponseEntity("No se encontraron citas", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Citas>>(citas, HttpStatus.OK);
    }

    @GetMapping("/citas/fecha/{fechaCita}")
    public ResponseEntity<List<Citas>> getCitaByFechaCita(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fechaCita)
    {
        List<Citas> citas = citasServices.findByFecha(fechaCita);
        if (citas.isEmpty())
        {
            return new ResponseEntity("No se encontraron citas", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Citas>>(citas, HttpStatus.OK);
    }

    @PostMapping("/cita")
    public ResponseEntity<Citas> crearCita(@RequestBody Citas citas)
    {
        //Citas citas1 = citasServices;
        return new ResponseEntity<Citas>(citas, HttpStatus.OK);
    }
}
