package org.vkrajput.english.monkey.persistence.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackages = {
                "org.vkrajput.english.monkey.persistence.repository"
        })

public class EnglishMonkeyPersistenceConfig {

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.hikari.username}")
    private String hikariUserName;

    @Value("${spring.datasource.hikari.password}")
    private String hikariPassword;

    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;


    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder.create().driverClassName(driverClassName).url(url).username(hikariUserName).password(hikariPassword).build();
    }


}