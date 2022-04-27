package com.ug9.etransactionproject;

public class MobileBanking extends DigitalPayment {
    private boolean checkFee;
    private long feeAntarBank;
    private String noRekening;

    public MobileBanking(String nama, long saldo, String noRekening) {
        super(nama,saldo);
        this.noRekening = noRekening;
    }

    public String getNoRekening() {
        return noRekening;
    }

    public void transfer(DigitalPayment dp, long nominal){
        if(this.getsaldo()<0){
            System.out.println("Transfer gagal, input tidak valid");
        }
        else if(this.isCheckFee()){
            this.setsaldo(getsaldo()-(nominal+feeAntarBank));
            dp.setsaldo(getsaldo()+nominal);
            printBuktiTransfer(dp, nominal);
        }
        else if(this.getsaldo()<nominal){
            System.out.println("Transfer gagal, saldo anda tidak mencukupi");
        }
    }

    public boolean isCheckFee(){
        return this.checkFee;
    }

    public void setCheckFee(boolean checkFee) {
        this.checkFee = checkFee;
    }
}
