package SortingAlgorithms;

import java.util.Arrays;

public class SortingAlgorithms {

    public static void main(String[] args){

        int[] nums = new int[]{5,6,10,12,1,8,90};

        //bubbleSort(nums);
        //insertionSort(nums);
        //mergeSort(nums,0,nums.length-1);
        quickSort(nums, 0, nums.length-1);

        System.out.println(Arrays.toString(nums));
    }

    /*
        Bubble sort is a sorting algorithm that runs in O(n^2).
        This algorithm is almost always used as a starting point for
        discussing sorting algorithms. It is almost never used in practice due
        to its runtime. The basic idea is that you bubble up the larger numbers towards the end of the array.
     */
    public static void bubbleSort(int[] nums){

        for(int i = 0; i < nums.length; i++){

            for(int j = i+1; j < nums.length; j++){

                if(nums[i] > nums[j]) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }

        }
    }

    /*
        Insertion sort also runs in O(n^2). The basic idea is to sort an array/list in ascending order
        as you would shuffle a deck of cards. Essentially, you iterate through the array and throughout this
        iteration, you have a sorted section of the array and an unsorted section of the array. As you pick up the
        next element in the unsorted section of the array, you iterate through the sorted section of the array and
        place the element in the appropriate position and shift the elements over. Although insertion sort runs in
        O(n^2), it can be efficient for small input sizes/arrays that are mostly sorted.
     */
    public static void insertionSort(int[] nums){

        for(int i = 1; i < nums.length; i++){

            int temp = nums[i];
            int j = i - 1;

            while(j >= 0 && nums[j] > temp){
                nums[j+1] = nums[j];
                j--;
            }

            nums[++j] = temp;
        }

    }

    /*
        Merge sort is part of a family of algorithms referred to as divide and conquer algorithms. This class of algorithms
        runs in O(n log n). In merge sort, you keep diving the array in half until you are left with an array of size 1.
        This array is "sorted" and gets returned. MergeSort will then build on and that and keep merging the "sorted" arrays
        that are recursively returned.
     */
    public static void mergeSort(int[] nums, int lo, int hi){

        if (lo < hi)
        {
            // Find the middle point
            int mid = lo + (hi - lo) / 2;

            // Sort first and second halves
            mergeSort(nums, lo, mid);
            mergeSort(nums, mid+1, hi);

            // Merge the sorted halves
            mergeArrays(nums, lo, mid, hi);
        }

    }

    /*
        Helper method to merge sorted arrays which are being recursively returned by the mergeSort method;
     */
    public static void mergeArrays(int[] nums, int lo, int mid, int hi){

        /* Create temp arrays */
        int[] n1 = new int[mid - lo + 1];
        int[] n2 = new int[hi - mid];

        /*Copy data to temp arrays*/
        for(int i=0; i < n1.length; i++){n1[i] = nums[lo + i];}
        for(int j=0; j < n2.length; j++){n2[j] = nums[mid + 1 + j];}

        /* Merge the temp arrays */
        int i = 0, j = 0, k = lo;

        while (i < n1.length && j < n2.length){
            if (n1[i] <= n2[j]){
                nums[k] = n1[i];
                i++;
            }

            else{
                nums[k] = n2[j];
                j++;
            }

            k++;
        }

        /* Copy remaining elements of n1[] if any */
        while (i < n1.length){
            nums[k] = n1[i];
            i++;
            k++;
        }

        /* Copy remaining elements of n2[] if any */
        while (j < n2.length){
            nums[k] = n2[j];
            j++;
            k++;
        }

    }

    /*
    * Quicksort is another member of the divide and conquer algorithm family. It runs in O(n log n).
    * */
    public static void quickSort(int nums[], int lo, int hi)
    {
        if (lo < hi){
            //Helper method to retrieve pivot point
            int pivot = quickSortHelper(nums, lo, hi);

            //Call quicksort on left side of the pivot point
            quickSort(nums, lo, pivot-1);

            //Call quicksort on right side of the pivot point
            quickSort(nums, pivot+1, hi);
        }
    }

    /* Helper function that puts all elements less than the pivot to the left of the pivot and all elements greater
     * than the pivot to the right. Returns the pivot point so that quicksort method can recursively call quicksort
     * on the subarray left of the pivot and on the subarray to the right of the pivot.
     * */
    public static int quickSortHelper(int nums[], int lo, int hi)
    {
        //Set pivot point to the element in the highest index of the subarray
        int pivot = nums[hi];

        int i = lo - 1;

        for (int j = lo; j < hi; j++){

            // If current element is smaller than or equal to pivot
            if (nums[j] <= pivot){
                int temp = nums[++i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = nums[i+1];
        nums[i+1] = nums[hi];
        nums[hi] = temp;

        return ++i;
    }

}
