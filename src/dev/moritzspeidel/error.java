package dev.moritzspeidel;

import javax.swing.JOptionPane;


public class error {
public static void showError(String mailmessage, String to,String toName,String from, String subject,String sendGrip_user,String sendGrip_password, String errormessage, String errortitle ){
	int option = JOptionPane.showConfirmDialog(null, errormessage,errortitle, JOptionPane.YES_NO_OPTION);
	if(option==0){
		mail.send(to, toName,from,subject,mailmessage, sendGrip_user, sendGrip_password);
		
	}
	
}
}
