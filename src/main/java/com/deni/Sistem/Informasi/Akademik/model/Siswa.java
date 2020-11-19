package com.deni.Sistem.Informasi.Akademik.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "table_siswa")
@ToString(exclude = "absens,nilais")
public class Siswa {

    @Id
    @GenericGenerator(name = "uuid_siswa", strategy = "uuid2")
    @GeneratedValue(generator = "uuid_siswa")

    @Column(name = "nis_siswa",  nullable = false, unique = true, length = 10)
    private String nis_siswa;
    @Column(name = "nama_siswa", nullable = false, length = 50)
    private String nama_siswa;
    @Column(name = "tanggal_lahir")
    private Date tanggal_lahir;
    @Column(name = "jenis_kelamin", nullable = false, length = 9)
    private String jenis_kelamin;
    @Column(name = "tempat_lahir", nullable = false, length = 25)
    private String tempat_lahir;
    @Column(name = "agama", nullable = false, length = 25)
    private String agama;
    @Column(name = "alamat", nullable = false, length = 50)
    private String alamat;
    @Column(name = "no_telephone", nullable = false, length = 12)
    private String no_telephone;

    @ManyToOne
    @JoinColumn(name = "kelas_id", nullable = false)
    private Kelas kelas;


    @OneToMany(mappedBy = "siswa")
    private List<Absen> absens;

    @OneToMany(mappedBy = "siswa")
    private List<Nilai> nilais;


 }
