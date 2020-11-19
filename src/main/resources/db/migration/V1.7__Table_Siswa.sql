create table table_siswa(
nis_siswa varchar(10) not null unique primary key,
nama_siswa  varchar(50) not null,
tanggal_lahir date,
jenis_kelamin varchar(9) not null,
tempat_lahir varchar(25) not null,
agama varchar(25) not null,
alamat varchar(50) not null,
no_telephone varchar(12) not null,
kelas_id VARCHAR(4) not null REFERENCES table_kelas(kode_kelas)
);