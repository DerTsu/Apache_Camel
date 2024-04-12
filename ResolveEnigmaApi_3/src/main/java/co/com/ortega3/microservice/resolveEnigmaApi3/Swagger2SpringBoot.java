package co.com.ortega3.microservice.resolveEnigmaApi3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = { "co.com.ortega3.microservice.resolveEnigmaApi3", "co.com.ortega3.microservice.resolveEnigmaApi3.api" , "co.com.ortega3.microservice.resolveEnigmaApi3.config"})
public class Swagger2SpringBoot{

   

    public static void main(String[] args) throws Exception {
        new SpringApplication(Swagger2SpringBoot.class).run(args);
    }

    
}
