package com.deni.Sistem.Informasi.Akademik.controller;

import com.deni.Sistem.Informasi.Akademik.model.Nilai;
import com.deni.Sistem.Informasi.Akademik.service.Data_Nilai_SiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class Data_NilaiSiswaController {

    @Autowired
    Data_Nilai_SiswaService data_nilai_siswaService;

    @GetMapping("/nilaii")
    public String getNilai(Model model){
        model.addAttribute("nilaii", data_nilai_siswaService.getNilai());
        return "Data_Nilai_Siswa";
    }


    @PostMapping("nilaii/addNew")
    public String addNew(Nilai data) {
        data_nilai_siswaService.save(data);
        return "redirect:/nilaii";
    }

    @RequestMapping("nilaii/findById")
    @ResponseBody
    public Optional<Nilai> findById(String nis){
        return data_nilai_siswaService.findById(nis);
    }

    @RequestMapping(value = "nilaii/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Nilai data){
        data_nilai_siswaService.save(data);
        return "redirect:/nilaii";
    }

    @RequestMapping(value = "nilaii/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(String nis){
        data_nilai_siswaService.delete(nis);
        return "redirect:/nilaii";
    }

}
