package com.deni.Sistem.Informasi.Akademik.service;

import com.deni.Sistem.Informasi.Akademik.model.Pelajaran;
import com.deni.Sistem.Informasi.Akademik.repository.PelajaranRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class PelajaranService {


    @Autowired
    private PelajaranRepository pelajaranRepository;

    //Return list of states
    public List<Pelajaran> getPelajaran(){
        return pelajaranRepository.findAll();
    }

    //SAve new state
    public void save(Pelajaran pelajaran) {
        pelajaranRepository.save(pelajaran);
    }

    //get by id
    public Optional<Pelajaran> findById(int id) {
        return pelajaranRepository.findById(id);
    }

    public void delete(Integer id) {
        pelajaranRepository.deleteById(id);
    }

}
