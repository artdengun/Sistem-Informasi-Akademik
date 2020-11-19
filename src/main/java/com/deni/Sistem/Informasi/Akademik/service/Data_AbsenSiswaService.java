package com.deni.Sistem.Informasi.Akademik.service;

import com.deni.Sistem.Informasi.Akademik.model.Absen;
import com.deni.Sistem.Informasi.Akademik.repository.Data_AbsenSiswaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service/*<--  digunakan untuk menandai class-class facade atau business delegate. */
public class Data_AbsenSiswaService {

    @Autowired
    Data_AbsenSiswaRepository data_absenSiswaRepository;

    // nilai balik tampilkan list
    public List<Absen> getAbsens(){
        return data_absenSiswaRepository.findAll();
    }

    // simpan data absen
    public void  save(Absen _absen_){
        data_absenSiswaRepository.save(_absen_);
    }

    // get dari id
    public Optional<Absen> findById(String nis){
        return data_absenSiswaRepository.findById(nis);
    }

    // hapus data
    public void delete(String nis) {
        data_absenSiswaRepository.deleteById(nis);
    }
}
