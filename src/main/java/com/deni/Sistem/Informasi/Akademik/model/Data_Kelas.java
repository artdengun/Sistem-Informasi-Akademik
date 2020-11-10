package com.deni.Sistem.Informasi.Akademik.model;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tabel_Data_Kelas")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id_kelas")
public class Data_Kelas {

    @Id
    @GeneratedValue
    @Column(name = "id_kode_kelas")
    private String kode_kelas;
    private String kelas;
    private String daya_tampung;


}
