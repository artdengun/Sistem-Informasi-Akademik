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
@Table(name = "Master_Absen_Siswa")
public class Data_Absen_Siswa {

    @Id
    @GenericGenerator(name = "uuid_Data_Absen_Siswa", strategy = "uuid2")
    @GeneratedValue(generator = "uuid_Data_Absen_Siswa")

    @Column(name = "nis_siswa", unique = true, length = 50)
    private String NIS;
    @Column(name = "nama_siswa", length = 50)
    private String nama_siswa;
    @Column(name = "tanggal")
    private Date tanggal;
    @Column(name = "absen_siswa", length = 50)
    private String absen;
    @Column(name = "keterangan", length = 100)
    private String keterangan;



}
