package ambiental.ambiental.Service;

import org.springframework.data.jpa.repository.JpaRepository;

import ambiental.ambiental.Model.Publicacion;

public interface PublicacionRepository extends JpaRepository<Publicacion, Integer>{
    
}
