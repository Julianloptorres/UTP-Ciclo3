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
    private Integer id;
    private Double precio ;
    private String tipoHabitacion ;
    private String imagenUrl;
    private String descripcion;
    
}
