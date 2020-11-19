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

    @Column(name = "absen_siswa", nullable = false, length = 50)
    private String absen;

    @ManyToOne
    @JoinColumn(name = "pendaftaran_id", nullable = false, insertable = false, updatable = false)
    private Pendaftaran pendaftaran;

    @Column(name = "tanggal")
    private Date tanggal;
    @Column(name = "keterangan", nullable = false, length = 100)
    private String keterangan;

    @ManyToOne
    @JoinColumn(name = "siswa_id", nullable = false, updatable = false, insertable = false)
    private Siswa siswa;

}
