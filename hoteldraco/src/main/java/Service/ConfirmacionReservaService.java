package Service;

import java.util.List;

import co.equipo1.grupo69.hoteldraco.controller.dto.ReservaDto;
import model.entity.Reserva;

public interface ConfirmacionReservaService {

    List<ReservaDto> findByClienteId(Integer clienteId);

    void save(Reserva reserva);
    
}
