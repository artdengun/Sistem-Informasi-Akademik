package com.deni.Sistem.Informasi.Akademik.service;

import com.deni.Sistem.Informasi.Akademik.model.Data_Absen_Siswa;
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
    public List<Data_Absen_Siswa> getAbsens(){
        return data_absenSiswaRepository.findAll();
    }

    // simpan data absen
    public void  save(Data_Absen_Siswa data_absen_siswa){
        data_absenSiswaRepository.save(data_absen_siswa);
    }

    // get dari id
    public Optional<Data_Absen_Siswa> findById(String nis){
        return data_absenSiswaRepository.findById(nis);
    }

    // hapus data
    public void delete(String nis) {
        data_absenSiswaRepository.deleteById(nis);
    }
}
