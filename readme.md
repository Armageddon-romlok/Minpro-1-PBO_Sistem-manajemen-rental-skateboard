Tambah Data Rental (Create): Fitur untuk mencatat transaksi penyewaan baru. Pengguna dapat memasukkan detail penyewa (No. Identitas, Nama, No. HP), spesifikasi skateboard (ID, Merk, Jenis), serta harga dan lama sewa. Data ini disimpan secara dinamis menggunakan implementasi Collection ArrayList.

Tampilkan Data Rental (Read): Menampilkan daftar seluruh transaksi penyewaan yang sedang aktif di dalam sistem. Output mencakup ringkasan ID Transaksi, data pelanggan, unit skateboard yang disewa, durasi, serta kalkulasi otomatis untuk total biaya sewa.

Update Lama Sewa (Update): Fitur modifikasi untuk memperbarui durasi peminjaman. Sistem akan mencari entri berdasarkan ID Transaksi dan memperbarui nilai lama sewa, yang sangat berguna jika pelanggan ingin melakukan perpanjangan masa rental.

Hapus Data Rental (Delete): Menghapus catatan transaksi spesifik dari memori berdasarkan input ID Transaksi. Fitur ini digunakan saat pelanggan telah menyelesaikan transaksi (mengembalikan unit) atau apabila terjadi kesalahan input data.

Keluar: Menghentikan while loop utama dan menutup eksekusi program CLI (Command Line Interface) secara aman.
