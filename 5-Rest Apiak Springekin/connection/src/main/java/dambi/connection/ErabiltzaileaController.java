package dambi.connection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Controller
@RequestMapping(path = "/hasi")
public class ErabiltzaileaController{
    @Autowired
    private ErabiltzaileaRepository erabiltaRepository;
    @PostMapping(path = "/gehitu")
    public @ResponseBody String erabiltzaileaGehitu(@RequestParam String izena ){}
}