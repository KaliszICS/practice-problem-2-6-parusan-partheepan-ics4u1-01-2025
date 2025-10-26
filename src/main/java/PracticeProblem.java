public class PracticeProblem {

    public static void main(String[] args) {
        System.out.println(insertionSort(new double[]{155.2, 155.1, 1, 5, 3, 2, 7})[0]);
    }

    // -------------------------------
    // Bubble Sort (optimized)
    // -------------------------------
    public static int[] bubbleSort(double[] array) {
        int[] stats = new int[]{0, 0}; // [0] = swaps, [1] = steps
        boolean didSwap;

        for (int i = 0; i < array.length; i++) {
            didSwap = false;
            for (int j = 1; j < array.length - i; j++) {
                stats[1]++; // comparison count
                if (array[j] < array[j - 1]) {
                    double temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    stats[0] += 3; // 3 variable changes per swap
                    didSwap = true;
                }
            }
            if (!didSwap) break; // optimization: stop if already sorted
        }
        return stats;
    }

    // -------------------------------
    // Selection Sort
    // -------------------------------
    public static int[] selectionSort(double[] array) {
        int[] stats = new int[]{0, 0}; // [0] = swaps, [1] = steps

        for (int i = 0; i < array.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < array.length; j++) {
                stats[1]++; // count every comparison
                if (array[minPos] > array[j]) {
                    minPos = j;
                    stats[0]++; // reassign minPos = 1 change
                }
            }
            double temp = array[minPos];
            array[minPos] = array[i];
            array[i] = temp;
            stats[0] += 3; // 3 variable changes for swap
        }
        return stats;
    }

    // -------------------------------
    // Insertion Sort
    // -------------------------------
    public static int[] insertionSort(double[] array) {
        int[] stats = new int[]{0, 0}; // [0] = swaps, [1] = steps

        for (int i = 1; i < array.length; i++) {
            double current = array[i];
            int previousIndex = i - 1;
            stats[0]++; // assignment to current

            while (previousIndex >= 0 && array[previousIndex] > current) {
                stats[1]++; // successful comparison
                array[previousIndex + 1] = array[previousIndex];
                previousIndex--;
                stats[0]++; // single variable shift
            }
            array[previousIndex + 1] = current;
            stats[0]++; // final placement
        }

        return stats;
    }

    // -------------------------------
    // Least Swaps
    // -------------------------------
    public static String leastSwaps(double[] array) {
        int bubbleSwaps = bubbleSort(array.clone())[0];
        int selectionSwaps = selectionSort(array.clone())[0];
        int insertionSwaps = insertionSort(array.clone())[0];

        if (bubbleSwaps < selectionSwaps && bubbleSwaps < insertionSwaps) {
            return "Bubble";
        } else if (selectionSwaps < bubbleSwaps && selectionSwaps < insertionSwaps) {
            return "Selection";
        } else if (insertionSwaps < bubbleSwaps && insertionSwaps < selectionSwaps) {
            return "Insertion";
        } else if (insertionSwaps == bubbleSwaps || bubbleSwaps == selectionSwaps) {
            return "Bubble";
        } else if (insertionSwaps == selectionSwaps) {
            return "Insertion";
        } else {
            return "Selection";
        }
    }

    // -------------------------------
    // Least Iterations (Steps)
    // -------------------------------
    public static String leastIterations(double[] array) {
        int bubbleSteps = bubbleSort(array.clone())[1];
        int selectionSteps = selectionSort(array.clone())[1];
        int insertionSteps = insertionSort(array.clone())[1];

        if (bubbleSteps < selectionSteps && bubbleSteps < insertionSteps) {
            return "Bubble";
        } else if (selectionSteps < bubbleSteps && selectionSteps < insertionSteps) {
            return "Selection";
        } else if (insertionSteps < bubbleSteps && insertionSteps < selectionSteps) {
            return "Insertion";
        } else if (insertionSteps == bubbleSteps || bubbleSteps == selectionSteps) {
            return "Bubble";
        } else if (insertionSteps == selectionSteps) {
            return "Insertion";
        } else {
            return "Selection";
        }
    }
}

