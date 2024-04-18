package dio.expertostech.tutorialmicrosservicokafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class TutorialMicrosServicoKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorialMicrosServicoKafkaApplication.class, args);
	}

}
