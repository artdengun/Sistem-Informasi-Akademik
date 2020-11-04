package com.deni.Sistem.Informasi.Akademik.model;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tabel_Data_Kelas")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "kode_kelas")
public class Data_Kelas {

 private String kode_kelas;

 private String kelas;

 private String daya_tampung;

 @OneToMany(mappedBy = "Data_Kelas")
    List<Data_Pegawai> pegawais;

}
