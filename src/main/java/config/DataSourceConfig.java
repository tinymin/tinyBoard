package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ResourceLoader;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

import javax.sql.DataSource;

import static org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType.H2;

/**
 * Created by SuncheolKim on 2016. 11. 27..
 */
@Configuration
public class DataSourceConfig {
    @Bean
    public DataSource getDataSource(ResourceLoader resourceLoader) {
        EmbeddedDatabase database = new EmbeddedDatabaseBuilder(resourceLoader).setType(H2).build();
        return database;
    }
}
