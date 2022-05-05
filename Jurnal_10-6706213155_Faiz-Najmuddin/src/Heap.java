/**
 * This class applies the heap algorithm for an array.
 */
public abstract class Heap {


    protected int[] arr;
    protected int position = -1;

    /**
     * Constructs a heap sorter that sorts a given array.
     */
    public Heap() {
        arr = new int[2];
    }

    public Heap(int[] anArray) {
        arr = new int[anArray.length];
    }

    /**
     * Ensures the maxheap property for a subtree, provided its
     * children already fulfill the heap property.
     *
     * @param rootIndex the index of the subtree to be fixed
     * @param lastIndex the last valid index of the tree that
     *                  contains the subtree to be fixed
     */
    protected abstract void fixHeap(int rootIndex, int lastIndex);

    /**
     * Returns the index of the left child.
     *
     * @param index the index of a node in this heap
     * @return the index of the left child of the given node
     */
    protected static int getLeftChildIndex(int index) {
        return 2 * index + 1;
    }

    /**
     * Returns the index of the right child.
     *
     * @param index the index of a node in this heap
     * @return the index of the right child of the given node
     */
    protected static int getRightChildIndex(int index) {
        return 2 * index + 2;
    }

    public int[] getArray() {
        return arr;
    }

    /**
     * Sorts the array managed by this heap.
     */
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

    /**
     * Swaps two entries of the array.
     *
     * @param i the first position to swap
     * @param j the second position to swap
     */
    private void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    protected void insert(int value) {
        if (isFull()) {
            resize();
        }
        arr[++position] = value;
    }

    private void resize() {
        System.arraycopy(arr, 0, arr = new int[2 * arr.length], 0, position + 1);
    }

    private boolean isFull() {
        return position == arr.length - 1;
    }

    public void print() {
        for (int i :
                arr) {
            if (i != 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }
}

