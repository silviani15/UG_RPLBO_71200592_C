package com.ug9.etransactionproject;

public class Dana extends MobileWallet {
    public Dana(String nama, long saldo, String noHp) {
        super(nama, saldo, noHp);
    }

    private final long danaFeeTransferBank = 1000;

    public void transfer(DigitalPayment dp, long nominal) {
        this.setFeeTransferBank(this.danaFeeTransferBank);
        if (dp instanceof Ovo) {
            super.transfer(dp, nominal);
        } else {
            System.out.println("Transfer gagal, akun DANA tidak valid");
        }
    }
}


