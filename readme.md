## Deskripsi Singkat Program
Sistem Manajemen Rental Skateboard adalah aplikasi berbasis *Command Line Interface* (CLI) yang dibangun menggunakan bahasa pemrograman Java. Program ini dirancang untuk mempermudah pencatatan dan pengelolaan data transaksi penyewaan Skateboard. Sistem ini mengimplementasikan konsep *Object-Oriented Programming* (OOP) dengan memisahkan entitas ke dalam class `Skateboard`, `Penyewa`, dan `TransaksiRental`. Seluruh rekaman data disimpan secara dinamis di dalam memori menggunakan struktur data `ArrayList`, dan telah mendukung fungsionalitas CRUD (Create, Read, Update, Delete).



<img width="411" height="164" alt="{79F44CDA-AA00-4D5C-91B7-30E7C62A4EE9}" src="https://github.com/user-attachments/assets/72e379c0-cc82-4f6a-96bd-72f35ecb9cc0" />

### Antarmuka Menu Utama
![Tampilan Menu Utama](image_ab12c2.png)

Gambar di atas merupakan tampilan awal *Command Line Interface* (CLI) saat program dijalankan. Sistem menggunakan perulangan `while` sehingga menu akan terus merespons input angka (1-5) dari pengguna melalui percabangan `switch-case`. 

Berikut adalah penjelasan fungsionalitas masing-masing opsi menu:
* **1. Tambah Data Rental (Create):** Menginput rekam transaksi baru, meliputi identitas penyewa, spesifikasi skateboard, dan durasi sewa untuk disimpan ke dalam `ArrayList`.
* **2. Tampilkan Data Rental (Read):** Menampilkan daftar seluruh transaksi yang sedang aktif beserta kalkulasi otomatis untuk total biaya sewa.
* **3. Update Lama Sewa (Update):** Memperbarui durasi penyewaan berdasarkan ID Transaksi. Sistem akan secara otomatis mengalkulasi ulang total tagihan.
* **4. Hapus Data Rental (Delete):** Menghapus rekam transaksi dari memori menggunakan ID Transaksi (digunakan saat unit dikembalikan atau terjadi kesalahan input).
* **5. Keluar:** Menghentikan perulangan program utama dan menutup eksekusi aplikasi secara aman.
