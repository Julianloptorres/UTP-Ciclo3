package co.equipo1.grupo69.hoteldraco;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import co.equipo1.grupo69.hoteldraco.model.entity.Habitacion;
import co.equipo1.grupo69.hoteldraco.model.repository.HabitacionRepository;
import lombok.AllArgsConstructor;
import lombok.Data;

@SpringBootApplication
public class HoteldracoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HoteldracoApplication.class, args);
	}

	@Component
	@Data
	@AllArgsConstructor
	public static class DataLoader implements CommandLineRunner{

		private final HabitacionRepository habitacionRepository;

		@Override		
		public void run(String... args) throws Exception {
			// loadHabitaciones();
			
		}

		private void loadHabitaciones(){ //Guarda la informacion de las habitaciones 
			
				habitacionRepository.save(new Habitacion(101, 99.0, "Junior","https://img.freepik.com/foto-gratis/pequeno-interior-habitacion-hotel-cama-doble-bano_1262-12489.jpg?w=900&t=st=1664544112~exp=1664544712~hmac=32e032d5cf7a9a15fe52e91dae3debf02c71b7a88f5ad9eb3c10ec8f3e659033", 
				"Area promedio de 40 m² que permite una acomodación hasta de 2 personas (un adulto y un niño). Tiene una especial vocación para alojamiento en viajes de negocios o en pareja."));		
			
				habitacionRepository.save(new Habitacion(201, 120.0, "Doble","https://images.unsplash.com/photo-1646974400439-321c4a9240b9?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80", 
				"Capacidad máxima para tres personas. Se trata de 60 m2 de superficie equipados con dos camas dobles, cajilla de seguridad, televisión, mesa de trabajo."));			
	
				habitacionRepository.save(new Habitacion(301, 150.0, "King","https://images.unsplash.com/photo-1631049035115-f96132761a38?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1470&q=80",
				"Area promedio de 100 m² amplios espacios comunes, diseñadas con cocina y estudio para reuniones."));
	
		}


	}
}
