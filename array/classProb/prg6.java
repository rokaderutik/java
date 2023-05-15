class arrayDemo {
	
	public static void main(String[] args) {
	
		float arr1[] = {10.5, 20.5};	//error: incompatible types: possible lossy conversion from double to float

		int arr2[] = {10.5f, 20.5f};	//error: incompatible types: possible lossy conversion from float to int

		int arr3[] = {'A', 'B'};

	}
}
