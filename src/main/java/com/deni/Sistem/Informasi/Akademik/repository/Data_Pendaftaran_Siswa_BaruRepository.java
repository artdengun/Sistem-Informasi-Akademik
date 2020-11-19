package com.deni.Sistem.Informasi.Akademik.repository;

import com.deni.Sistem.Informasi.Akademik.model.Pendaftaran;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Data_Pendaftaran_Siswa_BaruRepository  extends JpaRepository<Pendaftaran, String> {
}
