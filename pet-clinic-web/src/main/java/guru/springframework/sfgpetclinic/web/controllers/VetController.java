package guru.springframework.sfgpetclinic.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String listVets(){

        return "vets/index"; // vets folder in templates folder --> index.html
    }

}
