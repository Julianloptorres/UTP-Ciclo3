package co.equipo1.grupo69.hoteldraco.controller.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDto {
    private Integer id;
     
    private String nombre ;
    private String apellidos;
    private String email;
    private String direccion;
    private String ciudad;
    private String pais;
    private String telefono;
    private String peticion;
    private String habitacion;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date entrada;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date salida;
    
}
