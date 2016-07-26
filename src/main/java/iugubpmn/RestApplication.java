package iugubpmn;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.camunda.bpm.spring.boot.starter.rest.CamundaJerseyResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Autowired;
import org.glassfish.jersey.server.ResourceConfig;

@SpringBootApplication
public class RestApplication {

  public static void main(final String... args) throws Exception {
    ApplicationContext ctx = SpringApplication.run(RestApplication.class, args);

    System.out.println("Let's inspect the beans provided by Spring Boot:");

    String[] beanNames = ctx.getBeanDefinitionNames();
    Arrays.sort(beanNames);
    for (String beanName : beanNames) {
      System.out.println(beanName);
    }
  }

 @Bean
  public ResourceConfig jerseyConfig() {
    return new CamundaJerseyResourceConfig();
  }

}
