package com.company;

public class Main {

    public static void main(String[] args) {
        Obligacje o=new Obligacje(100,1,5);
        Akcje a=new Akcje(100,2);
        PapieryWartosciowe []p={a,o};
        Portfel po=new Portfel(p);
        po.step();

        System.out.println(po.sum());

        }
    }

