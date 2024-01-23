package main.designPatterns.bridge1;

public class TextMessage extends Message {

	public TextMessage(MessageSender messageSender) {
		super(messageSender);
	}

	@Override
	protected void send(String messageText) {
		messageSender.sendMessage(messageText);
	}

}
