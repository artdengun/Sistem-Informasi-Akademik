create table table_pendaftaran(
kode_pendaftaran varchar(8) not null unique primary key,
nama_siswa varchar(50) not null,
jenis_kelamin varchar(9) not null,
tempat_lahir varchar(25) not null,
tanggal_lahir date,
agama varchar(25) not null,
kewarga_negaraan varchar(25) not null,
anak_ke varchar(2) not null,
jumlah_saudara_kandung varchar(2) not null,
asal_sekolah varchar(50) not null,
alamat varchar(50) not null,
nama_ayah varchar(50) not null,
pekerjaan_ayah varchar(50) not null,
nama_ibu varchar(50) not null,
pekerjaan_ibu varchar(50) not null
);