// This is the implementation of MergeMaxHeap method that you can find in:
// https://www.geeksforgeeks.org/problems/merge-two-binary-max-heap0144/1?page=1&category=Heap&difficulty=Easy&sortBy=submissions

public class MergeMaxHeap {

    public static void main(String[] args) {

        int[] maxheap1 = {10, 5, 6, 2};
        int[] maxheap2 = {12, 7, 9};

        int[] mergedMaxHeap = mergeMaxHeap(maxheap1, maxheap2);

        for (int i : mergedMaxHeap) {

            System.out.println(i);

        }

        
    }

    private static int[] compareBlock(int[] block) {

        boolean needChanges = Math.max(block[1], block[2]) > block[0];


        if (needChanges) {

            int father = block[0];

            int indexGreaterSon;

            if (block[1] > block[2]) {

                indexGreaterSon = 1;

            } else {

                indexGreaterSon = 2;

            }

            int new_father = block[indexGreaterSon];
            
            block[0] = new_father;

            block[indexGreaterSon] = father;

        }

        return block;

    }

    private static int[] adjustHeap(int[] heap) {

        int[] newHeap;

        boolean isCorrect = (Math.log(heap.length+1) / Math.log(2)) % 2 == 0;

        if (!isCorrect) {

            int size = heap.length+1;

            for (int i = size; ((Math.log(i) / Math.log(2)) % 2 != 0); i++) {

                size = i;

            }

            size = (int) (Math.log(size) / Math.log(2));

            newHeap = new int[size];

            System.arraycopy(heap, 0, newHeap, 0, heap.length);

            int[] nZeros = new int[size - heap.length];

            System.arraycopy(nZeros, 0, newHeap, heap.length, nZeros.length);

            return newHeap;

        }

        return heap;

    }

    private static int[][] splitBlocksFromLevel(int level) {

        int[][] blocksFromLevel = new int[(int) Math.pow(2, level+1) / 2][3];

        for (int i = 0; i < (int) Math.pow(2, level+1) / 2; i++) {

            

        }

    }

    private static int[] maxHeap(int[] originalHeap) {

        int[] heap = adjustHeap(originalHeap);

        int height = (int) (Math.log(heap.length+1) / Math.log(2));

        int[] levels = new int[height];

        for (int i = 0; i < height; i++) {

            levels[i] = i;

        }


        return new int[0];

    }

    public static int[] mergeMaxHeap(int[] maxheap1, int[] maxheap2) {

        int[] newHeap = new int[maxheap1.length + maxheap2.length];

        System.arraycopy(maxheap1, 0, newHeap, 0, maxheap1.length);
        System.arraycopy(maxheap2, 0, newHeap, maxheap1.length, maxheap2.length);





        return newHeap;

    }

}