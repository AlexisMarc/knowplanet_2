package ambiental.ambiental.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ambiental.ambiental.Model.Formulario.Formulario;

@Controller
@RequestMapping("/formulario")
public class FormularioController {
    @GetMapping( "/form")
    public String verLogin(Model m) {

        Formulario Formulario = new Formulario();
        m.addAttribute("Formulario", Formulario);

        return "views/Formulario/form";
    }
}
