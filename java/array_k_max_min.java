//Java program to find the first 'k' max and min elements of an array.

import java.util.Scanner;

public class array_k_max_min {
    public static void main(String[] args) {
        int c;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.print("Wrong input!");
            System.exit(0);
        } else {
            int a[] = new int[n];

            for (; ; ) {
                System.out.println("\n\t\t1. Enter values in Array.\n\t\t2. Display array elements.\n\t\t3. Find k maximum elements in array.\n\t\t4. Find k minimums element in array.\n\t\t5. Exit.");
                c = sc.nextInt();

                switch (c) {
                    case 1:
                        System.out.println("Enter the elements of the array: ");
                        for (int i = 0; i < n; i++) {
                            a[i] = sc.nextInt();
                        }
                        break;

                    case 2:
                        System.out.println("Array elements are: ");
                        for (int i = 0; i < n; i++) {
                            System.out.print(a[i] + " ");
                        }
                        break;
                    case 3:
                        int temp = 0;
                        System.out.print("Enter the value of k: ");
                        int k = sc.nextInt();
                        if(k>n)
                        {
                            System.out.print("Wrong input!");
                            System.exit(0);
                        }
                        else {
                            System.out.println("Maximum Array elements are: ");
                            for (int i = 0; i < n; i++) {
                                for (int j = i + 1; j < n; j++) {
                                    if (a[i] > a[j]) {
                                        temp = a[i];
                                        a[i] = a[j];
                                        a[j] = temp;
                                    }
                                }
                            }
                            for (int x = n - 1; x >= (n - k); x--) {
                                System.out.print(a[x] + " ");
                            }
                        }
                        break;
                    case 4:
                        System.out.print("Enter the value of k: ");
                        int k1 = sc.nextInt();
                        int tmp = 0;
                        if(k1>n)
                        {
                            System.out.print("Wrong input!");
                            System.exit(0);
                        }
                        else {
                            System.out.println("Minimum Array elements are: ");
                            for (int i = 0; i < n; i++) {
                                for (int j = i + 1; j < n; j++) {
                                    if (a[i] > a[j]) {
                                        temp = a[i];
                                        a[i] = a[j];
                                        a[j] = temp;
                                    }
                                }
                            }
                            for (int x = 0; x < k1; x++) {
                                System.out.print(a[x] + " ");
                            }
                        }
                        break;
                    case 5:
                        System.exit(0);
                }
            }
        }
    }
}
