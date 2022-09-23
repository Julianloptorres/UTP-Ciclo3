package co.equipo1.grupo69.hoteldraco.Service;

import java.util.List;

import co.equipo1.grupo69.hoteldraco.controller.dto.ReservaDto;
import co.equipo1.grupo69.hoteldraco.model.entity.Reserva;

public interface ConfirmacionReservaService {

    List<ReservaDto> findByClienteId(Integer clienteId);

    void save(Reserva reserva);
    
}
