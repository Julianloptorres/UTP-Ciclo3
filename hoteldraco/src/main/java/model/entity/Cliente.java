package model.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
     
     private String nombre ;
     private String apellidos;
     private String correo;
     private String direccion;
     private String ciudad;
     private String pais;
     private String telefono;
    
     @OneToMany(mappedBy = "cliente")
     private List <Reserva> reserva;
     
}

