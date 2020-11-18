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
@Table(name = "Master_Data_Pelajaran")
public class Data_Pelajaran {

    @Id
    @GenericGenerator(name = "uuid_Data_Pelajaran", strategy = "uuid2")
    @GeneratedValue(generator = "uuid_Data_Pelajaran")

    @Column(name = "kode_mapel", length = 4)
    private String kode_mapel;

    @Column(name = "nama_mapel", length = 25)
    private String nama_mapel;

    @ManyToOne
    @JoinColumn(name = "nik", insertable = false, updatable = false)
    private Data_Pegawai pegawai;
    @Column(name = "nik", length = 6)
    private String nik;


}
