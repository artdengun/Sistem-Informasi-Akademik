package com.deni.Sistem.Informasi.Akademik.service;

import com.deni.Sistem.Informasi.Akademik.model.Nilai;
import com.deni.Sistem.Informasi.Akademik.repository.Data_Nilai_SiswaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service/*<--  digunakan untuk menandai class-class facade atau business delegate. */
public class Data_Nilai_SiswaService {
    @Autowired
    Data_Nilai_SiswaRepository data_nilai_siswa_repository;


    // tampilkan data
    public List<Nilai> getNilai(){
        return data_nilai_siswa_repository.findAll();
    }

    // simpan data

    public void save(Nilai _nilai_){
        data_nilai_siswa_repository.save(_nilai_);
    }

    // get by id

    public Optional<Nilai> findById(String nis){
        return data_nilai_siswa_repository.findById(nis);
    }

    // delete
    public void delete(String nis){
        data_nilai_siswa_repository.deleteById(nis);
    }
 }
