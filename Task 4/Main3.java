interface MessageSender {
	void sendMessage(String message);
}

class EmailSender implements MessageSender {
	
	@Override
	public void sendMessage(String message ) {
		System.out.println("Sending Email: "+message);
	}
}

class SMSSender implements MessageSender {
	
	@Override
	public void sendMessage(String message ) {
		System.out.println("Sending SMS: "+message);
	}
}

class NotificationService {
	private MessageSender messageSender;
	
	public NotificationService(MessageSender messageSender) {
		this.messageSender = messageSender;
	}
	
	public void alterUser(String msg) {
		messageSender.sendMessage(msg);
	}
}


public class Main3 {
	public static void main(String[] args) {
		
		MessageSender email = new EmailSender();
		NotificationService notic1 = new NotificationService (email);
		notic1.alterUser("Your order has been shipped!");
		
		MessageSender sms = new SMSSender();
		NotificationService notic2 = new NotificationService(sms);
		notic2.alterUser("Your OTP is 232115273.");
	}
}

