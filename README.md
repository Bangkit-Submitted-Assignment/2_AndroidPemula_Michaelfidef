# UI_UmbulKlaten

# Kriteria:
**Fitur yang harus ada pada aplikasi:**

  **1. Halaman Utama**
     
     Syarat:
      - Menampilkan gambar dalam format List dengan jumlah minimal 10 item yang berbeda. Gunakanlah RecyclerView untuk menyusun listnya. Informasi yang ditampilkan mengandung :
            - Judul dari artikel
            - Memaparkan overview dari artikel (opsional)
      - Memunculkan halaman detail ketika salah satu item ditekan. Anda bisa menerapkan handler click pada setiap item RecyclerVie

  **2. Halaman Detail**
     
     Syarat:
      - Menampilkan gambar dan informasi yang relevan pada halaman detail. 
      - Informasi yang relevan mencakup kesamaan informasi yang ditampilkan pada halaman utama dengan halaman detail :
            - Terdapat judul dan gambar yang sesuai dengan list
            - Terdapat kalimat deskripsi yang lebih panjang atau informasi tambahan lainnya
      - Gunakan ScrollView supaya konten tetap dapat dilihat ketika aplikasi dirotasi.

**3. Halaman About**

      - Menampilkan foto diri, nama, dan email yang terdaftar di Dicoding.
      - Dalam mengakses halaman about, pastikan terdapat tombol yang bisa digunakan untuk mengakses halamannya. Untuk cara mengaksesnya, kamu bisa mengimplementasikan :
            - Dengan menambahkan elemen View khusus (bisa option menu, tombol, atau tab) yang mengandung ID “about_page”
      
# Penilaian:
**1. Menerapkan tampilan aplikasi yang sesuai standar:**

      - Memiliki width, height, margin, dan padding yang sesuai.
      - Komponen tidak saling bertumpuk
      - Penggunaan komponen yang sesuai dengan fungsinya.
      - Penggunaan warna yang sesuai
      - Semua data dapat terlihat baik ketika landscape maupun potrait (gunakan ScrollView)

**2. Informasi yang ditampilkan pada halaman detail lebih lengkap.**

      - Jenis data yang ditampilkan bervariasi

**3. Membuat custom splash screen yang menarik.**
      - Pastikan nama Activity yang digunakan mengandung kata “Splash”

**4. Menggunakan CardView yang sesuai untuk menampilkan konten List.**
      - Gunakan referensi CardView Guideline untuk menerapkan CardView yang baik dan benar.

**5. Mengimplementasikan fungsi Share pada halaman detail.**

      - Pastikan pada tombol Share menggunakan id “action_share”
