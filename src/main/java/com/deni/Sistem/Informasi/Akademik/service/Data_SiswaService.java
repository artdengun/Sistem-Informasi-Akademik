package com.deni.Sistem.Informasi.Akademik.service;

import com.deni.Sistem.Informasi.Akademik.model.Data_Siswa;
import com.deni.Sistem.Informasi.Akademik.repository.Data_SiswaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service/*<--  digunakan untuk menandai class-class facade atau business delegate. */
public class Data_SiswaService {
    @Autowired
    Data_SiswaRepository data_siswaRepository;

    public List<Data_Siswa> getSiswa(){
        return data_siswaRepository.findAll();
    }
    public void save(Data_Siswa data_siswa){
        data_siswaRepository.save(data_siswa);
    }
    public Optional<Data_Siswa> findById(String nis_siswa){
        return data_siswaRepository.findById(nis_siswa);
    }
    public void delete(String nis_siswa){
        data_siswaRepository.deleteById(nis_siswa);
    }
}
