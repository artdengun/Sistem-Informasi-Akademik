package com.deni.Sistem.Informasi.Akademik.model;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tabel_Data_Kelas")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id_absen_siswa")
public class Data_Absen_Siswa {

    @Id
    @GeneratedValue
    @Column(name = "id_absen_siswa_nis")
    private String NIS;
    private String nama_siswa;
    private Date tanggal;
    private String absen;
    private String keterangan;


}
