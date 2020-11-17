package com.deni.Sistem.Informasi.Akademik.controller;

import com.deni.Sistem.Informasi.Akademik.model.Data_Pegawai;
import com.deni.Sistem.Informasi.Akademik.service.Data_PegawaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class Data_PegawaiController {

    @Autowired
    Data_PegawaiService data_pegawaiService;

    @RequestMapping("/pegawais")
    public String getPegawais(Model model){
        model.addAttribute("pegawais", data_pegawaiService.getPegawais());
        return "Data_Pegawai";
    }

    @PostMapping("pegawais/addNew")
    public String addNew(Data_Pegawai data_pegawai){
        data_pegawaiService.save(data_pegawai);
        return "redirect:/pegawais";
    }

    @RequestMapping("pegawais/findById")
    @ResponseBody
    public Optional<Data_Pegawai> findById(String nik) {
       return data_pegawaiService.findById(nik);
    }

    @RequestMapping(value = "pegawais/update", method = {RequestMethod.PUT ,RequestMethod.GET})
    public String update(Data_Pegawai data_pegawai){
        data_pegawaiService.save(data_pegawai);
        return "redirect:/pegawais";
    }

    @RequestMapping(value = "pegawais/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(String nik){
        data_pegawaiService.delete(nik);
        return "redirect:/pegawais";
    }

}
