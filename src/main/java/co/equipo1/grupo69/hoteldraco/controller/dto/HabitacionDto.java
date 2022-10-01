package co.equipo1.grupo69.hoteldraco.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class HabitacionDto {
    private Integer id;    
    private Double precio ;
    private String tipoHabitacion ;
    private String imagenUrl;
}