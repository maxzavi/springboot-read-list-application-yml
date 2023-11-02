package pe.maxz.demoarrayparam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pe.maxz.demoarrayparam.service.DemoService;

@SpringBootApplication
public class DemoarrayparamApplication implements CommandLineRunner {

	@Autowired
	DemoService demoService;

	public static void main(String[] args) {
		SpringApplication.run(DemoarrayparamApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		demoService.print();
	}

}
