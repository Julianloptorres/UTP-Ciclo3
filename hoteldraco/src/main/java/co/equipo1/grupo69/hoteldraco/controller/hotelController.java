package co.equipo1.grupo69.hoteldraco.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HotelController {
    
    @GetMapping("/habitaciones")
    public String goToHabitaciones(Model model){
        return "habitaciones";
    }
}
