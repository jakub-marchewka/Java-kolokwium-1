package com.company;

public class Portfel {
    private PapieryWartosciowe[] list;
    public Portfel(PapieryWartosciowe []list)
    {
        this.list=list;
    }
    public void step()
    {
        for(int i=0;i<list.length;i++)
        {
            list[i].step();
        }
    }
    public double sum()
    {
        double suma=0;
        for(int i=0;i<list.length;i++)
        {
            suma=suma+list[i].getWartosc();
        }
        return suma;
    }
}
