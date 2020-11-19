create table table_kelas(
kode_kelas varchar(4) not null unique primary key,
kelas varchar(3) not null,
daya_tampung varchar(8) not null,
pegawai_id varchar(6) not null REFERENCES table_pegawai(nik)
);