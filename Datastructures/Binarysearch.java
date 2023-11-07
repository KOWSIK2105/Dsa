package Datastructures;

import java.util.Scanner;

public class Binarysearch {

    static int binarySearch(int arr[], int tar) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            boolean isAsc = arr[start] < arr[end];
            if (arr[mid] == tar) {
                return mid;
            }
            if (isAsc) {
                if (arr[mid] < tar) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] < tar) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the range : ");
        int n = s.nextInt();
        System.out.println("Enter the values : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter the target value:");
        int tar = s.nextInt();
        int ans = binarySearch(arr, tar);
        System.out.println(ans);
    }
}
