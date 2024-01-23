package main.designPatterns.adapter1.classAdapter;

public class PrintTest {

	public static void main(String[] args) {

		Print p = new PrintBanner("Hello");
		
		p.printWeak();
		
		p.printStrong();
		
	}

}
