package com.deni.Sistem.Informasi.Akademik.controller;


import com.deni.Sistem.Informasi.Akademik.model.Data_Siswa;
import com.deni.Sistem.Informasi.Akademik.service.Data_SiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class Data_SiswaController {
    @Autowired  Data_SiswaService data_siswaService;

    @RequestMapping("/siswas")
    public String getSiswas(Model model){
        model.addAttribute("siswas", data_siswaService.getSiswa());
        return "Data_Siswa";
    }

    @PostMapping("siswas/addNew")
    public String addNew(Data_Siswa data_siswa){
        data_siswaService.save(data_siswa);
        return "redirect:/siswas";
    }
    @RequestMapping("siswas/findById")
    @ResponseBody
    public Optional<Data_Siswa> findById(String nis_siswa){
        return data_siswaService.findById(nis_siswa);
    }

    @RequestMapping(value = "siswas/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Data_Siswa data_siswa){
        data_siswaService.save(data_siswa);
        return "redirect:/siswas";
    }

    @RequestMapping(value = "siswas/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(String nis_siswa) {
        data_siswaService.delete(nis_siswa);
        return "redirect:/siswas";
    }

}
