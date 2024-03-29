package dambi.lehenrestapia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;



@SpringBootApplication
@RestController

public class LehenRestapiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LehenRestapiaApplication.class, args);
	}
	
	@GetMapping("/")
	public String home() {
		return "Gure lehen rest apia martxan dago.";
	}

	@GetMapping("/kaixo")
	public String hello(@RequestParam(value = "izena", defaultValue = "mundua") String izena) {
		return String.format("Kaixo %s!", izena);
	}

	@GetMapping("/zenbatu")
	public String zenbatu(@RequestParam(value = "norarte", defaultValue = "5") String norarte) {

		String strEmaitza = "";
		for (int i = 1; i <= Integer.parseInt(norarte); i++) {
			strEmaitza += (i + "\n")+ "<br>";
		}
		return strEmaitza;
	}

}
