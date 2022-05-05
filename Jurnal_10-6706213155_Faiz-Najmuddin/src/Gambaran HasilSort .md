Nama : Faiz Najmuddin

NIM : 6706213155

Kelas : D3IF45-03

---
> [Klik untuk Kembali](Penjelasan.md)

## Gambaran Proses Swap dan FixMaxHeap *Downward*
```
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
```
![tree result](assets/Setelah%20FixMaxHeap.png "Dimulai dari 5")
* *swap* i = 0 dengan `n = heap.length` yaitu 9
* lalu `n--`
* kemudian `fixHeap(0, n);`

![tree result](assets/Proses%20Swap1.png "n = 8")
* n = 8
* *swap* 50 & 11
* lalu `n--`
* kemudian `fixHeap(0, n);`

![tree result](assets/Proses%20Swap2.png "n = 7")  
* n = 7
* swap 43 & 3
* lalu `n--`
* kemudian `fixHeap(0, n);`

![tree result](assets/Proses%20Swap3.png "n = 6")  
* n = 6
* swap 23 & 8
* lalu `n--`
* kemudian `fixHeap(0, n);`

![tree result](assets/Proses%20Swap4.png "n = 5")  
* n = 5
* swap 17 & 8
* lalu `n--`
* kemudian `fixHeap(0, n);`

![tree result](assets/Proses%20Swap5.png "n = 4")  
* n = 4
* swap 12 & 5
* lalu `n--`
* kemudian `fixHeap(0, n);`

![tree result](assets/Proses%20Swap6.png "n = 3")
* n = 3
* swap 11 & 3
* lalu `n--`
* kemudian `fixHeap(0, n);`

![tree result](assets/Proses%20Swap7.png "n = 2")
* n = 2
* swap 8 & 3
* lalu `n--`
* kemudian `fixHeap(0, n);`

![tree result](assets/Proses%20Swap8.png "n = 1")
* n = 1
* swap 5 & 3
* lalu `n--`
* kemudian `fixHeap(0, n);`

![tree result](assets/Proses%20Swap%20Final.png)  
* hasil akhir  
> [Klik untuk Kembali](Penjelasan.md)

