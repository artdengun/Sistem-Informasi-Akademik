package com.deni.Sistem.Informasi.Akademik.service;

import com.deni.Sistem.Informasi.Akademik.model.Data_Pendaftaran;
import com.deni.Sistem.Informasi.Akademik.repository.Data_Pendaftaran_Siswa_BaruRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service/*<--  digunakan untuk menandai class-class facade atau business delegate. */
public class Data_PendaftaranSiswaBaruService {
    @Autowired Data_Pendaftaran_Siswa_BaruRepository data_pendaftaran_siswa_baruRepository;

    public List<Data_Pendaftaran> getPendaftaran(){
        return data_pendaftaran_siswa_baruRepository.findAll();
    }
    public void save(Data_Pendaftaran data) {
        data_pendaftaran_siswa_baruRepository.save(data);
    }
    public Optional<Data_Pendaftaran> findById(String kode_mapel){
        return data_pendaftaran_siswa_baruRepository.findById(kode_mapel);
    }
    public void delete(String kode_mapel){
        data_pendaftaran_siswa_baruRepository.deleteById(kode_mapel);
    }

}
