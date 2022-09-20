package model.entity;
import java.sql.Date;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Reserva {
    private Date fechaEntrada;
    private Date fechaSalida;
    private Integer cantidadAdultos;
    private Integer cantidadNiños;
    private Integer cantidadHabitaciones;
    private String peticion;
    
}
