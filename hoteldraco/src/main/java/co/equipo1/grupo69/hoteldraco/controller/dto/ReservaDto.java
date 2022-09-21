package co.equipo1.grupo69.hoteldraco.controller.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ReservaDto {
    
    private Integer id;

    private Date fechaEntrada;
    private Date fechaSalida;
    private Integer cantidadAdultos;
    private Integer cantidadNiños;
    private Integer cantidadHabitaciones;
    private String peticion;
}
