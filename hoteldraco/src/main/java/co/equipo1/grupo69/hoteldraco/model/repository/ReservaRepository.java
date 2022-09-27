package co.equipo1.grupo69.hoteldraco.model.repository;

import java.util.Locale.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<Category, Long>{
    
}
