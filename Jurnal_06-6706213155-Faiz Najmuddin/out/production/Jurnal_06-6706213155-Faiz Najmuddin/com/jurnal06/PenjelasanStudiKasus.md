Nama : Faiz Najmuddin

NIM : 6706213155

Kelas : D3IF45-03

---

## Penjelasan Class StudiKasus

###Method :

* ```
     private static void cetakList(ArrayList <Mahasiswa> arrayList)  {...}
  ```
Berfungsi mencetak list

* ```
    private static Mahasiswa cariMahasiswa(ArrayList<Mahasiswa> list, String nim) {
        Mahasiswa result;
        Collections.sort(list);
        int index = Collections.binarySearch(list, new Mahasiswa(nim, null, null));
        result = list.get(index);
        return result;
    } 
  ```
  - Method dengan tipe data bentukan ini yaitu `Mahasiswa`,
berfungsi mencari element dari list yang sudah diurutkan menggunakan method `.sort(list)`
berdasarkan input `key`, contoh key disini adalah `nim`. 

  - fungsi `int index` sebagai penyimpan index dari element yang dicari, 
menggunakan salah satu algoritma search yaitu `binarySearch`.

  - Yang akhirnya method ini akan mengembalikan tipe data Mahasiswa.



