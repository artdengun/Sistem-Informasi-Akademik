package com.deni.Sistem.Informasi.Akademik.service;

import com.deni.Sistem.Informasi.Akademik.model.Data_Pelajaran;
import com.deni.Sistem.Informasi.Akademik.repository.Data_PelajaranRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service/*<--  digunakan untuk menandai class-class facade atau business delegate. */
public class Data_PelajaranService {

    @Autowired Data_PelajaranRepository data_pelajaranRepository;

    public List<Data_Pelajaran> getPelajarans(){
        return data_pelajaranRepository.findAll();
    }
    public void save(Data_Pelajaran data_pelajaran) {
        data_pelajaranRepository.save(data_pelajaran);
    }
    public Optional<Data_Pelajaran> findById(String kode_mapel){
        return data_pelajaranRepository.findById(kode_mapel);
    }
    public void delete(String kode_mapel){
        data_pelajaranRepository.deleteById(kode_mapel);
    }

}
