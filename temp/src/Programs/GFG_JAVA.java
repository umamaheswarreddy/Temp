package Programs;// Java program for the above approach
import java.util.Collections;
import java.util.Vector;

public class GFG_JAVA {

	// Function to sort array in the way
	// mentioned above
	static void AwesomeSort(Vector<Integer> m, int n)
	{
		// Create three vectors
		Vector<Integer> v1 = new Vector<>();
		Vector<Integer> v2 = new Vector<>();
		Vector<Integer> v3 = new Vector<>();

		int i;

		// Traverse through the elements
		// of the array
		for (i = 0; i < n; i++) {

			// If elements are even and
			// divisible by 10
			if (m.get(i) % 10 == 0)
				v1.add(m.get(i));

			// If number is even but not divisible
			// by 5
			else if (m.get(i) % 2 == 0)
				v2.add(m.get(i));
			else
				// If number is odd
				v3.add(m.get(i));
		}

		// Sort v1 in descending orde
		Collections.sort(v1, Collections.reverseOrder());

		for (int ii = 0; ii < v1.size(); ii++) {
			System.out.print(v1.get(ii) + " ");
		}
		for (int ii = v2.size()-1; ii >= 0; ii--) {
			System.out.print(v2.get(ii) + " ");
		}
		for (int ii = 0; ii < v3.size(); ii++) {
			System.out.print(v3.get(ii) + " ");
		}
	}

	// Driver code
	public static void main(String[] args)
	{
		// Given Input
		Vector<Integer> arr = new Vector<>();
		arr.add(1);
		arr.add(5);
		arr.add(2);
		arr.add(10);
		arr.add(4);
		arr.add(7);
		arr.add(3);
		arr.add(20);


		int N = arr.size();

		// FunctionCall
		AwesomeSort(arr, N);
	}
}

// This code is contributed by abhinavjain194
