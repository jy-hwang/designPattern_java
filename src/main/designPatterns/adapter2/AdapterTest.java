package main.designPatterns.adapter2;

public class AdapterTest {
	public static void main(String[] args) {

		Adapter adapter = new AdapterImpl();
		
		System.out.println(adapter.twiceOf(100f));
		System.out.println(adapter.twiceOf(88f));

	}
}
