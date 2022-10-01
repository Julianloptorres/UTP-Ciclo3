package co.equipo1.grupo69.hoteldraco.Service;

import java.util.List;
import java.util.Optional;

import co.equipo1.grupo69.hoteldraco.controller.dto.ClienteDto;
import co.equipo1.grupo69.hoteldraco.controller.dto.HabitacionDto;
import co.equipo1.grupo69.hoteldraco.controller.dto.ReservaDto;


public interface ConfirmacionReservaService {

    List<ReservaDto> findByClienteId(Integer clienteId);

    void saveReserva(ReservaDto reserva);  

    List<HabitacionDto> getHabitaciones();

    List<ClienteDto> getClientes();
    
    Optional<HabitacionDto> getHabitacionById(Integer id);

    void saveCliente(ClienteDto cliente); // guarda el cliente
    
    Optional<ClienteDto> getClienteById(Integer id); // buscar el cliente por id
    
}
