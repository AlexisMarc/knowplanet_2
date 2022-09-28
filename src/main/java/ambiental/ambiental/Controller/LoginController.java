package ambiental.ambiental.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;

import ambiental.ambiental.Model.Usuario;
import ambiental.ambiental.Service.UsuarioServiceImpl;
import ambiental.ambiental.Service.UsuarioValidacion;
import javax.validation.Valid;

@Controller
// ----------------------------RUTA PRINCIPAL------------------------//
@RequestMapping("/login")

// ----------------------------HANDLERS O RUTAS
// SECUNDARIAS------------------------//
public class LoginController {
    @Autowired
    UsuarioValidacion usuI;

    @Autowired
    UsuarioServiceImpl usuService;


    // -------------------------------------------------------------VER FORM----------------------------------------------------//
    @GetMapping( path = {"/","","/form"})
    public String verLogin(Model m) {

        Usuario usuario = new Usuario();
        m.addAttribute("usuario", usuario);

        return "views/usuario/login";
    }


    // -------------------------------------------------------------VALIDAR----------------------------------------------------//
    @PostMapping("/validar")
    public String login(@Valid Usuario usuario, BindingResult resultado, Model m, SessionStatus status) {
        try{
            if (resultado.hasErrors()) {
                return "views/usuario/login";
            }
            status.setComplete();
            // -------------------------------------------------------------ENVIAR EMAIL Y CLAVE PARA VERIFICAR SI EXISTE----------------------------------------------------//
            Usuario response = usuI.validacionUsuario(usuario.getEmailUsuario(),  usuService.encryptThisString(usuario.getClaveUsuario()));
            System.out.println(response + "\n" + response.getRolUsuario());
            // -------------------------------------------------------------GUARDAMOS LA RESPUESTA DEL METODO ANTERIOR Y OBTENEMOS EL ROL----------------------------------------------------//
            String rol = response.getRolUsuario();
            System.out.println(rol.getClass());
            // -------------------------------------------------------------VALIDAMOS EL ROL CON IF----------------------------------------------------//

            if(rol.equalsIgnoreCase("ADMIN")){
                // -------------------------------------------------------------SI EL ROL ES ADMIN PONER LA RUTA DESEADA PARA EL ADMIN----------------------------------------------------//
                System.out.println("Entro admin");
                return "redirect:/imagen/listar";
            }else if(rol.equalsIgnoreCase("USUARIO")){
                // -------------------------------------------------------------SI EL ROL ES USUARIO PONER LA RUTA DESEADA PARA EL USUARIO----------------------------------------------------//
                System.out.println("Entro usuario");
                return "redirect:/imagen/listar";
            }
        }catch(Exception e){
            System.out.println(e.toString());
        }
        return "views/usuario/login";
    }
}