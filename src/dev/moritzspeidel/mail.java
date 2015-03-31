package dev.moritzspeidel;
import com.sendgrid.SendGrid;
import com.sendgrid.SendGrid.Email;
import com.sendgrid.SendGridException;
 class mail {
public static void send(String to,String toName, String from, String subject, String text, String sendGrip_user,String sendGrip_password){
	com.sendgrid.SendGrid sendgrid = new com.sendgrid.SendGrid(sendGrip_user,sendGrip_password);
	Email email = new Email();
	email.addTo(to);
	email.addToName(toName);
	email.setFrom(from);
	email.setSubject(subject);
	email.setText(text);
	try {
		SendGrid.Response response = sendgrid.send(email);
	      System.out.println(response.getMessage());
	} catch (SendGridException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public static void send(String to,String toName, String from, String subject, String text,String html, String sendGrip_user,String sendGrip_password){
	com.sendgrid.SendGrid sendgrid = new com.sendgrid.SendGrid(sendGrip_user,sendGrip_password);
	Email email = new Email();
	email.addTo(to);
	email.addToName(toName);
	email.setFrom(from);
	email.setSubject(subject);
	email.setText(text);
	email.setHtml(html);
	try {
		SendGrid.Response response = sendgrid.send(email);
	      System.out.println(response.getMessage());
	} catch (SendGridException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
