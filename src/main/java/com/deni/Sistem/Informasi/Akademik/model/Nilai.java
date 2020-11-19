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
@Table(name = "table_nilai")
public class Nilai {

    @Id
    @GenericGenerator(name = "uuid_nilai", strategy = "uuid2")
    @GeneratedValue(generator = "uuid_nilai")

    @Column(name = "nis", nullable = false, unique = true, length = 10)
    private String nis;
    @Column(name = "nama_siswa", nullable = false, length = 50)
    private String nama_siswa;
    @Column(name = "semester", nullable = false, length = 2)
    private String semester;
    @Column(name = "uh1", nullable = false, length = 2)
    private String uh1;
    @Column(name = "uh2", nullable = false, length = 2)
    private String uh2;
    @Column(name = "uts",  nullable = false, length = 2)
    private String uts;
    @Column(name = "uas",  nullable = false, length = 2)
    private String uas;



}
