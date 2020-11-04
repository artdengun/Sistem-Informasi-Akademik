package com.deni.Sistem.Informasi.Akademik.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tabel_data_siswa")
public class Data_Siswa {

    private String nis;
    private String nama_siswa;
    private Date tanggal_lahir;
    private String jenis_kelamin;
    private String tempat_lahir;
    private String agama;
    private String alamat;
    private String no_telephone;

    @OneToMany(mappedBy = "Data_Siswa")
    List<Data_Kelas> dataKelasList;
 }
