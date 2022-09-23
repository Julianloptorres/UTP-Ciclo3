package model.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Habitacion {
    @Id    
    private Integer numerohabitacion; //cambie el id generado automaticamente por el numero de la habitacion con id 
    
    private Double precio ;
    private String tipoHabitacion ;
    
    @ManyToOne
    private Reserva reserva;
}
