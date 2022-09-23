package model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import model.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
    
    Optional<Cliente> findByApellidos(String cliente);
}
