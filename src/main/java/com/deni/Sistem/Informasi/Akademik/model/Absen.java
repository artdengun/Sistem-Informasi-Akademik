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
@Table(name = "table_absen")
public class Absen {

    @Id
    @GenericGenerator(name = "uuid_absen", strategy = "uuid2")
    @GeneratedValue(generator = "uuid_absen")

    @Column(name = "nis_siswa", nullable = false, unique = true, length = 50)
    private String NIS;
    @Column(name = "nama_siswa", nullable = false, length = 50)
    private String nama_siswa;
    @Column(name = "tanggal")
    private Date tanggal;
    @Column(name = "absen_siswa", nullable = false, length = 50)
    private String absen;
    @Column(name = "keterangan", nullable = false, length = 100)
    private String keterangan;



}
