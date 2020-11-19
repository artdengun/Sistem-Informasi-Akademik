package com.deni.Sistem.Informasi.Akademik.controller;

import com.deni.Sistem.Informasi.Akademik.model.Kelas;
import com.deni.Sistem.Informasi.Akademik.service.Data_KelasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@Controller
public class Data_KelasController {

    @Autowired
    Data_KelasService data_kelasService;

    @GetMapping("/kelass")
    public String getKelas(Model model){
        model.addAttribute("kelass", data_kelasService.getKelas());
        return "Data_Kelas";
    }

    @PostMapping("kelass/addNew")
    public String addNew(Kelas data) {
        data_kelasService.save(data);
        return "redirect:/kelass";
    }

    @RequestMapping("kelass/findById")
    @ResponseBody
    public Optional<Kelas> findById(String kode_kelas) {
        return data_kelasService.findById(kode_kelas);
    }

    @RequestMapping(value = "kelass/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Kelas data){
        data_kelasService.save(data);
        return "redirect:/kelass";
    }

    @RequestMapping(value = "kelass/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(String kode_kelas){
        data_kelasService.delete(kode_kelas);
        return "redirect:/kelass";
    }

}
