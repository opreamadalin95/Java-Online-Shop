package com.itfactory;

public class Produs {

    private String nume;
    private double pret;
    private int discount;
    private int cantitate;
    private double pretfinal;

    public Produs(String nume, double pret, int discount, int cantitate) {
        this.nume = nume;
        this.pret = pret;
        this.discount = discount;
        this.cantitate = cantitate;
    }


    public int getDiscount() {
        return discount;
    }

    public void setQuantity(int cantitate) {
        this.cantitate = cantitate;
    }

    public int getQuantity() {
        return cantitate;
    }

    public double DiscountPrice() {
        double discountprodus = pret * (100 - discount) / 100;
        return discountprodus;
    }

    public double getFinalPrice() {
        return pretfinal = pret * (100 - getDiscount()) / 100 * cantitate;

    }
    public double getPrice () {
        return pret;

    }
}
