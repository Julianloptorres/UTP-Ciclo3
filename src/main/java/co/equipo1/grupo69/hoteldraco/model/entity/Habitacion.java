package co.equipo1.grupo69.hoteldraco.model.entity;
import javax.persistence.Entity;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Habitacion {
    @Id    
    private Integer numerohabitacion; //cambio del id generado automaticamente por el numero de la habitacion con id 
    
    private Double precio ;
    private String tipoHabitacion ;
    
}
