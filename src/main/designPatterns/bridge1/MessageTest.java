package main.designPatterns.bridge1;

public class MessageTest {

	public static void main(String[] args) {

		MessageSender textMessageSender = new TextMessageSender();
		Message textMessage = new TextMessage(textMessageSender);
		textMessage.send("This is a text SMS");
		
		
		MessageSender emailMessageSender = new EmailMessageSender();
		Message emailMessage = new EmailMessage(emailMessageSender);
		emailMessage.send("This is a text email");
		
	}

}
