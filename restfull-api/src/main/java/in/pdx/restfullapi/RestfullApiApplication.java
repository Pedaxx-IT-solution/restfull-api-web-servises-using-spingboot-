package in.pdx.restfullapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*springbootapplication is the anotation from where our program starts basically from 
main method */

@SpringBootApplication
public class RestfullApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RestfullApiApplication.class, args);
	}

	
	// run () is a non static method which we have override from commandlinerunner interface
	
	@Override
	public void run(String... args) throws Exception {
	
		System.out.println("started");
		
	}

}
