package co.equipo1.grupo69.hoteldraco.Service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import co.equipo1.grupo69.hoteldraco.Service.ConfirmacionReservaService;
import co.equipo1.grupo69.hoteldraco.controller.dto.ReservaDto;
import co.equipo1.grupo69.hoteldraco.model.entity.Reserva;
import co.equipo1.grupo69.hoteldraco.model.repository.ReservaRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ConfirmacionReservaServiceImpl implements ConfirmacionReservaService{

    private final ReservaRepository reservaRepository;

    @Override
    public List<ReservaDto> findByClienteId(Integer clienteId) {
        var reservas =reservaRepository.findAllByClienteId(clienteId);
        return  null;
    }

    @Override
    public void save(Reserva reserva) {
        // TODO Auto-generated method stub
        
    }
    
}
