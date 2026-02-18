package com.zooapi.servicio;

import com.zooapi.model.Habitat;
import com.zooapi.repositorio.HabitatRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HabitatServicio {
    private final HabitatRepositorio habitatRepositorio;
    public HabitatServicio(HabitatRepositorio habitatRepositorio){
        this.habitatRepositorio = habitatRepositorio;
    }
    public List<Habitat> obtenerHabitats(){
        return habitatRepositorio.obtenerHabitats();
    }



}
