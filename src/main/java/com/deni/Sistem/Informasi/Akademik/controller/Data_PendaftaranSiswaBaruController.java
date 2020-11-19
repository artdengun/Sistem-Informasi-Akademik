package com.deni.Sistem.Informasi.Akademik.controller;

import com.deni.Sistem.Informasi.Akademik.model.Pendaftaran;
import com.deni.Sistem.Informasi.Akademik.service.Data_PendaftaranSiswaBaruService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class Data_PendaftaranSiswaBaruController {

    @Autowired
    Data_PendaftaranSiswaBaruService data_pendaftaranSiswaBaruService;

    @RequestMapping("/pendaftarans")
    public String getPendaftarans(Model model){
        model.addAttribute("pendaftarans", data_pendaftaranSiswaBaruService.getPendaftaran());
        return "Data_Pendaftaran";
    }

    @PostMapping("pendaftarans/addNew")
    public String addNew(Pendaftaran _pendaftaran){
        data_pendaftaranSiswaBaruService.save(_pendaftaran);
        return "redirect:/pendaftarans";
    }

    @RequestMapping("pendaftarans/findById")
    @ResponseBody
    public Optional<Pendaftaran> findById(String kode_mapel){
        return data_pendaftaranSiswaBaruService.findById(kode_mapel);
    }

    @RequestMapping(value = "pendaftarans/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Pendaftaran _pendaftaran){

        data_pendaftaranSiswaBaruService.save(_pendaftaran);
        return "redirect:/pendaftarans";
    }

    @RequestMapping(value = "pendaftarans/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(String kode_mapel){
    data_pendaftaranSiswaBaruService.delete(kode_mapel);
        return "redirect:/pendaftarans";
    }
}
