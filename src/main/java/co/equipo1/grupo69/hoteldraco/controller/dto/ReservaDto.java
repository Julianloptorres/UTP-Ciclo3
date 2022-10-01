package co.equipo1.grupo69.hoteldraco.controller.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class ReservaDto {  

    private Integer id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaEntrada ;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaSalida;
    private Integer cantidadAdultos;
    private Integer cantidadNinos;
    
    
}
