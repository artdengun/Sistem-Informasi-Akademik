package com.deni.Sistem.Informasi.Akademik.controller;

import com.deni.Sistem.Informasi.Akademik.model.Data_Absen_Siswa;
import com.deni.Sistem.Informasi.Akademik.service.Data_AbsenSiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class Data_AbsenSiswController {

    @Autowired
    Data_AbsenSiswaService absenSiswaService;


    @GetMapping("/absens")
    public String getAbsens(Model model){
        model.addAttribute("absens", absenSiswaService.getAbsens());
        return "Data_Absen_Siswa";
    }

    @PostMapping("absens/addNew")
    public String addNew(Data_Absen_Siswa data) {
        absenSiswaService.save(data);
        return "redirect:/absens";
    }

    @RequestMapping("absens/findById")
    @ResponseBody
    public Optional<Data_Absen_Siswa> findById(String nis){
        return findById(nis);

    }

    @RequestMapping(value = "absens/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String delete(String nis){
        absenSiswaService.delete(nis);
        return "redirect:/absens";
    }
}
