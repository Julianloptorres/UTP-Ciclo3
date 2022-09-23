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
     
     @Column(name= "Nombre")
     private String nombre;

     @Column(name= "Apellidos")
     private String apellidos;

     @Column(name = "Correo")
     private String correo;

     @Column(name = "Direccion")
     private String direccion;

     @Column(name = "Ciudad")
     private String ciudad;

     @Column(name= "Pais")
     private String pais;

     @Column(name="Telefono")
     private String telefono;
    
     @OneToMany(mappedBy = "cliente")
     private List <Reserva> reserva;
     
}

