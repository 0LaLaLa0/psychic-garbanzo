/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kaysere
 */
public class Account {
    //TODO
    private final String adress;
    private final String name;
    private final boolean initMail;
    
    public Account(String adress, String name, boolean initMail) {
        this.adress = adress;
        this.name = name;
        this.initMail = initMail;
    }
    
    public boolean sendMail(Mail mail){
        return false;
    }
    
    public Mail receiveMail(){
        Mail mail = new Mail(name);
        return mail;
    }
    
    public boolean initSend(){
        return initMail;
    }
    public String getName(){
        return name;
    }
}
