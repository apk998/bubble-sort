class BubbleSortInt {
    static void bubbleSort(int[] array, int n) {
        // nothing to sort in an array only 1 element long
        if (n == 1) {
            return;
        }
        // iterating over unsorted elements
        for (int i = 0; i < n-1; i++) {
            // check if two neighboring elements are out of order
            if (array[i] > array[i+1]) {
                // if so, swap them
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
        }
        // recursively call bubbleSort on the remaining unsorted portion
        bubbleSort(array, n-1);
    }
    // method to display the array
    void display(int[] array) {
        for (int elem : array) {
            System.out.print(elem + " ");
        }
    }
    public static void main(String[] args) {
        BubbleSortInt example = new BubbleSortInt();
        int[] array = {8, 14, 35, 107, 40, 2, 71};

        bubbleSort(array, array.length);
        example.display(array);
    }
}

class BubbleSortChar {
    static void bubbleSort(char[] array, int n) {
        if (n == 1) {
            return;
        }
        for (int i = 0; i < n-1; i++) {
            if (array[i] > array[i+1]) {
                char temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
        }
        bubbleSort(array, n-1);
    }
    void display(char[] array) {
        for (char elem : array) {
            System.out.print(elem + " ");
        }
    }
    public static void main (String[] args) {
        BubbleSortChar example = new BubbleSortChar();
        char[] array = {'b', 'q', 'm', 'a', 'i', 'y', 's'};

        bubbleSort(array, array.length);
        example.display(array);
    }
}