package guru.springframework.sfgpetclinic.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping ("/owners")
@Controller
public class OwnerController {

    @RequestMapping({"", "/index", "/index.html"})
    public String listOwners(){

        return "owners/index"; // owners folder in templates folder --> index.html
    }

}
