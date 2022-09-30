package co.equipo1.grupo69.hoteldraco.model.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name= "Cliente")
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
    
     @OneToMany(mappedBy = "cliente")
     private List <Reserva> reserva;
     
}

