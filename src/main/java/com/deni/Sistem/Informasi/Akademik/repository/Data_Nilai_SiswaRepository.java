package com.deni.Sistem.Informasi.Akademik.repository;

import com.deni.Sistem.Informasi.Akademik.model.Data_Nilai_Siswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Data_Nilai_SiswaRepository  extends JpaRepository<Data_Nilai_Siswa, String> {
}
