create table Master_Absen_Siswa(

nis_siswa varchar(50),
nama_siswa varchar(50) not null,
tanggal date,
absen_siswa varchar(50) not null,
keterangan varchar(100) not null,
primary key (nis_siswa),
unique(nis_siswa)
);