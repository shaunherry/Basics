package basic;
import java.util.ArrayList;

public class Basic {
	public static void printAll(Integer num) {
		for (int i = 0; i < num; i++)
			System.out.println(i);
		}
	public static void printOdd(Integer num) {
		for (int i = 0; i < num; i++)
			if (i % 2==1) {
				System.out.println(i);
			}
	}
	public static void sum(Integer num) {
		Integer total = 0;
		for (int i = 0; i < num; i++) {
			total = i + total;
			System.out.println("New Number"+i+"Sum"+(i+total));
		}
			System.out.println(total);
			
	}
	public static void iterate() {
		Integer[] arr = {1,3,5,7,9,13};
		for(Integer i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
			
	}
	public static void findMax() {
		Integer[] arr = {-90,-3,-13,-7,0};
		Integer max = arr[0];
		for(Integer i = 0; i < arr.length; i++) {
			
			if (arr[i] > max) {
				max = arr[i];
			}
			
		}
			System.out.println(max);
		
	}
	
	public static void getAverage() {
		Integer[] arr = {1,2,3,4,5,6,7};
		Integer temp = 0;
		for(Integer i = 0; i < arr.length; i++) {
			temp = temp + arr[i];
			
		}
		temp = temp/arr.length;
		System.out.println(temp);
	}
	public void arrOdd(Integer num) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (Integer i = 0;i < num; i++) {
			if(i % 2 == 1) {
				arr.add(i);
			}
		}
		System.out.println(arr);
	}
	public void greaterThanY() {
		Integer[] arr = {1,3,5,7};
		Integer y = 3;
		Integer total = 0;
		for(Integer i = 0; i < arr.length; i++) {
			if(arr[i] > y) {
				total = total + 1;
			}
		}
		System.out.println(total);
	}
	public void squareItBro() {
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		Integer[] arr = {1,2,4,5,10,};
		for(Integer i = 0; i < arr.length; i++) {
			arr2.add(arr[i]*arr[i]);
		}
		System.out.println(arr2);
	}
	public void eliminateNeg() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Integer[] arr2 = {1,2,-4,5,10,};
		for(Integer i = 0; i < arr2.length; i++) {
			if(arr2[i] > 0) {
				arr.add(arr2[i]);
			} else {
				arr.add(0);
			}
		}
		System.out.println(arr);

	}
	public void maxMinAve() {
		Integer[] arr = {1,5,10,-2};
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		Integer min = arr[0];
		Integer max = arr[0];
		Integer ave = arr[0];
		for(Integer i = 0; i < arr.length; i++) {
			ave = arr[i] + ave;
			if(arr[i] < min) {
				min = arr[i];
			} else if (arr[i] > max) {
				max = arr[i];
			}
			
		}
		arr2.add(max);
		arr2.add(min);
		arr2.add(ave/arr.length);
		System.out.println(arr2);
		

	}
	
	public void shift() {
		Integer[] arr = {1,5,10,7,-2};
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		for(Integer i = 1; i < arr.length; i++) {
			arr2.add(arr[i]);
		}
		arr2.add(0);
		System.out.println(arr2);

	}
	
		
	
	
		
	}











