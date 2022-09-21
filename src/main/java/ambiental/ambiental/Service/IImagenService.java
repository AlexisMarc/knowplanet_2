package ambiental.ambiental.Service;

import java.util.List;

import ambiental.ambiental.Model.Imagen;

public interface IImagenService {
    public List<Imagen> findAll();
    public void save(Imagen imagen);
    public Imagen findOne(Integer idImagen);
    public void delete(Integer idImagen);
}
