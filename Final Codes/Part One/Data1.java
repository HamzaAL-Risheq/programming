package finalAssignment;
import java.util.Scanner; 
public class Data1 {
	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	int x = input.nextInt();
	int y = input.nextInt();
	System.out.println(data(x,y));
	int [] array = {10,20,30,45,57};
	System.out.println(data(array));
	input.close();
	}
	// call by value.
	static int data(int x,int y) {
		if (x > 0 && y > 0) 
			return x+y;
		return 0;
	}
	// call by refrence.
	static double data(int [] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) 
			sum = sum + array[i];
		return (double)sum /array.length;
	}
} 
