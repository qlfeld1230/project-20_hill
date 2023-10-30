package solid.project_20_hill;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.sql.DataSource;

//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@SpringBootApplication()
public class Project20HillApplication {
	public static void main(String[] args) {
		SpringApplication.run(Project20HillApplication.class, args);
	}

}
