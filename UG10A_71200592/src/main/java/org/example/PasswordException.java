package org.example;

public class PasswordException extends Exception {
    private int rorCode;
    private String rorMessage;
    public PasswordException(int rorCode){
        super();
        this.rorCode = rorCode;
        if (rorCode == 1) {
            this.rorMessage="Maaf, password tidak boleh sama dengan username!";
        }else if(rorCode==2) {
            this.rorMessage="Maaf, password minimal 7 karakter!";
        }else if (rorCode==3) {
            this.rorMessage="Maaf, password tidak boleh sama dengan username!";
        }else if (rorCode==4) {
            this.rorMessage = "Maaf, password harus mengandung huruf besar, huruf kecil, simbol, dan angka!";
        }else if (rorCode==5) {
            this.rorMessage = "Maaf, password tidak sama!";
        }
    }
    public PasswordException(String errorMessage){
        super(errorMessage);
    }

    public int getRorCode() {
        return rorCode;
    }

    public String getRorMessage() {
        return rorMessage;
    }
}
