public class Main {
    public static void main(String[] args) {

        int[] arr = {23, 43, 12, 50, 5, 17, 8, 60, 11, 3};

        Heap a = new MaxHeap(arr);
        Heap b = new MinHeap(arr);

        for (int i :
                arr) {
            a.insert(i);
        }

        for (int i :
                arr) {
            b.insert(i);
        }

        a.sort();
        b.sort();

        System.out.print("Hasil MaxHeap : ");
        a.print();
        System.out.print("Hasil MinHeap : ");
        b.print();

    }
}