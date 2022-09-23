package Service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import Service.ConfirmacionReservaService;
import co.equipo1.grupo69.hoteldraco.controller.dto.ReservaDto;
import lombok.AllArgsConstructor;
import model.entity.Reserva;
import model.repository.ReservaRepository;

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
