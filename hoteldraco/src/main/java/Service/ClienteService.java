package Service;

import java.util.List;
import java.util.Optional;

import co.equipo1.grupo69.hoteldraco.controller.dto.ClienteDto;
import co.equipo1.grupo69.hoteldraco.controller.dto.ReservaDto;

public interface ClienteService {
    List <ClienteDto> getClientes();

    Optional<ClienteDto> getClientesById(Integer id);

    List<ReservaDto> getReservaByClienteId(Integer categoryId);
}
