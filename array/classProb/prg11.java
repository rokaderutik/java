class arrayDemo {
	
	public static void main(String args[]) {
	
		int arr [] = {10,20,30};

		for(int x : arr) {

                        System.out.println(x);
                }

		fun(arr);

		gun(arr);

		for(int x : arr) {

                        System.out.println(x);
                }

	}

	static void fun(int arr[]) {
	
		for(int x : arr) {
		
			System.out.println(x);
		}
	}
	static void gun(int arr[]) {

                for(int i=0; i<arr.length; i++) {

			arr[i] += 100;
                }
        }

}
