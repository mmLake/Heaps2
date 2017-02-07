
public class Main {
	

	/* A public integer array is used in part two, so that the array is written over every time a new array is created.
	By writing over the array, we save memory space*/
	public static Integer[] secArray;
	
	//main method
	public static void main(final String[] args){
		partOne();
		partTwo();
	}
	//creates first part of project
	public static void partOne(){
		System.out.println("This is part 1 of Project 2: ");
		Integer[] array = new Integer[] { 12, 19,26, 13,20,27, 14,21,28, 15,22,29, 16,23, 10, 17,24, 11, 18,25};
		System.out.println(java.util.Arrays.toString(array));
		Heap.sort(array);
		System.out.println();
	}
	//creates second part of project
	public static void partTwo(){
		System.out.println("This is part 2 of Project 2:");
		int total = 0;
		for(int i = 0; i < 20; i++){
			secArray = createArray();
			Heap.sort(secArray);
			total += Heap.getCount(secArray);
			System.out.print("This is Array number " + (i + 1) + " and the number of swaps is: " + Heap.getCount(secArray));
			System.out.println();
			Heap.setCount(secArray);
		}
		System.out.println("The average number of swaps for the 20 trials is: " + (total / 20));
	}
	
	//creates a random array of size 100, with values between I 00-800, used in partTwo() method
	public static Integer[] createArray(){
		Integer[] secArray = new Integer[100];
		for (int i = 0; i < 100; i++){
			secArray[i] = 100 + (int) (Math.random() * 800);
		}
		return secArray;
	}
}
	
