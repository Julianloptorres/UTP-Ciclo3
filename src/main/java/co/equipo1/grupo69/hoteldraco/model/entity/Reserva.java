package co.equipo1.grupo69.hoteldraco.model.entity;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;

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

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaEntrada ;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaSalida;
    private Integer cantidadAdultos;
    private Integer cantidadNinos;
      

    @ManyToOne
    private Cliente cliente;

    @OneToOne
    @JoinColumn(name= "habitacion_id")
    private Habitacion habitacion; 
    
}
