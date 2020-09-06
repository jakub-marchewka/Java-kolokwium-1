package com.company;

public class Klasa {
    private String pole;
    public Klasa(String pole)
    {
        this.pole=pole;
    }
    public void funkcja1(char a,char b)
    {
        String[] splitedArray = null;
        String out = "";
        splitedArray = this.pole.split(" ");
        for (int i = 0 ; i < splitedArray.length ; i++) {
            if((Character.toUpperCase(splitedArray[i].charAt(0))==Character.toUpperCase(a)&&(Character.toUpperCase(splitedArray[i].charAt(splitedArray[i].length()-1))==Character.toUpperCase(b))))
            {
                char[] tab = splitedArray[i].toCharArray();
                for(int j=1;j<tab.length-1;j++)
                {
                    tab[j]='*';
                }
                splitedArray[i]=new String(tab);
            }

        }

        for(int i=0;i<splitedArray.length;i++)
        {
            out=out+" "+splitedArray[i];
        }
        System.out.println(out);
    }
    public void funkcja2()
    {
        String[] splitedArray = null;
        String out = "";
        splitedArray = this.pole.split(" ");
        for (int i = 0 ; i < splitedArray.length ; i++) {

                char[] tab = splitedArray[i].toCharArray();
                tab[0]= Character.toUpperCase(tab[0]);
                tab[tab.length-1]= Character.toUpperCase(tab[tab.length-1]);
                splitedArray[i]=new String(tab);


        }

        for(int i=0;i<splitedArray.length;i++)
        {
            out=out+" "+splitedArray[i];
        }
        System.out.println(out);
    }
}
