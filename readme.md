## Deskripsi Singkat Program
Sistem Manajemen Rental Skateboard adalah aplikasi berbasis *Command Line Interface* (CLI) yang dibangun menggunakan bahasa pemrograman Java. Program ini dirancang untuk mempermudah pencatatan dan pengelolaan data transaksi penyewaan Skateboard. Sistem ini mengimplementasikan konsep *Object-Oriented Programming* (OOP) dengan memisahkan entitas ke dalam class `Skateboard`, `Penyewa`, dan `TransaksiRental`. Seluruh rekaman data disimpan secara dinamis di dalam memori menggunakan struktur data `ArrayList`, dan telah mendukung fungsionalitas CRUD (Create, Read, Update, Delete).


### Antarmuka Menu Utama
<img width="405" height="160" alt="{6A228598-8E6B-418E-B2DD-E0E192164BDF}" src="https://github.com/user-attachments/assets/8a1cb9f3-8608-4531-a6bf-ebaf67d246b0" />




Gambar di atas merupakan tampilan awal *Command Line Interface* (CLI) saat program dijalankan. Sistem menggunakan perulangan `while` sehingga menu akan terus merespons input angka (1-5) dari pengguna melalui percabangan `switch-case`. 

Berikut adalah penjelasan fungsionalitas masing-masing opsi menu:
* **1. Tambah Data Rental (Create):** Menginput rekam transaksi baru, meliputi identitas penyewa, spesifikasi skateboard, dan durasi sewa untuk disimpan ke dalam `ArrayList`.
* **2. Tampilkan Data Rental (Read):** Menampilkan daftar seluruh transaksi yang sedang aktif beserta kalkulasi otomatis untuk total biaya sewa.
* **3. Update Lama Sewa (Update):** Memperbarui durasi penyewaan berdasarkan ID Transaksi. Sistem akan secara otomatis mengalkulasi ulang total tagihan.
* **4. Hapus Data Rental (Delete):** Menghapus rekam transaksi dari memori menggunakan ID Transaksi (digunakan saat unit dikembalikan atau terjadi kesalahan input).
* **5. Keluar:** Menghentikan perulangan program utama dan menutup eksekusi aplikasi secara aman.


### 1. Tambah Data Rental (Create)
<img width="498" height="281" alt="image" src="https://github.com/user-attachments/assets/577277f7-068f-4c7a-a52b-c4752ce5c78c" />



Ketika opsi 1 dipilih, sistem akan memandu pengguna untuk menginputkan detail transaksi secara berurutan melalui *console*. Proses ini mencakup pengisian tiga kelompok data utama:
* **Data Penyewa:** Nomor Identitas (KTP/KTM), Nama, dan No. HP.
* **Data Skateboard:** ID Skateboard, Merk (misal: Element), dan Jenis papan luncur (misal: Street).
* **Detail Transaksi:** ID Transaksi, durasi peminjaman (dalam hari), dan tarif sewa per hari.


### 2. Tampilkan Data Rental (Read)
<img width="363" height="193" alt="{CC03B01A-D792-4616-BA39-B4D928E79CA3}" src="https://github.com/user-attachments/assets/bf643a16-fa52-43aa-bb98-611e7f5a0ef4" />



Saat opsi 2 dipilih, sistem akan menampilkan seluruh daftar transaksi yang saat ini tersimpan di dalam memori (`ArrayList`). Program menggunakan perulangan *for-each* untuk mengekstrak dan mencetak rangkuman data ke layar. 

Informasi yang ditampilkan meliputi ID Transaksi, identitas kontak penyewa, spesifikasi papan yang disewa, serta durasi peminjaman. Pada tahap ini, sistem juga mengeksekusi *method* kalkulasi untuk menghitung dan menampilkan **Total Bayar** secara otomatis (Lama Sewa × Harga per Hari).

### 3. Update Lama Sewa (Update)
<img width="465" height="136" alt="{201ADEEF-3AA7-4502-85C4-182FE8CA753E}" src="https://github.com/user-attachments/assets/16d677fa-0ed8-42a2-98f3-44bd75e87c97" />

<img width="311" height="161" alt="{57EDE890-B00D-45E2-B61D-8779D4F7A8C0}" src="https://github.com/user-attachments/assets/af9364c7-4b0b-4dc3-aaff-f17cb72dc732" />

Menu opsi 3 berfungsi untuk memodifikasi data transaksi yang sudah berjalan. Pengguna hanya perlu memasukkan ID Transaksi (contoh: TRX-01) sebagai kata kunci pencarian. Jika ID tersebut ditemukan di dalam `ArrayList`, sistem akan meminta input durasi lama sewa yang baru. 

Setelah diinput, program akan memperbarui nilai atribut pada objek terkait menggunakan *method setter*. Perubahan durasi ini akan secara otomatis memengaruhi kalkulasi Total Bayar saat transaksi dilihat kembali melalui menu Read.

### 4. Hapus Data Rental (Delete)
<img width="450" height="129" alt="image" src="https://github.com/user-attachments/assets/26552343-fecd-4308-b3de-d47eb716d86b" />

<img width="310" height="63" alt="{5843731E-AE80-468C-A128-9270FE3E314D}" src="https://github.com/user-attachments/assets/ef73f73c-2bd0-4620-aa76-9bab04ac220d" />

Menu opsi 4 digunakan untuk menghapus catatan transaksi dari sistem. Sama seperti fitur update, program akan meminta input ID Transaksi (misal: TRX-01). Sistem kemudian akan mencari indeks data tersebut di dalam `ArrayList` dan menghapusnya secara permanen dari memori. Fitur ini dieksekusi apabila masa sewa telah selesai dan unit dikembalikan, atau jika terjadi kesalahan saat penginputan awal.
