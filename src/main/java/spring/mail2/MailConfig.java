package spring.mail2;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class MailConfig {

	@Bean
	public JavaMailSender getJavaMailSender() {
		JavaMailSenderImpl mailSenderImpl=new JavaMailSenderImpl();
		
		Properties properties=new Properties();
		properties.put("mail.transport.protocal", "smtp");
		properties.put("mail.smtp.auth", true);
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.debug", "true");
		
		mailSenderImpl.setHost("smtp.gmail.com");
		mailSenderImpl.setPort(587);
		
		mailSenderImpl.setUsername(MyConstans.MY_EMAIL);
		mailSenderImpl.setPassword(MyConstans.MY_PASSWORD);
		
		mailSenderImpl.setJavaMailProperties(properties);
		
		return mailSenderImpl;
	}
}
