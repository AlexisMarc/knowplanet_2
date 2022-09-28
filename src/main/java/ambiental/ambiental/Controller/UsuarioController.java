package ambiental.ambiental.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.support.SessionStatus;
import ambiental.ambiental.Model.Usuario;
import ambiental.ambiental.Service.UsuarioServiceImpl;
import javax.validation.Valid;

@Controller
@SessionAttributes("usuario")
@RequestMapping("/usuario")

public class UsuarioController {
    @Autowired
    UsuarioServiceImpl usuI;

    // -------------------------------------------------------------VER----------------------------------------------------//
    @GetMapping(path = {"/","","/usuario"})
    public String verUsuarios(Model m) {

        m.addAttribute("usuario", usuI.findAll());

        return "views/usuario/usuarios";
    }

    // -------------------------------------------------------------REGISTRAR----------------------------------------------------//
    @GetMapping(value = "/addUsuario")
    public String addUsuario(Model m) {

        Usuario usuario = new Usuario();
        m.addAttribute("usuario", usuario);

        return "views/usuario/registrarUsuarios";
    }

    // -------------------------------------------------------------ACTUALIZAR----------------------------------------------------//
    @PostMapping("/addUsuario")
    public String addUsuario(@Valid Usuario usuario, BindingResult resultado, Model m, SessionStatus status) {
        if (resultado.hasErrors()) {
            return "views/usuario/registrarUsuarios";
        }
        usuario.setClaveUsuario(usuI.encryptThisString(usuario.getClaveUsuario()));
        usuI.save(usuario);
    
        status.setComplete();
        return "redirect:";
    }

    // -------------------------------------------------------------ACTUALIZAR----------------------------------------------------//
    @GetMapping(value = "/editarUsu/{idUsuario}")
    public String editarUsu(Model m, @PathVariable Integer idUsuario) {
        Usuario usuario = new Usuario();
        if (idUsuario > 0) {
            usuario = usuI.findOne(idUsuario);
        } else {
            return ("redirect:usuarios");
        }
        m.addAttribute("usuario", usuario);

        return "views/usuario/editarUsuarios";
    }
    // -------------------------------------------------------------INICAR SESIÓN----------------------------------------------------//



}
