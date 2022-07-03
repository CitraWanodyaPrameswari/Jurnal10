package com.citra;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] urutan = {23, 43, 12, 50, 5, 17, 8, 60, 11, 3};
        Heaps heapSort = new Heaps(urutan);
        heapSort.sort();

        heapSort.print();
    }
}
