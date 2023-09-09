package dio.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.springdatajpa.model.User;
import dio.springdatajpa.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner{
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User inputUser = new User();
        inputUser.setName("Julia");
        inputUser.setUsername("julinha");
        inputUser.setPassword("123mudar");

        userRepository.save(inputUser);

        for (User user: userRepository.findAll()) {
            System.out.println(user);
        }
    }
    
}
