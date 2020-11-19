create table table_pegawai(
nik varchar(6) not null unique primary key,
nama_pegawai varchar(50) not null,
tempat_lahir varchar(25) not null,
tanggal_lahir date,
jenis_kelamin varchar(9) not null,
pendidikan_terakhir varchar(25) not null,
jabatan varchar(25) not null,
status_pegawai varchar(25) not null
);