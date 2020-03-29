package Builder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Recipient recipient = new Recipient.Builder().setUsername("Отправитель").setAddress("какой то адрес").build();
        Recipient recipient1 = new Recipient.Builder().setUsername("Получатель1").setAddress("какой то адрес").build();
        Recipient recipient2 = new Recipient.Builder().setUsername("Получатель2").setAddress("какой то адрес").build();
        List<Recipient> recipients = new ArrayList<>();
        recipients.add(recipient1);
        recipients.add(recipient2);

        EmailMessage emailMessage = new EmailMessage.BuilderEmailMessage().setSubject("Тема письма").setBody("бла бла бла").setSender(recipient).setRecipients(recipients).build();

        System.out.println(recipient);
        System.out.println(emailMessage);
    }

}
