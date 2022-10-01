package co.equipo1.grupo69.hoteldraco.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import co.equipo1.grupo69.hoteldraco.Service.ConfirmacionReservaService;
import co.equipo1.grupo69.hoteldraco.controller.dto.ClienteDto;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Controller
@Slf4j
public class HotelController {
    
    private ConfirmacionReservaService confirmacionReservaService;

    @GetMapping("/habitaciones")
    public String goToHabitaciones(Model model){
        var habitaciones = this.confirmacionReservaService.getHabitaciones();
        model.addAttribute("habitaciones", habitaciones);
        return "habitaciones";
    }

    @GetMapping("/sencilla")
    public String goToSencilla(Model model){
        return "sencilla";
    }
   
    @GetMapping("/doble")
    public String goToDoble(Model model){
        return "room2";
    }

    @GetMapping("/king")
    public String goToKing(Model model){
        return "habitacion_king";
    }

    @GetMapping("/registro")
    public String goToRegistro(Model model){
        return "registro";
    }    

    @GetMapping("/buscar")
    public String goToIndex(Model model){
        var clientes = this.confirmacionReservaService.getClientes();
        model.addAttribute("clientes", clientes);
        return "buscar";
    }

    @PostMapping("/confirmarFechas")
    public String postConfirmarFechas(Model model){

        var habitaciones = this.confirmacionReservaService.getHabitaciones();
        model.addAttribute("habitaciones", habitaciones);
        return "habitaciones";
    }

    @GetMapping("/irPago/{id}")
    public String postIrPago(@PathVariable("id") Integer id, Model model){
        

        var habitacionOp= confirmacionReservaService.getHabitacionById(id);
        if(habitacionOp.isEmpty()){
            model.addAttribute("error", "La habitacion no existe");
        } else{
            var habitacion = habitacionOp.get();

            model.addAttribute("tipoHabitacion", habitacion.getTipoHabitacion());
            model.addAttribute("id", habitacion.getId());
            model.addAttribute("precio", habitacion.getPrecio());
            model.addAttribute("imagen", habitacion.getImagenUrl());
        }
        
        return "pay-form";

    }

    @PostMapping("/confirmarReserva")
    public String postConfirmarReserva(@ModelAttribute ClienteDto cliente, Model model){
        log.info(cliente.toString()); //para mostrar la informacion del cliente en consola

        confirmacionReservaService.saveCliente(cliente); //guarda El cliente
        model.addAttribute("infoCliente", cliente);

        return "confirmacion";
    }


    @GetMapping("/reserva/{id}")
    public String buscarReserva(@PathVariable("id") Integer id, Model model){
        var clienteOp= confirmacionReservaService.getClienteById(id);
        if(clienteOp.isEmpty()){
            model.addAttribute("error", "La habitacion no existe");
        } else{
            var cliente = clienteOp.get();

            model.addAttribute("entrada", cliente.getEntrada());
            model.addAttribute("id", cliente.getId().toString());
            model.addAttribute("salida",cliente.getSalida());
            model.addAttribute("habitacion", cliente.getHabitacion());
            model.addAttribute("nombre", cliente.getNombre());
            model.addAttribute("apellidos", cliente.getApellidos());
            model.addAttribute("email", cliente.getEmail());
            model.addAttribute("direccion", cliente.getDireccion());
            model.addAttribute("ciudad", cliente.getCiudad());
            model.addAttribute("pais", cliente.getPais());
            model.addAttribute("telefono", cliente.getTelefono());
            model.addAttribute("peticion", cliente.getPeticion());
            
        }
        return "modificar";
        
    }
}
