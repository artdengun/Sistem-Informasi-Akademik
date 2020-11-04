package com.deni.Sistem.Informasi.Akademik.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tabel_pegawai")
public class Data_Pegawai {


    private String nik;

    private String nama_pegawai;

    private String tempat_lahir;

    private Date tanggal_lahir;

    private String jenis_kelamin;

    private String pendidikan_terakhir;

    private String jabatan;

    private String status_pegawai;

}
