package dambi.connection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public interface ConnectionApplication extends CrudRepositoryApplication, Integer{

	public static void main(String[] args) {
		SpringApplication.run(ConnectionApplication.class, args);
	}

}
