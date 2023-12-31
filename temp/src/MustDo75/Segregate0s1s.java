package MustDo75;

class Segregate0s1s
{
	/*Function to put all 0s on left and all 1s on right*/
	static void  segregate0and1(int arr[], int size)
	{
		/* Initialize left and right indexes */
		int left = 0, right = size - 1;

		while (left < right)
		{
			/* Increment left index while we see 0 at left */
			while (arr[left] == 0 && left < right)
				left++;

			/* Decrement right index while we see 1 at right */
			while (arr[right] == 1 && left < right)
				right--;

            /* If left is smaller than right then there is a 1 at left
               and a 0 at right.  Exchange arr[left] and arr[right]*/
			if (left < right)
			{
				arr[left] = 0;
				arr[right] = 1;
				left++;
				right--;
			}
		}
	}

	static void print(int arr[], int n)
	{
		System.out.print("Array after segregation is ");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
	/* Driver Program to test above functions */
	public static void main(String[] args)
	{

		int arr[] = new int[]{1, 0, 1, 0, 1, 1, 1};
		int n = arr.length;

		segregate0and1(arr, n);
		print(arr, n);
	}
}
