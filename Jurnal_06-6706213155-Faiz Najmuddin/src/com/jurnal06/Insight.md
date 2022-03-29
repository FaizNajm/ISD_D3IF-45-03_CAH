Nama : Faiz Najmuddin

NIM : 6706213155

Kelas : D3IF45-03

---

## Sorting

- Algoritma Sorting berfungsi mengurutkan data dalam urutan menaik atau menurun berdasarkan satu atau beberapa kunci (key) pengurutan.

- Method `.sort()` pada java `Collection` dapat dipanggil 
apabila object dari class yang diinisiasi sudah mengimplement interface `Comparable<>`

- Ada beberapa **Algoritma Sorting** semuanya dibedakan berdasarkan kecepatan dan besar memory yang terpakai.

- Sorting dibutuhkan agar pemprosesan dan pencarian data menjadi lebih mudah.

- **Algoritma Sorting** cocok digunakan bersamaan salah satu **Algoritma Search** yaitu binarySearch,  
   karena binarySearch membutuhkan data yang sudah terurut untuk diimplementasikan.

## Search

- Algoritma Search digunakan untuk mencari element tertentu dari suatu data.
- Ada 2 **Algoritma Search** yaitu **Linear / Sequential Search**  
dan **Binary Search** keduanya dibedakan berdasarkan kecepatan :
  >1. **Linear / Sequential Search**  adalah metode pencarian secara terurut dari data ke-1 sampai akhir  
  *Kelebihannya* : dapat digunakan untuk data tidak terurut (unordered data)  
  *kekurangan* &nbsp;&nbsp;&nbsp;: pencarian lebih lambat, karena harus mengecek keseluruhan data
  >2. **Binary Search** adalah metode yang mengulangi proses pembagian ruang pencarian   
  sampai data ditemukan atau sampai ruang pencarian tidak dapat dibagi lagi (artinya data tidak dapat ditemukan)  
  *Kelebihannya* : waktu pencarian lebih cepat   
  *kekurangan* &nbsp;&nbsp;&nbsp;: hanya bisa digunakan untuk data terurut ( naik ) ascending

### Kesulitan

- Memahami kenapa method `.toCompare()` digunakan bersamaan dengan method `.sort()`.