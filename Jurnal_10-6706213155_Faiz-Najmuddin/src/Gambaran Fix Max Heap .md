Nama : Faiz Najmuddin

NIM : 6706213155

Kelas : D3IF45-03

---
> [Klik untuk Kembali](Penjelasan.md)

## Gambaran Proses FixMaxHeap *Upward*
* dimana sarat dari MaxHeap adalah **Parent > Child**
* *FixUpward* dimulai dari `i = (n - 1) / 2` dimana `n = heap.length - 1`
    ```
    int n = arr.length - 1;
            for (int i = (n - 1) / 2; i >= 0; i--)
                //fixHeapUpward
                fixHeap(i, n);
    ```

![tree result](assets/Proses%20FixMaxHeap1.png "Dimulai dari 5")  
* dimulai dari `i = 4`,  
* 5 & 3 tidak *swap* dikarenakan sudah memenuhi sarat **Parent > Child**  
* lalu `i--`

![tree result](assets/Proses%20FixMaxHeap2.png "Dimulai dari 3")  
* `i = 3`,  
* dimana 60 *swap* dengan 50, agar sarat **Parent > Child** terpenuhi.  
* lalu `i--`  

![tree result](assets/Proses%20FixMaxHeap3.png "Dimulai dari 2")  
* `i = 2`,  
* dimana 17 *swap* dengan 12.

![tree result](assets/Proses%20FixMaxHeap4.png "Dimulai dari 1")  
* `i = 1`,  
* dimana 60 *swap* dengan 43.  
* lalu 50 *swap* dengan 43.

![tree result](assets/Proses%20FixMaxHeap5.png "Dimulai dari 0")  
* `i = 0`,  
* dimana 60 *swap* dengan 23.  
* lalu 50 *swap* dengan 23.  
* lalu 43 *swap* dengan 23.

![tree result](assets/Proses%20FixMaxHeap%20Final.png "final")  
* hasil akhir  
> [Klik untuk Kembali](Penjelasan.md)

