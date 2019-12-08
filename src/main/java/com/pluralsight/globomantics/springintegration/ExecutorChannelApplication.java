package com.pluralsight.globomantics.springintegration;

import com.pluralsight.globomantics.springintegration.service.RegistrationService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ExecutorChannelApplication implements CommandLineRunner, ExitCodeGenerator {
	private static final Logger logger = LogManager.getLogger(ExecutorChannelApplication.class);

	@Autowired
	private RegistrationService registrationService;

	@Autowired
	private ApplicationContext applicationContext;

    @Override
    public void run(String... args) throws Exception {
    	registrationService.setupReservation("Smith", "Jones", "Anderson");
    }

    @Override
    public int getExitCode() {
        return 0;
    }

	public static void main(String[] args) {
		SpringApplication.run(ExecutorChannelApplication.class, args);
	}
}
