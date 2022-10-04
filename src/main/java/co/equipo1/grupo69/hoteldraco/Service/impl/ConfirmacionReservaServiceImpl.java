package co.equipo1.grupo69.hoteldraco.Service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import co.equipo1.grupo69.hoteldraco.Service.ConfirmacionReservaService;
import co.equipo1.grupo69.hoteldraco.controller.dto.ClienteDto;
import co.equipo1.grupo69.hoteldraco.controller.dto.HabitacionDto;
import co.equipo1.grupo69.hoteldraco.controller.dto.ReservaDto;
import co.equipo1.grupo69.hoteldraco.model.entity.Cliente;
import co.equipo1.grupo69.hoteldraco.model.repository.ClienteRepository;
import co.equipo1.grupo69.hoteldraco.model.repository.HabitacionRepository;
import co.equipo1.grupo69.hoteldraco.model.repository.ReservaRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ConfirmacionReservaServiceImpl implements ConfirmacionReservaService{

    private final ReservaRepository reservaRepository;
    private final ClienteRepository clienteRepository;
    private final HabitacionRepository habitacionRepository;

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
        entity.setEntrada(cliente.getEntrada());
        entity.setSalida(cliente.getSalida());
        entity.setHabitacion(cliente.getHabitacion());

        clienteRepository.save(entity);
    }

    
    @Override
    public Optional<HabitacionDto> getHabitacionById(Integer id) {
        var habitacion= habitacionRepository.findById(id);
        
        if (habitacion.isEmpty()){
        return Optional.empty();
        }

        return Optional.of(new HabitacionDto(
            habitacion.get().getId(),
            habitacion.get().getPrecio(),
            habitacion.get().getTipoHabitacion(),
            habitacion.get().getImagenUrl()));
    }

    @Override
    public List<HabitacionDto> getHabitaciones() {
        var habitaciones = habitacionRepository.findAll(Sort.by("tipoHabitacion"));

        return habitaciones.stream()
                .map(hab -> new HabitacionDto(
                    hab.getId(),hab.getPrecio(),hab.getTipoHabitacion(),hab.getImagenUrl()))
                .collect(Collectors.toList());
    }

    @Override
    public ClienteDto getClienteById(Integer id) {
        var cliente= clienteRepository.findById(id);
    
            return new ClienteDto(
                cliente.get().getId(),
                cliente.get().getNombre(),
                cliente.get().getApellidos(),
                cliente.get().getEmail(),
                cliente.get().getDireccion(),
                cliente.get().getCiudad(),
                cliente.get().getPais(),
                cliente.get().getTelefono(),
                cliente.get().getPeticion(),
                cliente.get().getHabitacion(),
                cliente.get().getEntrada(),
                cliente.get().getSalida());
    }

    @Override
    public List<ClienteDto> getClientes() {
        var clientes = clienteRepository.findAll(Sort.by("id"));

        return clientes.stream()
                .map(cli -> new ClienteDto(
                    cli.getId(),cli.getNombre(),cli.getApellidos(),cli.getEmail(),
                    cli.getDireccion(), cli.getCiudad(), cli.getPais(),cli.getTelefono(),
                    cli.getPeticion(), cli.getHabitacion(),cli.getEntrada(), cli.getSalida()))
                .collect(Collectors.toList());
    }

    @Override
    public void editarCliente(ClienteDto cliente) {

        var entity = new Cliente();
        entity.setNombre(cliente.getNombre());
        entity.setApellidos(cliente.getApellidos());
        entity.setEmail(cliente.getEmail());
        entity.setDireccion(cliente.getDireccion());
        entity.setCiudad(cliente.getCiudad());
        entity.setPais(cliente.getPais());                        
        entity.setTelefono(cliente.getTelefono());
        entity.setPeticion(cliente.getPeticion());
        entity.setEntrada(cliente.getEntrada());
        entity.setSalida(cliente.getSalida());
        entity.setHabitacion(cliente.getHabitacion());

       clienteRepository.save(entity);
    }

    @Override
    public void eliminarCliente(Integer id) {
        
        clienteRepository.deleteById(id);
    }
        
}
