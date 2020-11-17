package com.deni.Sistem.Informasi.Akademik.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Master_Data_Siswa")
public class Data_Siswa {

    @Id
    @GenericGenerator(name = "uuid_Data_Siswa", strategy = "uuid2")
    @GeneratedValue(generator = "uuid_Data_Siswa")

    @Column(name = "nis_siswa", length = 10)
    private String nis_siswa;
    @Column(name = "nama_siswa", length = 50)
    private String nama_siswa;
    @Column(name = "tanggal_lahir")
    private Date tanggal_lahir;
    @Column(name = "jenis_kelamin", length = 9)
    private String jenis_kelamin;
    @Column(name = "tempat_lahir", length = 25)
    private String tempat_lahir;
    @Column(name = "agama", length = 25)
    private String agama;
    @Column(name = "alamat", length = 50)
    private String alamat;
    @Column(name = "no_telephone", length = 12)
    private String no_telephone;


 }
