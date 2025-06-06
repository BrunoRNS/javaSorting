
import java.util.Arrays;


// https://www.geeksforgeeks.org/problems/merge-two-binary-max-heap0144/1?page=1&category=Heap&difficulty=Easy&sortBy=submissions

public class MergeMaxHeap {

    public static void main(String[] args) {

        int[] maxheap1 = {10, 5, 6, 2};
        int[] maxheap2 = {12, 7, 9};

        int[] mergedMaxHeap = mergeMaxHeap(maxheap1, maxheap2);

        for (int i : mergedMaxHeap) {

            System.out.print(i + " ");

        }

        System.out.println();

        
    }

    private static int[] compareBlock(int[] block) {

        boolean needChanges = block[1] > block[0] || block[2] > block[0];


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

    private static int[][] deepCopyBlocks(int[][] blocks) {

        int[][] copy = new int[blocks.length][3];

        for (int i = 0; i < blocks.length; i++) {

            copy[i] = Arrays.copyOf(blocks[i], 3);

        }

        return copy;

    }
    

    private static int[] adjustHeap(int[] heap) {

        int length = heap.length;

        int height = 0;

        while ((int) Math.pow(2, height) - 1 < length) {

            height++;

        }

        int fullSize = (int) Math.pow(2, height) - 1;

        int[] newHeap = new int[fullSize];


        for (int i = 0; i < newHeap.length; i++) {

            if (i < heap.length) {

                newHeap[i] = heap[i];

            } else {

                newHeap[i] = 0;

            }
            
        }

        return newHeap;
    }

    private static int[][] splitBlocksFromLevel(int[] heap, int level) {
    
        int startIndex = (int) Math.pow(2, level) - 1;
        int endIndex = Math.min(heap.length, (int) Math.pow(2, level + 1) - 1);
        int numBlocks = (endIndex - startIndex);

        int[][] blocksFromLevel = new int[numBlocks][3];

        for (int i = 0; i < numBlocks; i++) {

            int fatherIndex = startIndex + i;
            int leftChildIndex = (2 * fatherIndex ) + 1;
            int rightChildIndex = (2 * fatherIndex )+ 2;

            blocksFromLevel[i][0] = heap[fatherIndex];
            blocksFromLevel[i][1] = heap[leftChildIndex];
            blocksFromLevel[i][2] = heap[rightChildIndex];
        
        }

        return blocksFromLevel;
    }

    private static int[] applyBlocksOnHeap(int[] heap, int[][] blocks, int level) {

        int startIndex = (int) Math.pow(2, level) - 1;

        for (int i = 0; i < blocks.length; i++) {

            int fatherIndex = startIndex + i;
            int leftChildIndex = 2 * fatherIndex + 1;
            int rightChildIndex = 2 * fatherIndex + 2;

            heap[fatherIndex] = blocks[i][0];

            if (leftChildIndex < heap.length) {

                heap[leftChildIndex] = blocks[i][1];

            }

            if (rightChildIndex < heap.length) {

                heap[rightChildIndex] = blocks[i][2];

            }

        }

        return heap;

    }

    private static int[][] iterateFromLevel(int[][] blocks) {

        for (int i = 0; i < blocks.length; i++) {

            blocks[i] = compareBlock(blocks[i]);

        }

        return blocks;

    }

    private static boolean hasChanged(int[][] oldBlocks, int[][] newBlocks) {

        for (int i = 0; i < oldBlocks.length; i++) {

            if (!Arrays.equals(oldBlocks[i], newBlocks[i])) {

                return true;

            }

        }

        return false;

    }

    private static int[] heapify(int[] originalHeap) {

        int[] heap = Arrays.copyOf(originalHeap, originalHeap.length);
        int height = (int) (Math.log(heap.length) / Math.log(2));

        int level = height - 1;

        while (level >= 0) {

            int[][] splittedLevel = splitBlocksFromLevel(heap, level);
            int[][] oldBlocks = deepCopyBlocks(splittedLevel);
            int[][] iteratedLevel = iterateFromLevel(splittedLevel);

            if (hasChanged(oldBlocks, iteratedLevel)) {

                heap = applyBlocksOnHeap(heap, iteratedLevel, level);

                if (level < height - 1) {

                    level--;

                }

            } else {

                level--;

            }

        }

        return heap;

    }

    public static int[] mergeMaxHeap(int[] maxheap1, int[] maxheap2) {

        int[] heap = new int[maxheap1.length + maxheap2.length];

        System.arraycopy(maxheap1, 0, heap, 0, maxheap1.length);
        System.arraycopy(maxheap2, 0, heap, maxheap1.length, maxheap2.length);

        int[] newHeap = new int[heap.length];
        
        int i = 0;

        int[] actualHeap = heapify(adjustHeap(heap));

        while (actualHeap[0] != 0) {

            newHeap[i] = actualHeap[0];
            i++;

            actualHeap[0] = 0;

            actualHeap = heapify(actualHeap);

        }

        return newHeap;

    }

}