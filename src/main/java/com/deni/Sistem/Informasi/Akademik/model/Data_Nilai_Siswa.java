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
@Table(name = "tabel_data_nilai_siswa")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id_nis")
public class Data_Nilai_Siswa {

    @Id
    @GeneratedValue
    @Column(name = "id_nilai_siswa")
private String nis;
private String nama_siswa;
private String semester;
private String uh1;
private String uh2;
private String uts;
private String uas;


}
