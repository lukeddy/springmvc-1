package cjp.learn.mail;

import java.io.UnsupportedEncodingException;

import javax.mail.internet.MimeUtility;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

/**
 * 
 * @author cjp1989
 * @简介 :执行测试email发送
 */
public class MailSend {

	public static void main(String[] args) {
		//测试带有
		sendSingleEmail();
		
	}

	
	
	
	/**
	 * @author cjp1989 执行SimpleEmail发送
	 */
	public static void sendSingleEmail() {

		try {
			// Email email = new SimpleEmail();
			MultiPartEmail email = new MultiPartEmail();

			email.setHostName("smtp.qq.com");
			email.setSmtpPort(465);
			email.setCharset("utf-8");
			// email.setPopBeforeSmtp(true, "pop.qq.com", "576869683",
			// "cjp19891016");

			// 创建附件
			EmailAttachment attachment = new EmailAttachment();

			attachment.setPath("f:/租房合同.doc");
			attachment.setDisposition(EmailAttachment.ATTACHMENT);
			attachment.setDescription(MimeUtility.encodeText("这是一封附件"));
			//避免中文乱码
			attachment.setName(MimeUtility.encodeText("租房合同.doc"));
			email.attach(attachment);

			email.setAuthenticator(new DefaultAuthenticator("576869683",
					"cjp19891016"));
			email.setSSLOnConnect(true);

			email.setFrom("576869683@qq.com");
			email.setSubject("亲，附件无乱码");
			email.setMsg("租房合同哟");
			email.addTo("selin1989@126.com");

			email.send();

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (EmailException e) {
			e.printStackTrace();
		}
	}
}
