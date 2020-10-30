package com.deni.Sistem.Informasi.Akademik.service;


import com.deni.Sistem.Informasi.Akademik.model.Kelas;
import com.deni.Sistem.Informasi.Akademik.repository.KelasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class KelasService {

    @Autowired
    private KelasRepository kelasRepository;

    //Return list of countries
    public List<Kelas> getKelas(){
        return kelasRepository.findAll();
    }

    //SAve new country
    public void save(Kelas kelas) {
        kelasRepository.save(kelas);
    }

    //get by id
    public Optional<Kelas> findById(Integer id) {
        return kelasRepository.findById(id);
    }

    public void delete(Integer id) {
        kelasRepository.deleteById(id);
    }

}
