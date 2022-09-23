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
@Table(name = "Cliente")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "apellidos", nullable = false, length = 100)
    private String apellidos;

    @Column(name = "email", unique = true)
    private String correo;

    @Column(name = "direccion", nullable = false, length = 200)
    private String direccion;

    @Column(name = "ciudad", nullable = false, length = 100)
    private String ciudad;
    
    @Column(name = "pais", nullable = false, length = 100)
    private String pais;

    @Column(name = "telefono", nullable = false, length = 100)
    private String telefono;
    
    @OneToMany(mappedBy = "cliente")
    private List<Reserva> reserva;

    public Cliente(String name) {
     this.nombre = name;
 }
}

