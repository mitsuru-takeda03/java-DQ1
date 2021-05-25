package com.dq1.web.controller;

import com.dq1.game.env.Field;
import com.dq1.game.king.KingDialogue;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/field")
public class FieldController {
    private final Field field;

    public FieldController(Field field) { this.field = field; }

    @GetMapping("/king")
    public String king(Model model) {
        model.addAttribute("dialogue", KingDialogue.Start.getDialogue());
        return "field/king";
    }

    @GetMapping("/index")
    public String index(Model model) {
        return "field/index";
    }

    @GetMapping("/stay")
    public String stay(Model model) {
        return "field/index";
    }

    @GetMapping("/save")
    public String save(Model model) {
        return "redirect:/saveData/index";
    }

}
