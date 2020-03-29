package Builder;

import java.util.List;

public abstract class AEmailMessage implements IEmailMessage {
    List<? extends Recipient> recipients; // получатели
    Recipient sender; // отправитель
    String body; // текст письма
    String subject; // тема письма
}
