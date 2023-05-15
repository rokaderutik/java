class arrayDemo {

	public static void main(String arg[]) {
		
		int arr1[] = new int[3];
		arr1[0] = 10;
		arr1[1] = 10;
		arr1[2] = 10;

		int arr2[] = {20, 20, 20, 20};

		int arr3[] = new int[]{30, 30, 30, 30};

		int arr4[] = new int[4]{40, 40, 40, 40};//error: array creation with both dimension expression and initialization is illegal
	}
}
