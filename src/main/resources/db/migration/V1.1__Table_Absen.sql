create table table_absen(

siswa_id varchar(10) not null REFERENCES table_kelas(nis_siswa),
pendaftaran_id varchar(50) not null REFERENCES table_pendaftaran(nama_siswa),
tanggal date,
absen_siswa varchar(50) not null,
keterangan varchar(100) not null
);