package co.equipo1.grupo69.hoteldraco.Service;

import java.util.List;

import co.equipo1.grupo69.hoteldraco.controller.dto.ClienteDto;
import co.equipo1.grupo69.hoteldraco.controller.dto.ReservaDto;


public interface ConfirmacionReservaService {

    List<ReservaDto> findByClienteId(Integer clienteId);

    void saveReserva(ReservaDto reserva);

    void saveCliente(ClienteDto cliente); // guarda el cliente 
    
}
