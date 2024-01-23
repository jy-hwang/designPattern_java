package main.designPatterns.bridge1;

public class TextMessageSender implements MessageSender {

	@Override
	public void sendMessage(String messageText) {
		System.out.println("TextMessageSender : Sending text message - " + messageText);
	}

}
