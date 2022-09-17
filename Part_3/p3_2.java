import java.util.*;

public class p3_2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		Vector<Temp> vector = new Vector<Temp>(5);
		for(int i = 0 ; i < 5 ; i++) {
			Temp t = new Temp();
			vector.add(t);
		}
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println(i+1 + ". " + vector.get(i).p + " " + vector.get(i).s);
		}
		sc.close();
	}
}

interface IPrinter{
	int p = 10;
	void displayp();
	
}

interface IScanner{	
	int s = 20;
	void displays();
}

class Temp implements IPrinter, IScanner{
	public void displayp() {
		System.out.println("IPrinter called");
	}
	
	public void displays() {
		System.out.println("IScanner called");
	}
}