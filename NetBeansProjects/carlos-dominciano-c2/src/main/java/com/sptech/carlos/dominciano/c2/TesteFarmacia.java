package com.sptech.carlos.dominciano.c2;

public class TesteFarmacia {

    public static void main(String[] args) {
        Medicamento m1 = new Medicamento(1, "Dorflex");
        Medicamento m2 = new Medicamento(2, "Dipirona");
        Farmacia farm = new Farmacia("Mundial do Palmeiras");

        System.out.println(m1 + "\n" + m2);
        
        farm.realizarVenda(m1, 100.0);
        
        farm.cadastrarEstoque(m2, 50);
        farm.cadastrarEstoque(m1, 50);
        
        farm.realizarVenda(m1, 100.0);
        farm.realizarVenda(m1, 100.0, 11.9);
        farm.realizarVenda(m2, 200.0, 55.2);
        
        System.out.println(m1 + "\n" + m2  + "\n" + farm);
        

        
       
    }

}

