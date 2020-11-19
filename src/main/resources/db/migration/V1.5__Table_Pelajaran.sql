create table table_pelajaran(
kode_mapel varchar(4) not null unique primary key,
nama_mapel varchar(25) not null,
pegawai_id varchar(6) not null REFERENCES table_pegawai(nik)

);