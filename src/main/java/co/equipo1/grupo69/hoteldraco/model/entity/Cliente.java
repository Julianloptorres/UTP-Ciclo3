package co.equipo1.grupo69.hoteldraco.model.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente { 
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Integer id;    
     
     private String nombre;
     private String apellidos;
     private String email;    
     private String direccion;     
     private String ciudad;     
     private String pais;   
     private String telefono;
     private String peticion;
     private String habitacion;
     @Temporal (TemporalType.DATE)   
     private Date entrada; 
     @Temporal (TemporalType.DATE) 
     private Date salida;
    
     @OneToMany(mappedBy = "cliente")
     private List <Reserva> reserva;
     
}

