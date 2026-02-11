package servicio;

import com.zooapi.model.Habitat;
import com.zooapi.repositorio.HabitatRepositorio;
import org.springframework.stereotype.Service;

@Service
public class HabitatServicio {
    private final HabitatRepositorio habitatRepositorio;
    public HabitatServicio(HabitatRepositorio habitatRepositorio){
        this.habitatRepositorio = habitatRepositorio;
    }
}
