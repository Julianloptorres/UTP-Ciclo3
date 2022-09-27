package co.equipo1.grupo69.hoteldraco.Service;

import co.equipo1.grupo69.hoteldraco.controller.dto.ReservaDto;

public interface ReservaService {
    ReservaDto reserva = new ReservaDto();

    void crearReserva(ReservaDto reserva);
}
