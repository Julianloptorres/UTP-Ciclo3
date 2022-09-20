package model.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Cliente { 
     private String nombre ;
     private String apellidos;
     private String correo;
     private String direccion;
     private String ciudad;
     private String pais;
     private String telefono;
}
