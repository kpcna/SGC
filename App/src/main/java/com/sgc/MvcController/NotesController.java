package com.sgc.MvcController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NotesController {
    @RequestMapping("/notes")
    public String getNotesListe(@RequestParam(value="name", required=false, defaultValue="Notes") String name, Model model) {
        model.addAttribute("name", name);
        return "notesView";
    }
}
