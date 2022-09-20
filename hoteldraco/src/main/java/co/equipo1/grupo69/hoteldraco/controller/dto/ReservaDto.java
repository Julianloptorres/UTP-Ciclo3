package co.equipo1.grupo69.hoteldraco.controller.dto;

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
