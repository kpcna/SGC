package com.sgc.MvcController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DossierController 
{
    @RequestMapping("/dossier")
    public String getDossierListe(@RequestParam(value="name", required=false, defaultValue="Dossier") String name, Model model) {
        model.addAttribute("name", name);
        return "dossierView";
    }
}
