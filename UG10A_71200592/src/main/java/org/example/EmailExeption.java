package org.example;

public class EmailExeption extends Exception {
    private String rorMassage;
    public EmailExeption(){
        super();
        this.rorMassage="Maaf, email tidak valid!";
    }
    public EmailExeption(String errorMassage){
        super(errorMassage);
    }

    public String getRorMassage() {
        return rorMassage;
    }
}
s