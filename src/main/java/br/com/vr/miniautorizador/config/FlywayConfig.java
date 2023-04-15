package br.com.vr.miniautorizador.config;

import lombok.RequiredArgsConstructor;
import org.flywaydb.core.Flyway;
import org.springframework.boot.autoconfigure.flyway.FlywayProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@RequiredArgsConstructor
@Configuration
@EnableConfigurationProperties(FlywayProperties.class)
public class FlywayConfig {

    private final FlywayProperties flywayProperties;

    @Bean
    public Flyway flyway() {
        List<String> locations = flywayProperties.getLocations();
        Flyway flyway = Flyway.configure()
                .dataSource(flywayProperties.getUrl(), flywayProperties.getUser(), flywayProperties.getPassword())
                .locations(locations.toArray(new String[0]))
                .load();
        flyway.migrate();
        return flyway;
    }

}