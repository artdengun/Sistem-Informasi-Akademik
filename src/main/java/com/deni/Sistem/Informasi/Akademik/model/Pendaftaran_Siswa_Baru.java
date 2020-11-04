package com.deni.Sistem.Informasi.Akademik.model;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.transaction.Transactional;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tabel_pendaftaran_siswa_baru")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id_barang")
public class Pendaftaran_Siswa_Baru {
}
