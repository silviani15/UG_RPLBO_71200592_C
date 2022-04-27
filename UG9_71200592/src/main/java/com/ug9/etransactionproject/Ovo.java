package com.ug9.etransactionproject;

public class Ovo extends MobileWallet{
    public Ovo(String nama, long saldo, String noHp){
        super(nama, saldo, noHp);
    }

    private final long ovoFeeTransferBank = 2000;

    public void transfer(DigitalPayment dp, long nominal){
        this.setFeeTransferBank(this.ovoFeeTransferBank);
        if(dp instanceof Dana){
            super.transfer(dp, nominal);
        }
        else{
            System.out.println("Transfer gagal, akun OVO tidak valid");
        }
    }
}
