Nama : Faiz Najmuddin

NIM : 6706213155

Kelas : D3IF45-03

---

## Penjelasan Coding

### Penjelasan Class Main :

```
int[] arr = {23, 43, 12, 50, 5, 17, 8, 60, 11, 3};
```
menginisiasi array, sesuai soal yang diberikan.

```
Heap a = new MaxHeap(arr);  
Heap b = new MinHeap(arr);
```
pembuatan objek `MaxHeap` dan `MinHeap`,  
yang nanti hasil `sort` dari `MaxHeap` adalah **Ascending**,  
sedangkan hasil `sort` dari `MinHeap` adalah **Decending**.

```
        for (int i :
                arr) {
            a.insert(i);
          }

        for (int i :
                arr) {
            b.insert(i);
        }
```
proses insert data array kedalam **a** & **b** menggunakan foreach loop.

---

* ## Penjelasan Proses Heap Sort
  ```
   a.sort();
   b.sort();
  ```
  proses pemanggilan method `.sort()`
  ```
   public void sort() {
          int n = arr.length - 1;
          for (int i = (n - 1) / 2; i >= 0; i--)
              //fixHeapUpward
              fixHeap(i, n);
          while (n > 0) {
              swap(0, n);
              n--;
              //fixHeapDownward
              fixHeap(0, n);
          }
      }
  ```
* #### MaxHeap
  bentuk awal heap tree, gambaran tree adalah :

  ![tree result](assets/Sebelum%20FixHeap%20&%20SortHeap.png "Sebelum") 

  gambaran setelah method `fixheap(i, n)` selesai dijalankan :
  >[Klik Untuk Gambaran Lengkapnya](Gambaran%20Fix%20Max%20Heap%20.md)

  ![tree result](assets/Setelah%20FixMaxHeap.png "Sesudah FixHeap")

   gambaran setelah method `sort`selesai dijalankan :
  >[Klik Untuk Gambaran Lengkapnya](Gambaran%20HasilSort%20.md)

  ![tree result](assets/Setelah%20FixMaxHeap%20&%20SortHeap.png "Sesudah FixHeap&Sort")

---

```
 a.print();
 b.print();
```
mencetak hasil akhir, sreenshot hasil :

![tree result](assets/Hasil%20Program.jpg "Akhirnya")