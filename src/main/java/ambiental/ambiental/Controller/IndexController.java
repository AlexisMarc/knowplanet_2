package ambiental.ambiental.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @GetMapping(path = {"/","","/index","home"})
    public ModelAndView index(ModelAndView mv){
        mv.setViewName("index");
        return mv;
    }

    @GetMapping("/nosotros")
    public ModelAndView nosotros(ModelAndView mv){
        mv.setViewName("views/nosotros");
        return mv;
    }

    @GetMapping("/categorias")
    public ModelAndView categorias(ModelAndView mv){
        mv.setViewName("views/categorias");
        return mv;
    }

    @GetMapping("/noticias")
    public ModelAndView noticias(ModelAndView mv){
        mv.setViewName("views/noticias");
        return mv;
    }
    @GetMapping("/contactanos")
    public ModelAndView contactanos(ModelAndView mv){
        mv.setViewName("views/contactanos");
        return mv;
    }


}