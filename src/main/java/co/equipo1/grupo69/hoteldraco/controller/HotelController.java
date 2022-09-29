package co.equipo1.grupo69.hoteldraco.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import co.equipo1.grupo69.hoteldraco.Service.ConfirmacionReservaService;
import co.equipo1.grupo69.hoteldraco.controller.dto.ClienteDto;
import co.equipo1.grupo69.hoteldraco.controller.dto.ReservaDto;
import co.equipo1.grupo69.hoteldraco.controller.dto.HabitacionDto;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Controller
@Slf4j
public class HotelController {
    
    private ConfirmacionReservaService confirmacionReservaService;

    @GetMapping("/habitaciones")
    public String goToHabitaciones(Model model){
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

    @GetMapping("/pay-form")
    public String goToPayForm(Model model){
        model.addAttribute("noches", "12");
        model.addAttribute("valorNoche", "100.000");
        model.addAttribute("total", "1'200.000");
        return "pay-form";
    }


    @PostMapping("/confirmarFechas")
    public String postConfirmarFechas(@ModelAttribute ReservaDto reserva, Model model){
        model.addAttribute("infoReserva", reserva); 

        return "habitaciones";
    }

    @PostMapping("/irPago1")
    public String postIrPago(@ModelAttribute HabitacionDto habitacion, Model model){
        model.addAttribute("infoHabitacion", habitacion);
        return "pay-form";

    }

    @PostMapping("/confirmarReserva")
    public String postConfirmarReserva(@ModelAttribute ClienteDto cliente, Model model){
        log.info(cliente.toString()); //para mostrar la informacion del cliente en consola

        confirmacionReservaService.saveCliente(cliente); //guarda El cliente
        model.addAttribute("infoCliente", cliente);

        return "confirmacion";
    }
}
