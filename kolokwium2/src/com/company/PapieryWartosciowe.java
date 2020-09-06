package com.company;

public abstract class PapieryWartosciowe {
    private float wartosc;
    private int id;

    public float getWartosc() {
        return wartosc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWartosc(double wartosc) {
        this.wartosc = (float)wartosc;
    }
    public PapieryWartosciowe(float wartosc,int id)
    {
        this.id=id;
        this.wartosc=wartosc;
    }
    public abstract void step();

}
