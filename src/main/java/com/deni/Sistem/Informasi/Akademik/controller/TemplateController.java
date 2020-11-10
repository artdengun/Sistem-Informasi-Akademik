package com.deni.Sistem.Informasi.Akademik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TemplateController {


    /* Menu Start Controller */

    /* Menu End Controller */

    /* Template Start Controller */

    @GetMapping("/index")
    public String goIndex() {
        return "index";
    }

    @GetMapping("/basic_table")
    public String goBasicTabel() {
        return "basic_table";
    }

    @GetMapping("/blank")
    public String goBlank() {
        return "blank";
    }

    @GetMapping("/buttons")
    public String goButtons() {
        return "buttons";
    }

    @GetMapping("/chart")
    public String goChart() {
        return "chart-chartjs";
    }

    @GetMapping("/contac")
    public String goContact() {
        return "contact";
    }

    @GetMapping("/form_validation")
    public String goFormValidation() {
        return "form_validation";
    }

    @GetMapping("/general")
    public String goGeneral() {
        return "general";
    }

    @GetMapping("/grid")
    public String goGrid() {
        return "grid";
    }

    @GetMapping("/profile")
    public String goProfile() {
        return "profile";
    }

    @GetMapping("/widget")
    public String goWidget() {
        return "widget";
    }

    @GetMapping("/form_component")
    public String goFormComponent() {
        return "form_component";
    }

    /* Template End Controller */
}
