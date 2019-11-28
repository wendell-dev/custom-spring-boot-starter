package custom.boot.starter.sample;

import custom.boot.starter.autoconfigure.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wendell
 */
@SpringBootApplication
public class Application implements CommandLineRunner {

    private final GreetingService greetingService;

    @Autowired
    public Application(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        greetingService.sayHello();
    }
}
