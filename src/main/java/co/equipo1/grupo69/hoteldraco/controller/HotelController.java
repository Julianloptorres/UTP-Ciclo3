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

    @GetMapping("/registro")
    public String goToregistro(Model model){
        return "registro";
    }

    @GetMapping("/doble")
    public String goToDoble(Model model){
        return "room2";
    }
//comentario para grabar
    @GetMapping("/king")
    public String goToKing(Model model){
        return "habitacion_king";
    }

    @GetMapping("/pay-form")
    public String goToPayForm(Model model){
        model.addAttribute("entrada", "30 de Noviembre 2022"); // esto es solo para ver donde debe ir los datos de la reserva
        model.addAttribute("salida", "12 de Diciembre 2022");
        model.addAttribute("adultos", "2");
        model.addAttribute("childrem", "3");
        model.addAttribute("noches", "12");
        model.addAttribute("valorNoche", "100.000");
        model.addAttribute("total", "1'200.000");
        return "pay-form";
    }


    @PostMapping("/confirmarFechas")
    public String postConfirmarFechas(@ModelAttribute ReservaDto reserva, Model model){
        model.addAttribute("infoReserva", reserva); // da error [Error al convertir el valor de propiedad del tipo 'java.lang.String' al tipo requerido 'java.util.Date'

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
