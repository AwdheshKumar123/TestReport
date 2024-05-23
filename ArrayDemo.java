package practice;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array length");
		int len = sc.nextInt();

		int arr[] = new int[len + 1];
		System.out.println("Enter " + len + " elements");
		for (int i = 0; i < len; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("elements are :");
		for (int i = 0; i < len; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("Enter one more element you want to store: ");
		int extra = sc.nextInt();

		arr[len] = extra;

		System.out.println("After inserting one elements array are:");
		for (int i = 0; i < len + 1; i++) {
			System.out.println(arr[i]);
		}

	}

}
