package co.equipo1.grupo69.hoteldraco.Service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import co.equipo1.grupo69.hoteldraco.Service.ConfirmacionReservaService;
import co.equipo1.grupo69.hoteldraco.controller.dto.ClienteDto;
import co.equipo1.grupo69.hoteldraco.controller.dto.HabitacionDto;
import co.equipo1.grupo69.hoteldraco.controller.dto.ReservaDto;
import co.equipo1.grupo69.hoteldraco.model.entity.Cliente;
import co.equipo1.grupo69.hoteldraco.model.entity.Habitacion;
import co.equipo1.grupo69.hoteldraco.model.repository.ClienteRepository;
import co.equipo1.grupo69.hoteldraco.model.repository.ReservaRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ConfirmacionReservaServiceImpl implements ConfirmacionReservaService{

    private final ReservaRepository reservaRepository;
    private final ClienteRepository clienteRepository;

    @Override
    public List<ReservaDto> findByClienteId(Integer clienteId) {
        var reservas =reservaRepository.findAllByClienteId(clienteId);
        return  null;
    }

    @Override
    public void saveReserva(ReservaDto reserva) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void saveCliente(ClienteDto cliente) { //Guarda la informacion del cliente en la base de datos
        var entity = new Cliente();
        
        entity.setNombre(cliente.getNombre());
        entity.setApellidos(cliente.getApellidos());
        entity.setEmail(cliente.getEmail());
        entity.setDireccion(cliente.getDireccion());
        entity.setCiudad(cliente.getCiudad());
        entity.setPais(cliente.getPais());
        entity.setTelefono(cliente.getTelefono());
        entity.setPeticion(cliente.getPeticion());

        clienteRepository.save(entity);
    }

    @Override
    public void saveHabitacion(HabitacionDto habitacion) {
        var entity = new Habitacion();
        
    }

        
}
