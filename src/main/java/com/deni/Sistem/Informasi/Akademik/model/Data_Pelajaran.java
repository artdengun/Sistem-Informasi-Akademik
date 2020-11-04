package com.deni.Sistem.Informasi.Akademik.model;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tabel_pelajaran")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "kode_mapel")
public class Data_Pelajaran {

    @Column(name = "kode_mapel", nullable = false, unique = true, length = 4)
    private String kode_mapel;

    @Column(name = "nama_mapel", nullable = false, length = 25)
    private String nama_mapel;

    @OneToMany(mappedBy = "pelajaran")
    List<Data_Pegawai> pegawais;


}
