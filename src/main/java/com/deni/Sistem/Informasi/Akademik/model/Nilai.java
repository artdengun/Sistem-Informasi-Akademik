package com.deni.Sistem.Informasi.Akademik.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "table_nilai")
public class Nilai  implements Serializable {

    @Id
    @GenericGenerator(name = "uuid_nilai", strategy = "uuid2")
    @GeneratedValue(generator = "uuid_nilai")

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

    @ManyToOne
    @JoinColumn(name = "pendaftaran_id", nullable = false, insertable = false, updatable = false)
    private Pendaftaran pendaftaran;

    @ManyToOne
    @JoinColumn(name = "pegawai_id", nullable = false, updatable = false, insertable = false)
    private Pegawai pegawai;


    @ManyToOne
    @JoinColumn(name = "siswa_id", nullable = false, updatable = false, insertable = false)
    private Siswa siswa;


}
