class Player {

	String str = "abc";
	private int jerNo = 0;
	private String name = null;

	Player(int jerNo, String name) {
	
		this.jerNo = jerNo;
		this.name = name;
	}
	void info() {
	
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(name));
		System.out.println(System.identityHashCode(jerNo));
	}
}
class client {

	public static void main(String[] args) {
	
		Player obj1 = new Player(18, "Virat");
		obj1.info();

		Player obj2 = new Player(7, "MSD");
                obj2.info();
	}
}
