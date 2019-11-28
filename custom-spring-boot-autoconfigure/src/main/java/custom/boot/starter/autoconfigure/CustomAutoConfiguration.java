package custom.boot.starter.autoconfigure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wendell
 */
@Configuration
@EnableConfigurationProperties(GreetingProperties.class)
@ConditionalOnProperty(value = "greeting.enable", havingValue = "true")
public class CustomAutoConfiguration {

    @Bean
    public GreetingService greetingService(GreetingProperties greetingProperties) {
        return new GreetingService(greetingProperties.getMembers());
    }

}
