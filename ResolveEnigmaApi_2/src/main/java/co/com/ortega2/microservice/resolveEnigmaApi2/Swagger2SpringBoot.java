package co.com.ortega2.microservice.resolveEnigmaApi2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = { "co.com.ortega2.microservice.resolveEnigmaApi2", "co.com.ortega2.microservice.resolveEnigmaApi2.api" , "co.com.ortega2.microservice.resolveEnigmaApi2.config"})
public class Swagger2SpringBoot  {

    

    public static void main(String[] args) throws Exception {
        new SpringApplication(Swagger2SpringBoot.class).run(args);
    }

   
}
