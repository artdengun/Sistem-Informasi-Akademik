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
@Table(name = "tabel_pegawai")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id_pegawai")
public class Data_Pegawai {


    @Id
    @GeneratedValue
    @Column(name = "id_nik")
    private String nik;

    private String nama_pegawai;

    private String tempat_lahir;

    private Date tanggal_lahir;

    private String jenis_kelamin;

    private String pendidikan_terakhir;

    private String jabatan;

    private String status_pegawai;

}
