package assignment27;

public class SecLargeNum {
    public static void main(String[] args) {
        int[] arr1 = {20, 45, 67, 34, 76, 54, 86};

        if (arr1.length < 2) {
            System.out.println("Array must have at least two elements");
            return;
        }

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr1) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num != firstLargest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element in the array");
        } else {
            System.out.println("The second largest element in the array is: " + secondLargest);
        }
    }
}
