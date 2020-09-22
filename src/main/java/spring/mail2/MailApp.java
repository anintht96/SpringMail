package spring.mail2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class MailApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext configApplicationContext=new AnnotationConfigApplicationContext();
		configApplicationContext.register(MailConfig.class);
		configApplicationContext.refresh();
		
		JavaMailSender javaMailSender=configApplicationContext.getBean(JavaMailSender.class);
		SimpleMailMessage mailMessage=new SimpleMailMessage();
		mailMessage.setTo(MyConstans.RECEIVER_MAIL);
		mailMessage.setSubject("Test spring mail.");
		mailMessage.setText("Wellcom to ABC.");
		System.out.println("Mail sending....");
		javaMailSender.send(mailMessage);
		System.out.println("Mail sending done!.");
		configApplicationContext.close();
		
		configApplicationContext.close();
	}
}
