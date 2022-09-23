package model.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import model.entity.Habitacion;

public interface HabitacionRepository extends JpaRepository <Habitacion, Integer> {
    
    Optional<Habitacion> findById (Integer habitacionId);
}