package ambiental.ambiental.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;

import ambiental.ambiental.Model.Imagen;
import ambiental.ambiental.Service.IImagenService;
import javax.validation.Valid;

@Controller
@RequestMapping("/imagen")
public class ImagenController {
    @Autowired
    private IImagenService imagenI;

    @GetMapping(path = { "/", "", "/listar" })
    public String listar(Model m) {
        m.addAttribute("imagenes", imagenI.findAll());

        return "views/imagen/imagen";
    }

    // Eliminar
    @GetMapping("/delete/{idImagen}")
    public String delete(@PathVariable Integer idImagen) {

        if (idImagen > 0) {
            imagenI.delete(idImagen);
        }
        return "redirect:../listar";
    }

    // Agregar Imagen
    @PostMapping("/add")
    public String add(@Valid Imagen imagen, BindingResult res, Model m, SessionStatus status) {
        if (res.hasErrors()) {
            return "views/imagen/registrar";
        }
        imagenI.save(imagen);
        status.setComplete();
        imagenes1.clear();
        return "redirect:listar";
    }

    @GetMapping("/formulario")
    public String formulario(Model m) {
        Imagen imagen = new Imagen();

        m.addAttribute("imagen", imagen);
        return "views/imagen/registrar";
    }

    ArrayList<Imagen> imagenes1 = new ArrayList<>();

    @PostMapping("/agregar")
    public String agregar(Model m, Imagen imagen) {
        imagenI.save(imagen);
        m.addAttribute("imagen", new Imagen());

        imagenes1.add(imagen);
        m.addAttribute("imagenes", imagenes1);
        System.out.println(imagenes1);
        return "views/imagen/registrar";
    }

}
