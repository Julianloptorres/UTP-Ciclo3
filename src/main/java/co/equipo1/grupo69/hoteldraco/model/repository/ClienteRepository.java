package co.equipo1.grupo69.hoteldraco.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.equipo1.grupo69.hoteldraco.controller.dto.ClienteDto;
import co.equipo1.grupo69.hoteldraco.model.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
    
    Optional<Cliente> findById(String cliente);

    ClienteDto save(ClienteDto cliente);
    
}
