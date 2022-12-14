package com.Prueba.configuracion;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class PrestamoConfiguracion {

    @Value("${usr}")
    private String user;

    @Value("${cls}")
    private String cla;


    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:sqlserver://192.168.10.136;database=master;trustServerCertificate=true");
        dataSource.setUsername(user);
        dataSource.setPassword(cla);

        return dataSource;
    }
}
