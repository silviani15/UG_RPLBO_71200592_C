package com.ug6.soal1;

import java.util.ArrayList;

public class VendingMachines {
    private int code;
    private int capacity;
    private int usedCapacity;
    private ArrayList<Goods> goods;
    private ArrayList<Double> acceptanceBalance;
    private Double consumerMoney;

    public VendingMachines(){}
    public VendingMachines (int code, int capacity) {
        this.code = code;
        this.capacity = capacity;
    }
    public VendingMachines(int code, int capacity, Goods goods, Double[] accpetanceBalance){
        this.code = code;
        this.capacity = capacity;
    }
    public void proceedOrder(String goodsCode, int orderQuantity){
    }
    public void takeMoney(Double money){
    }
    public void giveGood(Double goodPrice, String goodName){
    }
    public Double withdrawMoney{
    }
    public void inputGoods(Goods goods)
}
