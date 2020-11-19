create table table_absen(
nis_siswa varchar(50) not null unique primary key,
nama_siswa varchar(50) not null,
tanggal date,
absen_siswa varchar(50) not null,
keterangan varchar(100) not null
);