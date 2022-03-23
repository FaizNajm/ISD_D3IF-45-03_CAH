Nama : Faiz Najmuddin

NIM : 6706213155

Kelas : D3IF45-03

---

## Penjelasan Class Main

* ``QueueLL<String> queue = new QueueLL<>();``

Untuk menginisiasi object baru dari class `QueueLL` dengan nama `queue`.
* `while (!quit) {...}`

Pengulangan menggunakan `while (condition) {` dengan condition `quit` yang bernilai `true`, 
untuk mengulang opsi pilihan sampai user memilih keluar. 
* Method :
```
public static void printInstraction() {
    System.out.println("\nTekan");
    System.out.println("0 - melihat opsi pilihan");
    System.out.println("1 - lihat To Do List");
    System.out.println("2 - tambah To Do List");
    System.out.println("3 - To Do List selesai di kerjakan");
    System.out.println("4 - keluar");
    }
```
Berfungsi untuk mencetak menu pilihan

---
## Penjelasan Class QueueLL

* Atribut :
```
  public class QueueLL<E> {
    private Queue<E> queueList;
```
Menambahkan atribut `queueList`


* Constructor :
```
  public QueueLL() {
  queueList = new LinkedList<E>(); queueList: size = 0
  }
```
Berfungsi untuk menginisiasi `LinkedList` 
melalui interface `queue` dengan nama queueList,
dilihat dari `queueList: size = 0` yang memiliki size 0.

* Method :
```
public void enqueue(E object) {  object: "list1"
        queueList.add(object);  object: "list1"  queueList: size = 1
    }
```
Method `enqueue` berfungsi untuk menambahkan list di `queueList` melalui method `.add(object)` dengan inputan `(object)`.
Contohnya disini setelah input `object: "list1"` ditambahkan ke `queueList` sizenya berubah  menjadi 1.
```
public E dequeue() throws NoSuchElementException {
        return queueList.remove(); queueList: size = 1 --> queueList: size = 0
    }
```
Method `dequeue` berfungsi untuk menghapus list yang pertama di tambahkan ke `queueList` melalui method `.remove()`.
Contohnya disini yang awalnya `queueList: size = 1` menjadi `queueList: size = 0`.
```
public boolean isEmpty() {
       return queueList.isEmpty();
    }
```
Method `isEmpty()` berfungsi mengembalikan nilai boolean true apabila element dari `queueList` 0.
```
public void printQueue() {
        Iterator<E> iterator = queueList.iterator();
        int temp = 1;
        while (iterator.hasNext()) {

            Object value = iterator.next();
            System.out.println(temp + "." + value);
            temp++;
        }
    }
```
Method `printQueue()` berfungsi mencetak seluruh element dari `queueList` dengan bantuan `interface Iterator`.