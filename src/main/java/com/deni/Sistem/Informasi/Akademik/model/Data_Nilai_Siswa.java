package com.deni.Sistem.Informasi.Akademik.model;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tabel_data_nilai_siswa")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id_nis")
public class Data_Nilai_Siswa {

private String nis;
private String nama_siswa;
private String semester;
private String uh1;
private String uh2;
private String uts;
private String uas;


@OneToMany(mappedBy = "Data_Nilai_Siswa")
    List<Data_Pelajaran> pelajarans;


@OneToMany(mappedBy = "Data_Nilai_Siswa")
    List<Data_Pegawai> pegawais;

}
