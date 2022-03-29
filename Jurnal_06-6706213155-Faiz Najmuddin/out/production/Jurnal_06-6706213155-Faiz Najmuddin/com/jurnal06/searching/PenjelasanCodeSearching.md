Nama : Faiz Najmuddin

NIM : 6706213155

Kelas : D3IF45-03

---

## Penjelasan Class Main "Searching"

###Method :

* ```
     public static int binarySearch(int[] data, int key) {...}
  ```
Berfungsi mengembalikan lokasi dari key/nilai yang dicari, dengan menggunakan algoritma binarySearch

---

###Penjelesan implementasi binarySearch menggunakan Looping Do While

* ```
    int low = 0; // low end of the search area
    int high = data.length - 1; // high end of the search area
    int middle = (low + high + 1) / 2; // middle element
    int location = -1; // return value; -1 if not found
  ```
Pembuatan Pointer, yang digunakan untuk jangkauan pencarian elemen.

* ```
  do {
           
  System.out.print(remainingElements(data, low, high));
           
            for (int i = 0; i < middle; i++) {
                System.out.print("   ");
            }
            System.out.println("*");
           
            if (key == data[middle]) {
                location = middle;
            }
            else if (key < data[middle]) {
                high = middle - 1;
            }
            else { // middle element is too low
                low = middle + 1;
            }
            middle = (low + high + 1) / 2;
        } while ((low <= high) && (location == -1));
        return location;
  ```


 Looping do while, yang apa bila `key < data[middle]` nilai yang dicari kurang dari pointer `middle`,
  maka pointer `high = middle - 1`, yang akan mengubah patokan maksimal pencarian adalah nilai dari `high`
dan memperkecil jangkauan pencarian 1/2 dari sebelumnya.

Sama halnya dengan `key>data[middle]` ,bedanya adalah patokan yang diubah adalah `low = middle + 1`
atau patokan minimal pencarian adalah nilai `low`.

sampai `if(key == data[middle])` ( nilai yang dicari ditemukan ) dan mengembalikan nilai `location`. 

