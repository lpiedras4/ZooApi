package com.zooapi.controlador;


import com.zooapi.model.Habitat;
import com.zooapi.repositorio.HabitatRepositorio;
import com.zooapi.servicio.HabitatServicio;
import lombok.AllArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //automaticamente regresa archivos JSON
@RequestMapping("/habitats")
public class HabitatControlador {
    private final HabitatServicio habitatServicio;
    private final HabitatRepositorio habitatRepositorio;

    public HabitatControlador(HabitatServicio habitatServicio, HabitatRepositorio habitatRepositorio){
        this.habitatServicio = habitatServicio;
        this.habitatRepositorio = habitatRepositorio;
    }
/*
Estructura
@Metodo HTTP
public objetoDeRespuesta nombreDeMetodo(params){
return objeto
}
 */
    @GetMapping public ResponseEntity<List<Habitat>> obtenerHabitats(){
        return new ResponseEntity<>(habitatServicio.obtenerHabitats(), HttpStatus.OK);
    }
}
