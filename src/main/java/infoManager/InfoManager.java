package infoManager;

// import java.util.Date;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;

import lombok.RequiredArgsConstructor;
import infoManager.model.Experience;
import infoManager.model.User;
import infoManager.model.UserRole;
import infoManager.repository.ExperienceRepository;
import infoManager.repository.UserRepository;

import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

import infoManager.service.UserService;

// @SpringBootApplication
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class }) 
@RequiredArgsConstructor
public class InfoManager implements CommandLineRunner {

  final UserService userService;
  private final ExperienceRepository experienceRepository;
  private final UserRepository userRepository;

  public static void main(String[] args) {
    SpringApplication.run(InfoManager.class, args);
  }

  @Bean
  public ModelMapper modelMapper() {
    return new ModelMapper();
  }

  // @Override
  public void run(String... params) throws Exception {
    // System.out.println(experienceRepository.findByTopic("visual code")) ;
    // Experience temp = new Experience();

    // temp.setUser(userService.search("client"));
    // temp.setContent("diue");
    // temp.setDate(new Date(30000));
    // temp.setTopic("common knowledge");
    // experienceRepository.save(temp);
    // System.out.println(temp);
     
    // System.out.println(experienceRepository.findAll());
    
    // User admin = new User();
    // admin.setUsername("admin");
    // admin.setPassword("admin");
    // admin.setEmail("admin@email.com");
    // admin.setUserRoles(new ArrayList<UserRole>(Arrays.asList(UserRole.ROLE_ADMIN)));

    // userService.signup(admin);

    // User client = new User();
    // client.setUsername("client");
    // client.setPassword("client");
    // client.setEmail("client@email.com");
    // client.setUserRoles(new ArrayList<UserRole>(Arrays.asList(UserRole.ROLE_CLIENT)));

    // userService.signup(client);
  }

}
