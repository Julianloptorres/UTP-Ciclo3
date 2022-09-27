package co.equipo1.grupo69.hoteldraco.Service.impl;

import org.springframework.stereotype.Service;

import co.equipo1.grupo69.hoteldraco.Service.ReservaService;
import co.equipo1.grupo69.hoteldraco.controller.dto.ReservaDto;
import co.equipo1.grupo69.hoteldraco.model.entity.Cliente;
import co.equipo1.grupo69.hoteldraco.model.entity.Reserva;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service

public class ReservaServicioImpl implements ReservaService{
    @Override
    public void crearReserva(ReservaDto reserva) {
        var entityReserva = new Reserva();
        entityReserva.setFechaEntrada(reserva.getFechaEntrada());
        entityReserva.setFechaSalida(reserva.getFechaSalida());
        entityReserva.setCantidadAdultos(reserva.getCantidadAdultos());
        entityReserva.setCantidadNiños(reserva.getCantidadNiños());
        // entityReserva.setHabitacion(reserva.getCantidadHabitaciones());
        
        // TODO Auto-generated method stub
        
    }
    
}
