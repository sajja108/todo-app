package first.todoproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class TodoprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodoprojectApplication.class, args);
    }

}
