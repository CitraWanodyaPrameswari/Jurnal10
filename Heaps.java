package com.citra;

public class Heaps {
        private int[] a;
        public Heaps(int[] anArray) {
            a = anArray;
        }
        public void sort() {
            int n = a.length - 1;
            for (int i = (n - 1) / 2; i >= 0; i--)
                sort(i, n);
            while (n > 0) {
                swap(0, n);
                n--;
                sort(0, n);
            }
        }
    private void sort(int i, int n) {
    }

    private void fixHeap(int rootIndex, int lastIndex) {
            int rootValue = a[rootIndex];

            int index = rootIndex;
            boolean more = true;
            while (more) {
                int childIndex = getLeftChildIndex(index);
                if (childIndex <= lastIndex) {
                    // Use right child instead if it is larger
                    int rightChildIndex = getRightChildIndex(index);
                    if (rightChildIndex <= lastIndex && a[rightChildIndex] >
                            a[childIndex]) {
                        childIndex = rightChildIndex;
                    }
                    if (a[childIndex] > rootValue) {
                        // Promote child
                        a[index] = a[childIndex];
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
            a[index] = rootValue;
        }

        private void swap(int i, int j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

        private static int getLeftChildIndex(int index) {
            return 2 * index + 1;
        }

        private static int getRightChildIndex(int index) {
            return 2 * index + 2;
        }
        public void print(){
            System.out.println("Setelah dilakukan heapsort:");
            for (int i = 0; i < a.length; i++){
                System.out.print(a[i] + " ");
            }
        }
    }
