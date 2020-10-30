package com.deni.Sistem.Informasi.Akademik.controller;

import com.deni.Sistem.Informasi.Akademik.model.Kelas;
import com.deni.Sistem.Informasi.Akademik.model.Pelajaran;
import com.deni.Sistem.Informasi.Akademik.service.KelasService;
import com.deni.Sistem.Informasi.Akademik.service.PelajaranService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class PelajaranController {


    @Autowired
    private PelajaranService pelajaranService;
    @Autowired	private KelasService kelasService;


    @GetMapping("/pelajarans")
    public String getPelajaran(Model model) {
        List<Pelajaran> pelajaranList = pelajaranService.getPelajaran();
        model.addAttribute("pelajarans", pelajaranList);

        List<Kelas> kelasList = kelasService.getKelas();
        model.addAttribute("kelas", kelasList);

        return "pelajaran";
    }

    @PostMapping("/pelajarans/addNew")
    public String addNew(Pelajaran pelajaran) {
        pelajaranService.save(pelajaran);
        return "redirect:/pelajarans";
    }

    @RequestMapping("pelajarans/findById")
    @ResponseBody
    public Optional<Pelajaran> findById(int id) {
        return pelajaranService.findById(id);
    }

    @RequestMapping(value="/pelajarans/update", method= {RequestMethod.PUT, RequestMethod.GET})
    public String update(Pelajaran pelajaran) {
        pelajaranService.save(pelajaran);
        return "redirect:/pelajarans";
    }

    @RequestMapping(value="/pelajarans/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        pelajaranService.delete(id);
        return "redirect:/pelajarans";
    }

}
