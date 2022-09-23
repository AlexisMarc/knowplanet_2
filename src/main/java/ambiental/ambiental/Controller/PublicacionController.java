package ambiental.ambiental.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import ambiental.ambiental.Model.Publicacion;
import ambiental.ambiental.Service.PublicacionRepository;

@Controller
public class PublicacionController {

    @Autowired
    private PublicacionRepository publicacionrepository;


    // lista
    @GetMapping("/publicacions")
    public String listarPublicacion(Model model) {
        List<Publicacion> listaPublicacion = publicacionrepository.findAll();
        model.addAttribute("listaPublicacion", listaPublicacion);
        return "views/publicacion/publicacions";
    }

    // formulario agregar
    @GetMapping("/publicacions/nuevo")
    public String mostrarFormularioDeNuevoPublicacion(Model model) {
        model.addAttribute("publicacion", new Publicacion());
        return "views/publicacion/formulario_publicacion";
    }

    // guardar
    @PostMapping("/publicacions/guardar")
    public String guardarPublicacion(Publicacion publicacion) {
        publicacionrepository.save(publicacion);
        return "redirect:/publicacions";
    }

    // editar
    @GetMapping("/publicacions/editar/{idPublicacion}")
    public String mostrarFormularioModeficarPublicacion(@PathVariable("idPublicacion")Integer idPublicacion,Model modelo){
        Publicacion publicacion = publicacionrepository.findById(idPublicacion).get();
      modelo.addAttribute("publicacion", publicacion);
      return "views/publicacion/formulario_publicacion";
    }

    // eliminar
    @GetMapping("/publicacions/eliminar/{idPublicacion}")
    public String eliminarPublicacion(@PathVariable("idPublicacion") Integer idPublicacion, Model model) {
        publicacionrepository.deleteById(idPublicacion);
        return "redirect:/publicacions";
    }

    // Cambiar estado
    @GetMapping("/publicacions/estado/{idPublicacion}")
    public String estadoPublicacion(@PathVariable("idPublicacion") Integer idPublicacion, Model modelo) {
        Optional<Publicacion> publicacion = publicacionrepository.findById(idPublicacion);
        if (publicacion.get().getEstado() == false) {
            publicacion.get().setEstado(true);
        } else {
            publicacion.get().setEstado(false);
        }
        publicacionrepository.save(publicacion.get());
        return "redirect:/publicacions";
    }
}
