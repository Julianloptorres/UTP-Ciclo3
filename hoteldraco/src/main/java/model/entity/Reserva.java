package model.entity;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Date fechaEntrada;
    private Date fechaSalida;
    private Integer cantidadAdultos;
    private Integer cantidadNiños;
    private Integer cantidadHabitaciones;
    private String peticion;

    @ManyToOne
    private Cliente cliente;

    @OneToOne(mappedBy = "reserva")
    private Habitacion habitacion; 
    
}
