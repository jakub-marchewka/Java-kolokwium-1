package com.company;

public class Obligacje extends PapieryWartosciowe {
    private double oprocentowanie;

    public Obligacje(float wartosc, int id,double oprocentowanie) {
        super(wartosc, id);
        this.oprocentowanie=oprocentowanie;
    }

    @Override
    public void step() {
        this.setWartosc(this.getWartosc()+(this.getWartosc()*(oprocentowanie/100)));
    }
}
