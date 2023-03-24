//print profit or loss.

class maxOF3{
	public static void main(String[] args){
		//double sp = 1200, cp = 1000;
		double sp = 500, cp = 600;
		//double sp = 900, cp = 900;
		if(sp > cp)
			System.out.println("Profit = "+ (sp-cp));
		else if(sp < cp)
			System.out.println("Loss = " + (cp-sp));
		else
			System.out.println("No profit, No loss");
	}
}
