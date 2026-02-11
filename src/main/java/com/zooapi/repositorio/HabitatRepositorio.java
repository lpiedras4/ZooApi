package com.zooapi.repositorio;

import com.zooapi.model.Habitat;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 Capa donde se fuardan los datos
 O en su defecto mandarlos a la base de datos
 */
@Service
public class HabitatRepositorio {
    private int habitatId =1;
    List <Habitat> habitats = new ArrayList<>();

    public HabitatRepositorio(){  }
    public Habitat guardarHabitat(Habitat habitat){
        habitats.add(habitat);
        habitat.setHabitatId(habitatId);
        habitatId++;
        return habitat;
    }

}
