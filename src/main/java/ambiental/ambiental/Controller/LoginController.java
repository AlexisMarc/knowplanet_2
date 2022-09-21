package ambiental.ambiental.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
// ----------------------------RUTA PRINCIPAL------------------------//
@SessionAttributes("usuario")
@RequestMapping("/login")

// ----------------------------HANDLERS O RUTAS
// SECUNDARIAS------------------------//
public class LoginController {
    
}