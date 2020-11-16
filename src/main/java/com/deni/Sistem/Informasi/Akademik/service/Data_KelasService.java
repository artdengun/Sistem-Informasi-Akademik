package com.deni.Sistem.Informasi.Akademik.service;

import com.deni.Sistem.Informasi.Akademik.model.Data_Kelas;
import com.deni.Sistem.Informasi.Akademik.repository.Data_KelasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service/*<--  digunakan untuk menandai class-class facade atau business delegate. */
public class Data_KelasService {

        @Autowired Data_KelasRepository data_kelasRepository;

        // tampilkan list
    public List<Data_Kelas> getKelas(){
        return data_kelasRepository.findAll();
    }
    // simpan data
    public void save(Data_Kelas data_kelas) {
        data_kelasRepository.save(data_kelas);
    }

    // get dari id

    public Optional<Data_Kelas> findById(String kode_kelas) {
        return data_kelasRepository.findById(kode_kelas);
    }

    // delete
    public void delete(String kode_kelas) {
        data_kelasRepository.deleteById(kode_kelas);
    }
}
