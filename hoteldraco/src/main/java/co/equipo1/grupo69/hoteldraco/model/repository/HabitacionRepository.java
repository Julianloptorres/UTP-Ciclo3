package co.equipo1.grupo69.hoteldraco.model.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.equipo1.grupo69.hoteldraco.model.entity.Habitacion;

public interface HabitacionRepository extends JpaRepository <Habitacion, Integer> {
    
    Optional<Habitacion> findById (Integer habitacionId);
    List<Habitacion> findByNumerohabitacion(Integer numerohabitacion);
    List<Habitacion> findByPrecio(Double precio);
    /**
     * @param list
     * @return
     */
    List<Habitacion> saveHabitacions(List<Habitacion> list);

}