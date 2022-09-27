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
			// TODO Auto-generated method stub
			
		}

		private void loadHabitaciones(){ //Guarda la informacion de las habitaciones 

			habitacionRepository.save(new Habitacion(101, 60.2, "Sencilla", null));
			habitacionRepository.save(new Habitacion(201, 70.2, "Doble", null));
			habitacionRepository.save(new Habitacion(301, 160.2, "King", null));

		}


	}
}
