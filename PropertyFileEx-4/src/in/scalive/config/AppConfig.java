package in.scalive.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "in.scalive.beans")
@PropertySource("classpath:/in/scalive/resources/student.properties")
public class AppConfig {

	
}
