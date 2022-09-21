package ambiental.ambiental.Service;

import java.util.List;

import ambiental.ambiental.Model.Usuario;


public interface IUsuarioService {
    
    public List<Usuario> findAll();
    public void save(Usuario usuario);
    public Usuario findOne(Integer idUsuario);
    public void delete(Integer idUsuario);

}