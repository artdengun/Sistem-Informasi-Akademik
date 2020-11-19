package com.deni.Sistem.Informasi.Akademik.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "table_absen")
public class Absen implements Serializable {

    @Id
    @GenericGenerator(name = "uuid_absen", strategy = "uuid2")
    @GeneratedValue(generator = "uuid_absen")

//    @Column(name = "nis_siswa", nullable = false, unique = true, length = 50)
//    private String NIS;
//    @Column(name = "nama_siswa", nullable = false, length = 50)
//    private String nama_siswa;
    @Column(name = "absen_siswa", nullable = false, length = 50)
    private String absen;
    @Column(name = "tanggal")
    private Date tanggal;
    @Column(name = "keterangan", nullable = false, length = 100)
    private String keterangan;

    @ManyToOne
    @JoinColumn(name = "siswa_id", nullable = false, updatable = false, insertable = false)
    private Siswa siswa;
    @Column(name = "nama_siswa", nullable = false, length = 50)
    private String nama_siswa;

}
