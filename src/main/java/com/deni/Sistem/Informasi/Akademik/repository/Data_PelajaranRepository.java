package com.deni.Sistem.Informasi.Akademik.repository;


import com.deni.Sistem.Informasi.Akademik.model.Data_Pelajaran;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Data_PelajaranRepository  extends JpaRepository<Data_Pelajaran, String> {
}
