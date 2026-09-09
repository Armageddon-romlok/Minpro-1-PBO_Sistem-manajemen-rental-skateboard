## Deskripsi Singkat Program
Sistem Manajemen Rental Skateboard adalah aplikasi berbasis *Command Line Interface* (CLI) yang dibangun menggunakan bahasa pemrograman Java. Program ini dirancang untuk mempermudah pencatatan dan pengelolaan data transaksi penyewaan Skateboard. Sistem ini mengimplementasikan konsep *Object-Oriented Programming* (OOP) dengan memisahkan entitas ke dalam class `Skateboard`, `Penyewa`, dan `TransaksiRental`. Seluruh rekaman data disimpan secara dinamis di dalam memori menggunakan struktur data `ArrayList`, dan telah mendukung fungsionalitas CRUD (Create, Read, Update, Delete).


### Antarmuka Menu Utama
<img width="411" height="168" alt="{5689919A-66F5-44A5-B922-50F40D922C8C}" src="https://github.com/user-attachments/assets/b023b8f2-fe07-49c3-8b79-693543e2ff24" />



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
