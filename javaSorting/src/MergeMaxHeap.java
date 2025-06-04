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

    public static int[] compareBlock(int[] block) {

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

    public static int[] adjustHeap(int[] heap) {

        int count = 0;

        while (Math.pow(2, count) < heap.length) {




            count++;

        }

        if (Math.pow(2, count) != heap.length) {


        }

        return new int[0];

    }

    public static int[] maxHeap(int[] heap) {

        int[] maxHeap =  new int[heap.length];

        return maxHeap;

    }

    public static int[] mergeMaxHeap(int[] maxheap1, int[] maxheap2) {

        int[] newHeap = new int[maxheap1.length + maxheap2.length];

        System.arraycopy(maxheap1, 0, newHeap, 0, maxheap1.length);
        System.arraycopy(maxheap2, 0, newHeap, maxheap1.length, maxheap2.length);





        return newHeap;

    }

}