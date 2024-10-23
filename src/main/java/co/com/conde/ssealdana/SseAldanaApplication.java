package co.com.conde.ssealdana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SseAldanaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SseAldanaApplication.class, args);
    }

}
