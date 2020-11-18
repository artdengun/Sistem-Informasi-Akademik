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
@Table(name = "Master_Data_Nilai")
public class Data_Nilai_Siswa {

    @Id
    @GenericGenerator(name = "uuid_Data_Nilai", strategy = "uuid2")
    @GeneratedValue(generator = "uuid_Data_Nilai")

    @Column(name = "nis", length = 10)
    private String nis;
    @Column(name = "nama_siswa", length = 50)
    private String nama_siswa;
    @Column(name = "semester", length = 2)
    private String semester;
    @Column(name = "uh1", length = 2)
    private String uh1;
    @Column(name = "uh2", length = 2)
    private String uh2;
    @Column(name = "uts", length = 2)
    private String uts;
    @Column(name = "uas", length = 2)
    private String uas;

    @ManyToOne
    @JoinColumn(name = "nik", insertable = false, updatable = false)
    private Data_Pegawai pegawai;
    @Column(name = "nik", length = 6)
    private String nik;


}
