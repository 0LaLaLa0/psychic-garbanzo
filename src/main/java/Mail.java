/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kaysere
 */
public class Mail {
    //TODO
    public static Mail getInitMail(String name){
        return new Mail(name);
    }
    
    public static Mail getFollowUpMail(String name){
        return new Mail(name);
    }
    
    public Mail(String name){
        
    }
}
