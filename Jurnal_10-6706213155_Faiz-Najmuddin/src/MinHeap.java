public class MinHeap extends Heap {

    /**
     * Constructs a heap sorter that sorts a given array.
     */
    public MinHeap() {
        super();
    }

    public MinHeap(int[] anArray) {
        super(anArray);
    }

    /**
     * Ensures the maxheap property for a subtree, provided its
     * children already fulfill the heap property.
     *
     * @param rootIndex the index of the subtree to be fixed
     * @param lastIndex the last valid index of the tree that
     *                  contains the subtree to be fixed
     */
    @Override
    protected void fixHeap(int rootIndex, int lastIndex) {
        // Remove root
        int rootValue = arr[rootIndex];
        // Promote children while they are larger than the root
        int index = rootIndex;
        boolean more = true;
        while (more) {
            int childIndex = getLeftChildIndex(index);
            if (childIndex <= lastIndex) {
                // Use right child instead if it is smaller
                int rightChildIndex = getRightChildIndex(index);
                if (rightChildIndex <= lastIndex && arr[rightChildIndex] <
                        arr[childIndex]) {
                    childIndex = rightChildIndex;
                }
                if (arr[childIndex] < rootValue) {
                    // Promote child
                    arr[index] = arr[childIndex];
                    index = childIndex;
                } else {
                    // Root value is larger than both children
                    more = false;
                }
            } else {
                // No children
                more = false;
            }
        }
        // Store root value in vacant slot
        arr[index] = rootValue;
    }
}
