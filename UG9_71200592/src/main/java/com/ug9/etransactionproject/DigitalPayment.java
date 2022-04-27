package com.ug9.etransactionproject;

public abstract class DigitalPayment {
    private String nama;
    private long saldo;

    public DigitalPayment(String nama, long saldo) {
        this.nama = nama;
        this.saldo = saldo;
    }

    public String getnama() {
        return nama;
    }

    public long getsaldo() {
        return saldo;
    }

    public void setsaldo(long saldo) {
        this.saldo = saldo;
    }

    public abstract void transfer(DigitalPayment dp, long nominal);

    public void printBuktiTransfer(DigitalPayment penerima,long nominal){
        if (penerima instanceof BNImo){
            System.out.print("Transfer ke BNI Mobile");
        } else if (penerima instanceof BRImo){
            System.out.print("Transfer ke BRI Mobile");
        } else if (penerima instanceof Dana){
            System.out.print("Transfer ke DANA");
        } else if (penerima instanceof Ovo){
            System.out.print("Transfer ke OVO");
        }
        System.out.println(" atas nama "+penerima.nama+" sebesar Rp "+nominal+" sukses");
    }
}
