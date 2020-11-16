package com.deni.Sistem.Informasi.Akademik.service;

import com.deni.Sistem.Informasi.Akademik.model.Data_Nilai_Siswa;
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
    public List<Data_Nilai_Siswa> getNilai(){
        return data_nilai_siswa_repository.findAll();
    }

    // simpan data

    public void save(Data_Nilai_Siswa data_nilai_siswa){
        data_nilai_siswa_repository.save(data_nilai_siswa);
    }

    // get by id

    public Optional<Data_Nilai_Siswa> findById(String nis){
        return data_nilai_siswa_repository.findById(nis);
    }

    // delete
    public void delete(String nis){
        data_nilai_siswa_repository.deleteById(nis);
    }
 }
