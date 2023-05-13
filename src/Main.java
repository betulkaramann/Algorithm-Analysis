import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] mainArr = new int[75];
        int[] arr = new int[75];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            mainArr[i] = rand.nextInt(100);
            arr = Arrays.copyOf(mainArr, mainArr.length);
        }
        System.out.println("-------------------------------------------------");
        //Quick Sort Part
        QuickSort quicksorting = new QuickSort();

        long start = System.nanoTime();
        System.out.println("Before Quick Sort: "+ Arrays.toString(mainArr));
        quicksorting.quickSort(arr);
        long end = System.nanoTime();
        System.out.println("After Quick Sort: " + Arrays.toString(arr));

        float sec = (end - start) / 1000F; System.out.println("Quick Sort time counter: "+ sec + " nanoseconds");
        start =  0;
        end= 0;
        sec= 0;

        //Merge Sort Part

        System.out.println("-------------------------------------------------");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        MergeSort mergesorting = new MergeSort();
        start = System.nanoTime();
        System.out.println("Before Merge Sort: "+ Arrays.toString(mainArr));
        mergesorting.mergeSort(arr);
        end = System.nanoTime();
        System.out.println("After Merge Sort: " + Arrays.toString(arr));

        sec = (end - start) / 1000F; System.out.println("Merge Sort time counter: "+ sec + " nanoseconds");
        start =  0;
        end= 0;
        sec= 0;


        System.out.println("-------------------------------------------------");
        //Heap Sort part

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        HeapSort heapsorting = new HeapSort();
        start = System.nanoTime();
        System.out.println("Before Heap Sort: "+ Arrays.toString(mainArr));
        heapsorting.heapSort(arr);
        end = System.nanoTime();
        System.out.println("After Heap Sort: " + Arrays.toString(arr));

        sec = (end - start) / 1000F; System.out.println("Heap Sort time counter: "+ sec + " nanoseconds");
        start =  0;
        end= 0;
        sec= 0;

        System.out.println("-------------------------------------------------");
        //Bubble Sort part

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        BubbleSort bubblesorting = new BubbleSort();
        start = System.nanoTime();
        System.out.println("Before Bubble Sort: "+ Arrays.toString(mainArr));
        bubblesorting.bubbleSort(arr);
        end = System.nanoTime();
        System.out.println("After Bubble Sort: " + Arrays.toString(arr));

        sec = (end - start) / 1000F; System.out.println("Bubble Sort time counter: "+ sec + " nanoseconds");
        start =  0;
        end= 0;
        sec= 0;

        System.out.println("-------------------------------------------------");
        //Selection Sort part

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        SelectionSort selectionsorting = new SelectionSort();
        start = System.nanoTime();
        System.out.println("Before Selection Sort: "+ Arrays.toString(mainArr));
        selectionsorting.selectionSort(arr);
        end = System.nanoTime();
        System.out.println("After Selection Sort: " + Arrays.toString(arr));

        sec = (end - start) / 1000F; System.out.println("Selection Sort time counter: "+ sec + " nanoseconds");
        start =  0;
        end= 0;
        sec= 0;
        System.out.println("-------------------------------------------------");
        //Insertion Sort part

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        InsertionSort insertionSorting = new InsertionSort();
        start = System.nanoTime();
        System.out.println("Before Insertion Sort: "+ Arrays.toString(mainArr));
        insertionSorting.insertionSort(arr);
        end = System.nanoTime();
        System.out.println("After Insertion Sort: " + Arrays.toString(arr));

        sec = (end - start) / 1000F; System.out.println("Insertion Sort time counter: "+ sec + " nanoseconds");
        start =  0;
        end= 0;
        sec= 0;

        System.out.println("-------------------------------------------------");
        //Radix Sort part

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        RadixSort radixSorting = new RadixSort();
        start = System.nanoTime();
        System.out.println("Before Radix Sort: "+ Arrays.toString(mainArr));
        radixSorting.radixSort(arr);
        end = System.nanoTime();
        System.out.println("After Radix Sort: " + Arrays.toString(arr));

        sec = (end - start) / 1000F; System.out.println("Radix Sort time counter: "+ sec + " nanoseconds");
        start =  0;
        end= 0;
        sec= 0;
    }
}