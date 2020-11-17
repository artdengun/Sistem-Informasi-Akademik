package com.deni.Sistem.Informasi.Akademik.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Master_Data_Pendaftaran")
public class Data_Pendaftaran {

    @Id
    @GenericGenerator(name = "uuid_Data_Pendaftaran", strategy = "uuid2")
    @GeneratedValue(generator = "uuid_Data_Pendaftaran")

    @Column(name = "kode_pendaftaran", unique = true,  length = 8)
    private String kode_pendaftaran;
    @Column(name = "nama_siswa", length = 50)
    private String nama_siswa;
    @Column(name = "jenis_kelamin", length = 9)
    private String jenis_kelamin;
    @Column(name = "tempat_lahir", length = 25)
    private String tempat_lahir;
    @Column(name = "tanggal_lahir")
    private Date tanggal_lahir;
    @Column(name = "agama", length = 25)
    private String agama;
    @Column(name = "kewarga_negaraan", length = 25)
    private String kewarga_negaraan;
    @Column(name = "anak_ke", length = 2)
    private String anak_ke;
    @Column(name = "jumlah_saudara_kandung", length = 2)
    private String jumlah_saudara_kandung;
    @Column(name = "asal_sekolah", length = 50)
    private String asal_sekolah;
    @Column(name = "alamat",  length = 50)
    private String alamat;
    @Column(name = "nama_ayah",  length = 50)
    private String nama_ayah;
    @Column(name = "pekerjaan_ayah",  length = 50)
    private String pekerjaan_ayah;
    @Column(name = "nama_ibu",  length = 50)
    private String nama_ibu;
    @Column(name = "pekerjaan_ibu",  length = 50)
    private String pekerjaan_ibu;
}
