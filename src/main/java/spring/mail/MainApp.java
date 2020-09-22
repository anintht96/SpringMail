package spring.mail;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		MailSender mailSender=(MailSender) context.getBean("mailSender");
		System.out.println("Sending text...");
		SimpleMailMessage mailMessage=new SimpleMailMessage();
		mailMessage.setFrom("anintht96@gmail.conm");
		mailMessage.setTo("ann121096@gmail.com");
		mailMessage.setSubject("Test spring mail.");
		mailMessage.setText("Wellcom to ABC");
		
		mailSender.send(mailMessage);
		System.out.println("Mail sending text done!.");
		context.close();
	}
}
