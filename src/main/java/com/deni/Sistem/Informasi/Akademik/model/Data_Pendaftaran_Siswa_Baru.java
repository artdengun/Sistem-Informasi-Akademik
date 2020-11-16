package com.deni.Sistem.Informasi.Akademik.model;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tabel_pendaftaran_siswa_baru")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id_pendaftaran")
public class Data_Pendaftaran_Siswa_Baru {

    @Id
    @GeneratedValue
    @Column(name = "id_kode_pendaftaran")
    private String kode_pendaftaran;
    private String nama_siswa;
    private String jenis_kelamin;
    private String tempat_lahir;
    private Date tanggal_lahir;
    private String agama;
    private String kewarga_negaraan;
    private String anak_ke;
    private String jumlah_saudara_kandung;
    private String asal_sekolah;
    private String alamat;
    private String nama_ayah;
    private String pekerjaan_ayah;
    private String nama_ibu;
    private String pekerjaan_ibu;
}
