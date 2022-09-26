package co.equipo1.grupo69.hoteldraco.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.AllArgsConstructor;

//Spring MVC

@AllArgsConstructor
@Controller
public class HotelController {

    // @GetMapping(value = { "/", "/index", "/index.html" })    
    // public String goToIndex(Model model) {
    //     return "index";
    // }
    
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

    @GetMapping("/pay-form")
    public String goToPayForm(Model model){
        model.addAttribute("entrada", "30 de Noviembre 2022");
        model.addAttribute("salida", "12 de Diciembre 2022");
        model.addAttribute("adultos", "2");
        // No acepta caracteres especiales ni la letra ñ en el 
        // nombre de la variable por eso no utilice niños como 
        // nombre, !nota para tener encuenta y aprender jajaja¡.
        model.addAttribute("childrem", "3");
        model.addAttribute("noches", "12");
        model.addAttribute("valorNoche", "100.000");
        model.addAttribute("total", "1'200.000");
        return "pay-form";
    }
}
