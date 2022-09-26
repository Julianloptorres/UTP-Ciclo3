package co.equipo1.grupo69.hoteldraco.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.equipo1.grupo69.hoteldraco.model.entity.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Integer>{
    
    List<Reserva> findAllByClienteId(Integer clienteId);
}
