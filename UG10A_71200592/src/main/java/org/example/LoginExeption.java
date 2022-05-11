package org.example;

import jdk.jpackage.internal.Log;

public class LoginExeption {
    private String rorMessage;
    public LoginExeption(){
        super("Maaf, username atau password salah!, silahkan coba lagi");
    }
    public LoginExeption(String errorMessage){
        super(errorMessage);
    }

    public String getRorMessage() {
        return rorMessage;
    }

    public void setRorMessage(String rorMessage) {
        this.rorMessage = rorMessage;
    }
}
