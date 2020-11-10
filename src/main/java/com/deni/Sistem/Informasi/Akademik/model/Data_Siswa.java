package com.deni.Sistem.Informasi.Akademik.model;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tabel_data_siswa")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id_data_siswa")
public class Data_Siswa {

    @Id
    @GeneratedValue
    @Column(name = "id_nis_siswa")
    private String nis_siswa;
    private String nama_siswa;
    private Date tanggal_lahir;
    private String jenis_kelamin;
    private String tempat_lahir;
    private String agama;
    private String alamat;
    private String no_telephone;

 }
