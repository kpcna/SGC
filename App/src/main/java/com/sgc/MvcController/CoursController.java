package com.sgc.MvcController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CoursController 
{
    @RequestMapping("/cours")
    public String getCoursListe(@RequestParam(value="name", required=false, defaultValue="Cours") String name, Model model) {
        model.addAttribute("name", name);
        return "coursView";
    }
}
