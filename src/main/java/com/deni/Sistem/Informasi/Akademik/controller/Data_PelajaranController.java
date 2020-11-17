package com.deni.Sistem.Informasi.Akademik.controller;

import com.deni.Sistem.Informasi.Akademik.model.Data_Pelajaran;
import com.deni.Sistem.Informasi.Akademik.service.Data_PelajaranService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;


@Controller
public class Data_PelajaranController {

    @Autowired
    Data_PelajaranService data_pelajaranService;

    @RequestMapping("/pelajarans")
    public String getPelajarans(Model model) {
        model.addAttribute("pelajarans", data_pelajaranService.getPelajarans());
        return "Data_Pelajaran";
    }

    @PostMapping("pelajarans/addNew")
    public String addNew(Data_Pelajaran data_pelajaran) {
        data_pelajaranService.save(data_pelajaran);
        return "redirect:/pelajarans";
    }

    @RequestMapping("pelajarans/findById")
    @ResponseBody
    public Optional<Data_Pelajaran> findById(String kode_mapel) {
        return data_pelajaranService.findById(kode_mapel);
    }

    @RequestMapping(value = "pelajarans/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Data_Pelajaran data_pelajaran) {
        data_pelajaranService.save(data_pelajaran);
        return "redirect:/pelajarans";
    }

    @RequestMapping(value = "pelajarans/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(String kode_mapel){
        data_pelajaranService.delete(kode_mapel);
        return"redirect:/pelajarans";
    }
}
