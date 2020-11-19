package com.deni.Sistem.Informasi.Akademik.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "table_pelajaran")
public class Pelajaran {

    @Id
    @GenericGenerator(name = "uuid_pelajaran", strategy = "uuid2")
    @GeneratedValue(generator = "uuid_pelajaran")

    @Column(name = "kode_mapel", unique = true, nullable = false, length = 4)
    private String kode_mapel;

    @Column(name = "nama_mapel", nullable = false, length = 25)
    private String nama_mapel;

    @ManyToOne
    @JoinColumn(name = "pegawai_id", nullable = false, insertable = false, updatable = false)
    private Pegawai pegawai;



}
