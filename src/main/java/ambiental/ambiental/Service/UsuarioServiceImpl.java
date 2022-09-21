package ambiental.ambiental.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ambiental.ambiental.Model.IUsuario;
import ambiental.ambiental.Model.Usuario;



//---------------------------------------INICIO CAPA DE SERVICIOS--------------------------------------------//
@Service

public class UsuarioServiceImpl implements IUsuarioService{

    @Autowired
    private IUsuario usuI;

    @Autowired
    static IUsuarioService iUsuarioService;
    //---------------------------------------MÉTODO PARA MOSTRAR TODOS LOS DATOS--------------------------------------------//
    @Override
     public List<Usuario> findAll() {
     return (List<Usuario>) usuI.findAll();
     }


    //---------------------------------------MÉTODO PARA GUARDAR UN DATO-------------------------------------------//
    @Override
    public void save(Usuario usuario){
        usuI.save(usuario);
    } 


    //---------------------------------------MÉTODO PARA TOMAR UN ID ACTUALIZAR O REGISTRAR UN DATO--------------------------------------------//
      @Override
      public Usuario findOne(Integer idUsuario){
          return usuI.findById(idUsuario).orElse(null);
    }
    

    //---------------------------------------MÉTODO PARA ELIMINAR UN DATO-------------------------------------------//
      @Override
      public void delete(Integer idUsuario) {
      usuI.deleteById(idUsuario);
    }

        //---------------------------------------MÉTODO PARA VALIDAR USUARIO-------------------------------------------//


}

