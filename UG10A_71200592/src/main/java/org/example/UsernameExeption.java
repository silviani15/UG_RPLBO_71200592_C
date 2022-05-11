package org.example;

public class UsernameExeption extends Exception {
    private int rorCode;
    private String rorMassage;
    public UsernameExeption(){
        super();
        this.rorCode = rorCode;
        if (rorCode==1){
           this.rorMassage="username tidak boleh kosong ya!";
        }
    }
}
