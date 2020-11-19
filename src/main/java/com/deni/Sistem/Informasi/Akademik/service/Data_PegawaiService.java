package com.deni.Sistem.Informasi.Akademik.service;

import com.deni.Sistem.Informasi.Akademik.model.Pegawai;
import com.deni.Sistem.Informasi.Akademik.repository.Data_PegawaiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service/*<--  digunakan untuk menandai class-class facade atau business delegate. */
public class Data_PegawaiService {

    @Autowired  Data_PegawaiRepository data_pegawaiRepository;

    public List<Pegawai> getPegawais(){
        return data_pegawaiRepository.findAll();
    }
    public void save(Pegawai _pegawai){
        data_pegawaiRepository.save(_pegawai);
    }
    public Optional<Pegawai> findById(String nik){
        return data_pegawaiRepository.findById(nik);
    }
    public void delete(String nik) {
        data_pegawaiRepository.deleteById(nik);
    }
}
