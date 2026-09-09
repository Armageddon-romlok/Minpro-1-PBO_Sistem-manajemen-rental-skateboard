## Deskripsi Singkat Program
Sistem Manajemen Rental Skateboard merupakan program berbasis Command Line Interface (CLI) yang dibuat menggunakan bahasa pemrograman Java. Program ini digunakan untuk mencatat dan mengelola data penyewaan skateboard, mulai dari data penyewa, skateboard yang disewa, hingga lama waktu penyewaan.
Program dibuat dengan menerapkan konsep Object-Oriented Programming (OOP). Data dalam program dibagi ke dalam beberapa class, yaitu Skateboard, Penyewa, dan TransaksiRental. Data yang sudah dimasukkan kemudian disimpan menggunakan ArrayList, sehingga dapat ditambah, ditampilkan, diubah, maupun dihapus selama program masih berjalan. Dengan demikian, program sudah menerapkan fungsi dasar CRUD (Create, Read, Update, Delete).

### Antarmuka Menu Utama
<img width="405" height="160" alt="{6A228598-8E6B-418E-B2DD-E0E192164BDF}" src="https://github.com/user-attachments/assets/8a1cb9f3-8608-4531-a6bf-ebaf67d246b0" />

Gambar di atas menunjukkan tampilan awal program ketika dijalankan melalui Command Line Interface (CLI). Pada bagian ini terdapat lima pilihan menu yang dapat digunakan oleh pengguna. Program menggunakan perulangan while agar menu tetap muncul dan dapat digunakan berulang kali sampai pengguna memilih menu keluar. Pemilihan menu dilakukan menggunakan switch-case berdasarkan angka yang dimasukkan.


Berikut merupakan fungsi dari setiap menu:

Tambah Data Rental (Create)
Digunakan untuk memasukkan data transaksi penyewaan baru ke dalam sistem.
Tampilkan Data Rental (Read)
Digunakan untuk melihat seluruh data rental yang sudah tersimpan, termasuk total biaya penyewaan.
Update Lama Sewa (Update)
Digunakan untuk mengubah lama waktu penyewaan berdasarkan ID transaksi. Total biaya akan menyesuaikan dengan lama sewa yang baru.
Hapus Data Rental (Delete)
Digunakan untuk menghapus data transaksi berdasarkan ID transaksi, misalnya ketika skateboard sudah dikembalikan atau terdapat kesalahan pada data.
Keluar
Digunakan untuk menghentikan program dan keluar dari menu utama.


### 1. Tambah Data Rental (Create)
<img width="498" height="281" alt="image" src="https://github.com/user-attachments/assets/577277f7-068f-4c7a-a52b-c4752ce5c78c" />

Ketika pengguna memilih menu Tambah Data Rental, program akan meminta beberapa data melalui console. Data yang perlu dimasukkan terbagi menjadi tiga bagian, yaitu data penyewa, data skateboard, dan data transaksi.

Data Penyewa, terdiri dari:

Nomor Identitas (KTP/KTM)
Nama penyewa
Nomor HP

Data Skateboard, terdiri dari:

ID Skateboard
Merk skateboard, contohnya Element
Jenis skateboard, contohnya Street

Data Transaksi, terdiri dari:

ID Transaksi
Lama penyewaan dalam hari
Harga sewa per hari

Setelah seluruh data diisi, transaksi tersebut akan disimpan ke dalam ArrayList dan dapat dilihat kembali melalui menu Tampilkan Data Rental.


### 2. Tampilkan Data Rental (Read)
<img width="363" height="193" alt="{CC03B01A-D792-4616-BA39-B4D928E79CA3}" src="https://github.com/user-attachments/assets/bf643a16-fa52-43aa-bb98-611e7f5a0ef4" />

Pada menu Tampilkan Data Rental, program akan menampilkan seluruh transaksi yang sudah tersimpan. Data diambil dari ArrayList menggunakan perulangan for-each, kemudian ditampilkan pada console.

Informasi yang ditampilkan meliputi ID transaksi, nama dan kontak penyewa, informasi skateboard, serta lama penyewaan. Program juga menghitung jumlah biaya yang harus dibayar berdasarkan lama sewa dan harga sewa per hari.

Rumus Total Bayar:

Total Bayar = Lama Sewa × Harga Sewa per Hari

Dengan adanya perhitungan tersebut, pengguna tidak perlu menghitung total biaya secara manual.

### 3. Update Lama Sewa (Update)
<img width="465" height="136" alt="{201ADEEF-3AA7-4502-85C4-182FE8CA753E}" src="https://github.com/user-attachments/assets/16d677fa-0ed8-42a2-98f3-44bd75e87c97" />

<img width="311" height="161" alt="{57EDE890-B00D-45E2-B61D-8779D4F7A8C0}" src="https://github.com/user-attachments/assets/af9364c7-4b0b-4dc3-aaff-f17cb72dc732" />

Menu Update Lama Sewa digunakan untuk mengubah durasi penyewaan yang sudah tersimpan. Pengguna cukup memasukkan ID transaksi, misalnya TRX-01. Program kemudian akan mencari transaksi tersebut di dalam ArrayList.

Jika ID transaksi ditemukan, pengguna dapat memasukkan lama sewa yang baru. Nilai lama sewa pada objek transaksi kemudian diperbarui menggunakan method setter.

Setelah perubahan dilakukan, total biaya juga akan mengikuti lama sewa yang baru. Data yang sudah diperbarui dapat dilihat kembali melalui menu Tampilkan Data Rental.


### 4. Hapus Data Rental (Delete)
<img width="450" height="129" alt="image" src="https://github.com/user-attachments/assets/26552343-fecd-4308-b3de-d47eb716d86b" />

<img width="310" height="63" alt="{5843731E-AE80-468C-A128-9270FE3E314D}" src="https://github.com/user-attachments/assets/ef73f73c-2bd0-4620-aa76-9bab04ac220d" />

Menu Hapus Data Rental digunakan untuk menghapus transaksi yang sudah tidak diperlukan. Pengguna memasukkan ID transaksi yang ingin dihapus, kemudian program akan mencari data tersebut di dalam ArrayList.

Jika data ditemukan, transaksi akan dihapus dari daftar. Fitur ini dapat digunakan ketika masa penyewaan sudah selesai dan skateboard telah dikembalikan. Selain itu, fitur ini juga dapat digunakan untuk menghapus data yang sebelumnya salah dimasukkan.


### 5. Keluar (Exit)
<img width="678" height="189" alt="image" src="https://github.com/user-attachments/assets/90164173-e283-47c7-977e-2840bdad4ae3" />

Menu Keluar digunakan untuk menghentikan program. Ketika pengguna memilih angka 5, perulangan while pada menu utama akan berhenti sehingga program tidak lagi meminta input dari pengguna.

Setelah itu, program menampilkan pesan bahwa aplikasi telah selesai dijalankan. Jika program dijalankan melalui IDE seperti NetBeans, proses tersebut dapat dilihat dari status BUILD SUCCESS pada console yang menunjukkan bahwa program berhasil dijalankan tanpa mengalami error.
