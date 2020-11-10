package com.deni.Sistem.Informasi.Akademik.model;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tabel_pelajaran")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id_pelajaran")
public class Data_Pelajaran {

    @Id
    @GeneratedValue
    @Column(name = "id_kode_mapel", nullable = false, unique = true, length = 4)
    private String kode_mapel;

    @Column(name = "nama_mapel", nullable = false, length = 25)
    private String nama_mapel;


}
