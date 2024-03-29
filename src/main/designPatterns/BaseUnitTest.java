package main.designPatterns;

import java.nio.charset.StandardCharsets;

public class BaseUnitTest {

	protected final StringBuffer outputs = new StringBuffer();

	public void setUpStreams() {
		outputs.setLength(0);
	}

	protected void print(Object s) {
		print(s, false);
	}

	protected void println(Object s) {
		print(s, true);
	}

	protected void print(Object s, boolean newline) {
		String inputString = s.toString();
		if (newline) {
			inputString += "\n";
		}
		String encodedString = new String(inputString.getBytes(), StandardCharsets.UTF_8);
		System.out.print(encodedString);
		outputs.append(encodedString);
	}

	protected void assertPrintsTrue() {
		String outputString = outputs.toString();
		String encodedString = new String(outputString.getBytes(), StandardCharsets.UTF_8);
	}

}
