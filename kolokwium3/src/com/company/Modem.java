package com.company;

public class Modem {
    private ReadDevice readLine;
    private WriteDevice writeLine;
    private int isMess;

    public void setReadLine(ReadDevice readLine) {
        this.readLine = readLine;
    }

    public void setWriteLine(WriteDevice writeLine) {
        this.writeLine = writeLine;
    }

    public void setIsMess() {
        this.isMess = 1;
    }
    private void readMessage()
    {

        System.out.println(this.readLine.read());
    }
    public void connect(Modem x)
    {
        Line a=new Line(this,x);
        Line b=new Line(x,this);
        this.setReadLine(b);
        this.setWriteLine(a);
        x.setReadLine(a);
        x.setWriteLine(b);

    }
    public void writeMessage(String napis)
    {
        writeLine.write(napis);
    }
    public void call()
    {

        this.readMessage();
    }
}
