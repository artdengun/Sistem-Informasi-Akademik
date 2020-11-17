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
@Table(name = "Master_Data_Pegawai")
public class Data_Pegawai {

    @Id
    @GenericGenerator(name = "uuid_Data_Pegawai", strategy = "uuid2")
    @GeneratedValue(generator = "uuid_Data_Pegawai")

    @Column(name = "nik", length = 6)
    private String nik;
    @Column(name = "nama_pegawai", length = 50)
    private String nama_pegawai;
    @Column(name = "tempat_lahir", length = 25)
    private String tempat_lahir;
    @Column(name = "tanggal_lahir")
    private Date tanggal_lahir;
    @Column(name = "jenis_kelamin",  length = 9)
    private String jenis_kelamin;
    @Column(name = "pendidikan_terakhir", length = 25)
    private String pendidikan_terakhir;
    @Column(name = "jabatan", length = 25)
    private String jabatan;
    @Column(name = "status_pegawai", length = 25)
    private String status_pegawai;

}
