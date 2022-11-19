package com.pruebaFinal.prueba.view;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.Serializable;

@Scope(value = "session")
@Component
@Data
public class SinSeguridad implements Serializable {

    private String hola = "probando ";

    @PostConstruct
    public void init(){
        System.out.print("ho....");
    }
}
