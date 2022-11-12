package com.Prueba;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class PrestamoConfiguracion {


    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:sqlserver://192.168.10.136;database=master;trustServerCertificate=true");
        dataSource.setUsername("UCEM_IRENE");
        dataSource.setPassword("1234");

        return dataSource;
    }
}
