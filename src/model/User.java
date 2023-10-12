/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author bellarao
 */
public class User {
    private String firstLabel;
    private String lastLabel;
    private String ageLabel;
    private String emailaddressLabel;
    private String messageLabel;
    private String typeLabel;
    private String genderLabel;
    private boolean isEmpty;
    public boolean isEmpty(){
    
       return isEmpty; 
       
    }
    public String getfirstLabel() {
        return firstLabel;
    }
    
    public void setfirstLabel(String firstLabel) {
        this.isEmpty = false;
        this.firstLabel = firstLabel;
    }
    
    public String getlastLabel() {
        return lastLabel;
    }
    
    public void setlastLabel(String  lastLabel) {
        this.isEmpty = false;
        this.lastLabel = lastLabel;
    }
    
    public String getageLabel(){
        return ageLabel;
    }
    
    public void setageLabel(String ageLabel){
        this.isEmpty = false;
        this.ageLabel = ageLabel;
    }
    
    public String getemailaddressLabel(){
        return emailaddressLabel;
    }
    
    public void setemailaddressLabel(String emailaddressLabel){
        this.isEmpty = false;
        this.emailaddressLabel = emailaddressLabel;
    }
    
    public String getmessageLabel(){
        return messageLabel;
    }
    
    public void setmessageLabel(String messageLabel){
        this.isEmpty = false;
        this.messageLabel = messageLabel;
    }
    
    public String gettypeLabel(){
        return typeLabel;
    }
    
    public void settypeLabel(String typeLabel){
        this.isEmpty = false;
        this.typeLabel = typeLabel;
    }
    
    public String getgenderLabel(){
        return genderLabel;
    }
    
    public void setgenderLabel(String genderLabel){
        this.isEmpty = false;
        this.genderLabel = genderLabel;
    }
}
