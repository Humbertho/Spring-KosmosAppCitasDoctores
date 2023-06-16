package com.humberto.Kosmos.Repository;

import com.humberto.Kosmos.Entity.Citas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface CitasRepository extends JpaRepository<Citas, Long>
{
    @Query(value = "SELECT * FROM CITAS INNER JOIN DOCTORES ON CITAS.Id_Doctor = DOCTORES.id AND DOCTORES.Nombre = :nombre", nativeQuery = true)
    List<Citas> findByNombre(@Param("nombre") String nombre);

    @Query(value = "SELECT * FROM CITAS INNER JOIN CONSULTORIO ON CITAS.Id_Consultorio = CONSULTORIO.id AND CONSULTORIO.Numero_Consultorio = :numConsultorio", nativeQuery = true)
    List<Citas> findByConsultorio(@Param("numConsultorio") String numConsultorio);

    @Query(value = "SELECT * FROM CITAS WHERE Fecha_Cita = :fechaCita", nativeQuery = true)
    List<Citas> findByFecha(@Param("fechaCita") LocalDate fechaCita);

    @Query(value = "SELECT COUNT(*) FROM CITAS INNER JOIN DOCTORES ON CITAS.Id_Doctor = DOCTORES.id AND DOCTORES.Nombre = :nombre AND CITAS.Fecha_Cita = :fechaCita", nativeQuery = true)
    Integer numeroCitas(@Param("nombre") String nombre, @Param("fechaCita") LocalDate fechaCita);
}
