package com.deni.Sistem.Informasi.Akademik.controller;

import com.deni.Sistem.Informasi.Akademik.model.Kelas;
import com.deni.Sistem.Informasi.Akademik.service.KelasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class KelasController {

    @Autowired
    private KelasService kelasService;

    @GetMapping("/kelas")
    public String getCountries(Model model) {
        List<Kelas> kelasList = kelasService.getKelas();
        model.addAttribute("kelas", kelasList);
        return "kelas";
    }

    @PostMapping("/kelas/addNew")
    public String addNew(Kelas kelas) {
        kelasService.save(kelas);
        return "redirect:/kelas";
    }

    @RequestMapping("kelas/findById")
    @ResponseBody
    public Optional<Kelas> findById(Integer id) {
        return kelasService.findById(id);
    }

    @RequestMapping(value="/kelas/update", method= {RequestMethod.PUT, RequestMethod.GET})
    public String update(Kelas kelas) {
        kelasService.save(kelas);
        return "redirect:/kelas";
    }

    @RequestMapping(value="/kelas/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        kelasService.delete(id);
        return "redirect:/countries";
    }
}
