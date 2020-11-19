package com.deni.Sistem.Informasi.Akademik.repository;

import com.deni.Sistem.Informasi.Akademik.model.Siswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Data_SiswaRepository extends JpaRepository<Siswa, String> {
}
