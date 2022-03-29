Nama : Faiz Najmuddin

NIM : 6706213155

Kelas : D3IF45-03

---

## Penjelasan Class Main "Sorting"
* `Collections.sort(list)`

Pemanggilan method `.sort(parameter)` menggunakan nama kelasnya `Collections`
dan tidak menggunakan nama objectnya,
karena method tersebut berbentuk `static`

## Penjelasan Class Movie
###Penjelesan comparable interface

* ```
    @Override
    public int compareTo(Movie o) {
        return this.getYear() - o.getYear();
    }
  ```
Penggunaan Method `int compareTo` dengan type data int. 
Dalam hal ini penggunaan data year, jika `this.getYear() < o.getYear` mengembalikan angka negatif
, sebaliknya apabila `this.getYear() > o.getYear` mengembalikan angka positif dan apabila `this.getYear() == o.getYear`
mengembalikan `return 0;`


