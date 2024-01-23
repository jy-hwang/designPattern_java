package main.designPatterns.bridge1;

public abstract class Message {

	protected MessageSender messageSender;

	protected Message(MessageSender messageSender) {
		this.messageSender = messageSender;
	}

	protected abstract void send(String messageText);
}
