// all of the code here will be seperated by the // so ill say // problem 1 and then write the code for problem one, then after that ill do
 // problem 2 and so on, the code here can be tested separately if you want to do that 

// problem 1 

public class numberoccurrences {
    public static int numberoccurrences(int[] array, int target) {
        int occurrences = 0;
        for (int element : array) {
            if (element == target) {
                occurrences++;
            }
        }
        return occurrences;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 3, 3, 4, 4, 4, 4, 4, 2, 2, 5, 5};
        int target = 6;
        int result = numberoccurrences(numbers, target);
        System.out.println("The number " + target + " appears " + result + " times.");
    }
}

// problem 2 

public class ReverseArray {
    public static int[] reverseArray(int[] input) {
        int length = input.length;
        int[] reversed = new int[length];
        for (int i = 0; i < length; i++) {
            reversed[i] = input[length - 1 - i];
        }
        return reversed;
    }

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 99, 33, 55, 13141};
        int[] reversedArray = reverseArray(originalArray);

        System.out.print("Original array: ");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Reversed array: ");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

// problem 3 

public class SumGrid {
    public static double sumGrid(double[][] matrix) {
        double totalSum = 0.0;
        for (double[] row : matrix) {
            for (double element : row) {
                totalSum += element;
            }
        }
        return totalSum;
    }

    public static void main(String[] args) {
        double[][] grid = {
            {1.5, 2.5, 3.5},
            {4.1, 5.4, 6.2},
            {7.5, 8.9, 9.8}
        };

        double sum = sumGrid(grid);
        System.out.println("the total sum of the entire grid is: " + sum);
    }
}

// problem 4 

public class Fibonacci {
    public static int fib(int position) {
        if (position <= 0) {
            return 0;
        }
        if (position == 1) {
            return 1;
        }

        int previous = 0, current = 1;
        for (int i = 2; i <= position; i++) {
            int next = previous + current;
            previous = current;
            current = next;
        }
        return current;
    }

    public static void main(String[] args) {
        int n = 55;
        System.out.println("The " + n + "th number in the Fibonacci sequence is: " + fib(n));
    }
}
