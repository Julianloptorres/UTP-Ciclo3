package co.equipo1.grupo69.hoteldraco.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("api/reser")
public class ReservaRestController {

    public String goToReserva(Model model){
        return "reserva";
    }
    
}
