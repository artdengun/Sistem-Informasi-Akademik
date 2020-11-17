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
@Table(name = "Master_Data_Kelas")
public class Data_Kelas {

    @Id
    @GenericGenerator(name = "uuid_Data_Kelas", strategy = "uuid2")
    @GeneratedValue(generator = "uuid_Data_Kelas")

    @Column(name = "kode_kelas", length = 4)
    private String kode_kelas;
    @Column(name = "kelas", length = 3)
    private String kelas;
    @Column(name = "daya_tampung", length = 8)
    private String daya_tampung;


}
