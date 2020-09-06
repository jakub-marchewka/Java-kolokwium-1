package com.company;

import java.util.Random;

public class Akcje extends PapieryWartosciowe {

    public Akcje(float wartosc, int id) {
        super(wartosc, id);
    }

    @Override
    public void step() {
        Random generator = new Random();
        int liczba=generator.nextInt(2);
        if(liczba==1)
        {
            this.setWartosc(this.getWartosc()*1.1);
        }
        else
        {
            this.setWartosc(this.getWartosc()*0.9);
        }
    }
}
