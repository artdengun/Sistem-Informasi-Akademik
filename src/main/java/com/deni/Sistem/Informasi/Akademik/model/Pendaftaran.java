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
@Table(name = "table_pendaftaran")
public class Pendaftaran {

    @Id
    @GenericGenerator(name = "uuid_pendaftaran", strategy = "uuid2")
    @GeneratedValue(generator = "uuid_pendaftaran")

    @Column(name = "kode_pendaftaran", nullable = false,  unique = true,  length = 8)
    private String kode_pendaftaran;
    @Column(name = "nama_siswa", nullable = false, length = 50)
    private String nama_siswa;
    @Column(name = "jenis_kelamin", nullable = false, length = 9)
    private String jenis_kelamin;
    @Column(name = "tempat_lahir",  nullable = false,length = 25)
    private String tempat_lahir;
    @Column(name = "tanggal_lahir")
    private Date tanggal_lahir;
    @Column(name = "agama", nullable = false, length = 25)
    private String agama;
    @Column(name = "kewarga_negaraan", nullable = false, length = 25)
    private String kewarga_negaraan;
    @Column(name = "anak_ke", nullable = false, length = 2)
    private String anak_ke;
    @Column(name = "jumlah_saudara_kandung", nullable = false, length = 2)
    private String jumlah_saudara_kandung;
    @Column(name = "asal_sekolah", nullable = false, length = 50)
    private String asal_sekolah;
    @Column(name = "alamat", nullable = false,  length = 50)
    private String alamat;
    @Column(name = "nama_ayah",  nullable = false, length = 50)
    private String nama_ayah;
    @Column(name = "pekerjaan_ayah", nullable = false,  length = 50)
    private String pekerjaan_ayah;
    @Column(name = "nama_ibu",  nullable = false, length = 50)
    private String nama_ibu;
    @Column(name = "pekerjaan_ibu", nullable = false,  length = 50)
    private String pekerjaan_ibu;
}
