package Builder;

import java.util.Arrays;
import java.util.List;

public class EmailMessage extends AEmailMessage {

    public static class BuilderEmailMessage{
        EmailMessage emailMessage;

        public BuilderEmailMessage(){
            emailMessage = new EmailMessage();
        }

        BuilderEmailMessage setSubject(String subject){
            emailMessage.subject =  subject;
            return this;
        }

        BuilderEmailMessage setBody(String body){
            emailMessage.body = body;
            return this;
        }


        BuilderEmailMessage setSender(Recipient recipient){
            emailMessage.sender = recipient;
            return this;
        }

        BuilderEmailMessage setRecipients(List<? extends Recipient> recipients){
            emailMessage.recipients = recipients;
            return this;
        }
        EmailMessage build(){
            return emailMessage;
        }

    }

    @Override
    public String toString() {
        return "EmailMessage{" +
                "recipients=" + recipients +
                ", sender=" + sender +
                ", body='" + body + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }

    @Override
    public void send() {
            System.out.println("Пиьсмо отправлено ");
    }

    @Override
    public EmailMessage receive() {
        return this;
    }

    public EmailMessage create(Recipient sender, Recipient... recipient) {
        this.sender = sender;
        this.recipients = Arrays.asList(recipient);
        return this;
    }



}
