package com.deni.Sistem.Informasi.Akademik.model;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tabel_Data_Kelas")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "kode_kelas")
public class Data_Absen_Siswa {

    



}
