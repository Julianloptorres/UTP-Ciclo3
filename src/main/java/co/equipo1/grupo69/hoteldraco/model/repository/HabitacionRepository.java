package co.equipo1.grupo69.hoteldraco.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.equipo1.grupo69.hoteldraco.model.entity.Habitacion;

public interface HabitacionRepository extends JpaRepository <Habitacion, Integer> {
    
    Optional<Habitacion> findById (Integer id);   
   

}