package Curs7;

public class Main {
    public static void main(String[] args) {
        System.out.println(3==3.1);
        Animal Chat = new Animal();
        Animal chien = new Animal();
        Animal geraffe = chien ;
        Animal poussin = new Animal();
        Animal poulet = poussin;

        System.out.println(poulet == poussin);
        System.out.println(poulet == geraffe);

    }
}

