package ambiental.ambiental.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ambiental.ambiental.Model.IImagen;
import ambiental.ambiental.Model.Imagen;

@Service
public class ImagenService implements IImagenService{
    @Autowired
    private IImagen imagenI;

    @Override
    public List<Imagen> findAll() {
        return (List<Imagen>) imagenI.findAll();
    }

    @Override
    public void save(Imagen imagen) {
        imagenI.save(imagen);
    }

    @Override
    public Imagen findOne(Integer idImagen) {
        return imagenI.findById(idImagen).orElse(null);
    }

    @Override
    public void delete(Integer idImagen) {
        imagenI.deleteById(idImagen);
    }
    
}
