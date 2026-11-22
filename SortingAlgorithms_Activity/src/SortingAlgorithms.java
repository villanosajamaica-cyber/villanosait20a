public class SortingAlgorithms {

    // Bubble Sort
    public static void bubbleSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort
    public static void selectionSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // Insertion Sort
    public static void insertionSort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    // Display Array
    public static void displayArray(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    // Main Method
    public static void main(String[] args) {

        int originalArray[] = {
            64, 25, 12, 22, 11, 90, 34, 7, 50, 18
        };

        int bubbleArray[] = originalArray.clone();
        int selectionArray[] = originalArray.clone();
        int insertionArray[] = originalArray.clone();

        System.out.println("Original Array:");
        displayArray(originalArray);

        bubbleSort(bubbleArray);
        System.out.println("\nSorted Array using Bubble Sort:");
        displayArray(bubbleArray);

        selectionSort(selectionArray);
        System.out.println("\nSorted Array using Selection Sort:");
        displayArray(selectionArray);

        insertionSort(insertionArray);
        System.out.println("\nSorted Array using Insertion Sort:");
        displayArray(insertionArray);
    }
}
