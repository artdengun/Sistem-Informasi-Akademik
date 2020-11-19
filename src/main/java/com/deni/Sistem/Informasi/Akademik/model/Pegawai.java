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
@Table(name = "table_pegawai")
@ToString(exclude = "nilais, pelajarans, kelass")
public class Pegawai {

    @Id
    @GenericGenerator(name = "uuid_pegawai", strategy = "uuid2")
    @GeneratedValue(generator = "uuid_pegawai")

    @Column(name = "nik", nullable = false,  unique = true, length = 6)
    private String nik;
    @Column(name = "nama_pegawai", nullable = false, length = 50)
    private String nama_pegawai;
    @Column(name = "tempat_lahir",  nullable = false,length = 25)
    private String tempat_lahir;
    @Column(name = "tanggal_lahir")
    private Date tanggal_lahir;
    @Column(name = "jenis_kelamin",   nullable = false, length = 9)
    private String jenis_kelamin;
    @Column(name = "pendidikan_terakhir",  nullable = false, length = 25)
    private String pendidikan_terakhir;
    @Column(name = "jabatan", nullable = false, length = 25)
    private String jabatan;
    @Column(name = "status_pegawai", nullable = false, length = 25)
    private String status_pegawai;


    @OneToMany(mappedBy = "pegawai")
    private List<Pelajaran> pelajarans;

    @OneToMany(mappedBy = "pegawai")
    private List<Kelas> kelass;

    @OneToMany(mappedBy = "pegawai")
    private List<Nilai> nilais;

}
