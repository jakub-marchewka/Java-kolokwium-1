package com.company;

public class Line implements ReadDevice,WriteDevice{
    private Modem a;
    private Modem b;
    private String mess;
    public Line(Modem a,Modem b)
    {
        this.a=a;
        this.b=b;
        this.mess=null;
    }
    public Modem getA()
    {
        return this.a;
    }

    public Modem getB() {
        return b;
    }

    public void setA(Modem a) {
        this.a = a;
    }

    public void setB(Modem b) {
        this.b = b;
    }

    @Override
    public String read() {
        return this.mess;
    }

    @Override
    public void write(String s) {
        this.mess=s;
        b.setIsMess();
    }
}
