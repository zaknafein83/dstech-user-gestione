package it.dstech.formazione.users.service;

import javax.mail.MessagingException;

public interface MailService {
	public void inviaMail(String destinatarioMail, String oggettoMail, String messaggioMail) throws MessagingException;

}
