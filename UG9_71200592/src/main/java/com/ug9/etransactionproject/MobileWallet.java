package com.ug9.etransactionproject;

public class MobileWallet extends DigitalPayment {
    private String noHP;
    private long feeTransferBank;

    public MobileWallet(String nama, long saldo, String noHP) {
        super(nama,saldo);
        this.noHP = noHP;
    }

    public void setFeeTransferBank(long feeTransferBank) {
        this.feeTransferBank = feeTransferBank;
    }

    public String getNoHP() {
        return noHP;
    }

    public void transfer(DigitalPayment dp, long nominal){
        if(this.getsaldo()<0){
            System.out.println("Transfer gagal, input tidak valid");
        }
        else if(dp instanceof BNImo || dp instanceof BRImo){
            this.setsaldo(getsaldo()-(nominal+feeTransferBank));
            dp.setsaldo(getsaldo()+nominal);
            printBuktiTransfer(dp, nominal);
        }
        else if(this.getsaldo()<nominal){
            System.out.println("Transfer gagal, saldo anda tidak mencukupi");
        }
    }

}
