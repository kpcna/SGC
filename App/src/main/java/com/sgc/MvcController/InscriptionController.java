package com.sgc.MvcController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InscriptionController 
{
    @RequestMapping("/inscription")
    public String getInscriptionListe(@RequestParam(value="name", required=false, defaultValue="Inscription") String name, Model model) {
        model.addAttribute("name", name);
        return "inscriptionView";
    }
}
