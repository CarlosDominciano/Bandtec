package sptech.projetojpadtoquery;

import sptech.projetojpadtoquery.dominio.Motorista;

import java.util.Optional;
import java.util.Scanner;

public class AppOptional {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Long num = leitor.nextLong();
        System.out.println(num);
//        (long) (Math.log(10_000_000_000L)/Math.log(2))+1
        Optional<Motorista> optMotorista = Optional.of(new Motorista());
        if (optMotorista.isPresent()) {
            System.out.println(optMotorista.get());
        } else {
            System.out.println("Sem motorista!");
        }
        /*Motorista m = null; // peguei de uma API ou biblioteca etc
        System.out.println(m.getNome());*/
    }
}
