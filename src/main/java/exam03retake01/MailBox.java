package exam03retake01;

import java.util.ArrayList;
import java.util.List;

public class MailBox {

    private List<Mail> mails = new ArrayList<>();

    public void addMail(Mail mail1) {
        mails.add(mail1);
    }

    public List<Mail> getMails() {
        return new ArrayList<>(mails);
    }

    public List<Mail> findByCriteria(String criteria) {
        if (criteria.charAt(0) == 'f') {
            mailsFrom(criteria);
        }
        if (criteria.charAt(0) == 't') {
            mailsTo(criteria);
        }
        List<Mail> result3 = new ArrayList<>();
        for (Mail mail : mails) {
            if (mail.getSubject().equals(criteria) || mail.getMessage().contains(criteria)) {
                result3.add(mail);
            }
        }
        return result3;
    }

    private List<Mail> mailsFrom(String criteria) {
        List<Mail> result1 = new ArrayList<>();
        String c = criteria.substring(5);
            for (Mail mail : mails) {
                if (mail.getFrom().getEmail().equals(c) || mail.getFrom().getName().equals(c)) {
                    result1.add(mail);
                }
            }
        return result1;
    }

    private List<Mail> mailsTo(String criteria) {
        List<Mail> result2 = new ArrayList<>();
        String s = criteria.substring(3);
        for (int i = 0; i < mails.size(); i++) {
            if (mails.get(i).getTo().equals(s)) {
                result2.add(mails.get(i));
            }
        }
        return result2;
    }
}
