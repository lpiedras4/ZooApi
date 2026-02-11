package com.zooapi.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Setter
@Getter
public class Habitat {
    public Habitat(String nombre, int capacidad, int habitatId){
        this.nombre =nombre;
        this.capacidad = capacidad;
        this.animales = new ArrayList<>();
        this.habitatId=habitatId;

    }
    public int habitatId;
    public String nombre;
    public int capacidad;
    public List<Animal> animales;
}
