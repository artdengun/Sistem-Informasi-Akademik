create table table_nilai(
siswa_id varchar(10) not null REFERENCES table_kelas(nis_siswa),
pendaftaran_id varchar(50) not null REFERENCES table_pendaftaran(nama_siswa),
semester varchar(2) not null,
uh1 varchar(2) not null,
uh2 varchar(2) not null,
uts varchar(2) not null,
uas varchar(2) not null,
pegawai_id varchar(6) not null REFERENCES table_pegawai(nik)
 );