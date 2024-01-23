package main.designPatterns.bridge1;

public class EmailMessage extends Message {

	public EmailMessage(MessageSender messageSender) {
		super(messageSender);
	}

	@Override
	protected void send(String messageText) {
		messageSender.sendMessage(messageText);
	}

}
