/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author kaysere
 */
public class PsychicGarbanzo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Account> accounts = getAccounts();
        Account sender;

        for (int counter = 0; counter < accounts.size(); counter++) {
            sender = accounts.get(counter);
            Mail mail;

            if (sender.initSend()) {
                mail = Mail.getFollowUpMail(sender.getName());
            } else {
                mail = Mail.getInitMail(sender.getName());
            }
            sender.sendMail(mail);
        }
    }

    private static ArrayList<Account> getAccounts() {
        return null;
    }
}
