package Builder;

public interface IEmailMessage {
    void send(); // отправить письмо
    IEmailMessage receive(); // получить письмо
    IEmailMessage create(Recipient sender, Recipient... recipient); // создать письмо
}
