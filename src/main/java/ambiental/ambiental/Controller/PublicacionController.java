package ambiental.ambiental.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;

import ambiental.ambiental.Model.Publicacion;
import ambiental.ambiental.Service.PublicacionRepository;
import javax.validation.Valid;

@Controller
@RequestMapping("/publicacion")
public class PublicacionController {

    @Autowired
    private PublicacionRepository publicacionrepository;


    // lista
    @GetMapping(path = {"/","","/publicacions"})
    public String listarPublicacion(Model model) {
        List<Publicacion> listaPublicacion = publicacionrepository.findAll();
        model.addAttribute("listaPublicacion", listaPublicacion);
        return "views/publicacion/publicacions";
    }

    // formulario agregar
    @GetMapping("/nuevo")
    public String mostrarFormularioDeNuevoPublicacion(Model model) {
        model.addAttribute("publicacion", new Publicacion());
        return "views/publicacion/formulario_publicacion";
    }

    // guardar
    @PostMapping("/guardar")
    public String guardarPublicacion(@Valid Publicacion publicacion,BindingResult res, Model m, SessionStatus status) {
        if(res.hasErrors()){
            return "views/publicacion/formulario_publicacion";
        }
        publicacionrepository.save(publicacion);
        return "redirect:";
    }

    // editar
    @GetMapping("/editar/{idPublicacion}")
    public String mostrarFormularioModeficarPublicacion(@PathVariable("idPublicacion")Integer idPublicacion,Model modelo){
        Publicacion publicacion = publicacionrepository.findById(idPublicacion).get();
      modelo.addAttribute("publicacion", publicacion);
      return "views/publicacion/formulario_publicacion";
    }

    // eliminar
    @GetMapping("/eliminar/{idPublicacion}")
    public String eliminarPublicacion(@PathVariable("idPublicacion") Integer idPublicacion, Model model) {
        publicacionrepository.deleteById(idPublicacion);
        return "redirect:";
    }

    // Cambiar estado
    @GetMapping("/estado/{idPublicacion}")
    public String estadoPublicacion(@PathVariable("idPublicacion") Integer idPublicacion, Model modelo) {
        Optional<Publicacion> publicacion = publicacionrepository.findById(idPublicacion);
        if (publicacion.get().getEstado() == false) {
            publicacion.get().setEstado(true);
        } else {
            publicacion.get().setEstado(false);
        }
        publicacionrepository.save(publicacion.get());
        return "redirect:";
    }
}
