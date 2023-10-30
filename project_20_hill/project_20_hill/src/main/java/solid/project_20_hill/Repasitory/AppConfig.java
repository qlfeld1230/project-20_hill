package solid.project_20_hill.Repasitory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

@Configuration
@ComponentScan
@EnableJpaRepositories
public class AppConfig {
    private final DataSource dataSource;
    private final EntityManager em;

    @Autowired
    public AppConfig(EntityManager em, DataSource dataSource) {
        this.dataSource = dataSource;
        this.em = em;
    }
}
