package com.deni.Sistem.Informasi.Akademik.repository;


import com.deni.Sistem.Informasi.Akademik.model.Data_Kelas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Data_KelasRepository  extends JpaRepository<Data_Kelas, String> {
}
