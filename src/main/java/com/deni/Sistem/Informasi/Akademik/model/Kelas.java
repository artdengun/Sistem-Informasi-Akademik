package com.deni.Sistem.Informasi.Akademik.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "table_kelas")
@ToString(exclude = "siswas")
public class Kelas {

    @Id
    @GenericGenerator(name = "uuid_Data_Kelas", strategy = "uuid2")
    @GeneratedValue(generator = "uuid_Data_Kelas")

    @Column(name = "kode_kelas", nullable = false, unique = true,  length = 4)
    private String kode_kelas;
    @Column(name = "kelas", nullable = false, length = 3)
    private String kelas;
    @Column(name = "daya_tampung", nullable = false, length = 8)
    private String daya_tampung;

    @ManyToOne
    @JoinColumn(name = "pegawai_id", insertable = false, updatable = false, nullable = false)
    private Pegawai pegawai;


    @OneToMany(mappedBy = "kelas")
    private List<Siswa> siswas;

}
