package com.bandtec.projeto.lista.desafio;

import java.util.ArrayList;
import java.util.List;

public class ListaUtil {

    private List<Integer> inteiros;

    public ListaUtil() {
        this.inteiros = new ArrayList<>();
    }

    public void add(Integer valor) {
        if (valor != null) {
            inteiros.add(valor);
        }
    }

    public void remove(Integer valor) {
        for (int i = 0; i < inteiros.size(); i++) {
            if (inteiros.get(i).equals(valor)) {
                inteiros.remove(i);
            }
        }
    }

    public Integer count() {
        return inteiros.size();
    }

    public Integer countPares() {
        Integer contador = 0;
        for (int i = 0; i < inteiros.size(); i++) {
            if (inteiros.get(i) % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }

    public Integer countImpares() {
        Integer contador = 0;
        for (int i = 0; i < inteiros.size(); i++) {
            if (inteiros.get(i) % 2 == 1) {
                contador++;
            }
        }
        return contador;
    }

    public Integer somar() {
        Integer soma = 0;
        for (int i = 0; i < inteiros.size(); i++) {
            soma += inteiros.get(i);

        }
        return soma;
    }

    public Integer getMaior() {
        Integer maior = Integer.MIN_VALUE;
        if (!inteiros.isEmpty()) {

            for (int i = 0; i < inteiros.size(); i++) {
                if (inteiros.get(i) > maior) {
                    maior = inteiros.get(i);
                }
            }

            return maior;

        } else {

            return 0;

        }
    }

    public Integer getMenor() {
        Integer menor = Integer.MAX_VALUE;
        if (!inteiros.isEmpty()) {
            for (int i = 0; i < inteiros.size(); i++) {
                if (inteiros.get(i) < menor) {
                    menor = inteiros.get(i);
                }
            }
            return menor;
        } else {
            return 0;
        }
    }

    public Boolean hasDuplicidade() {
        Integer c;
        for (int i = 0; i < inteiros.size(); i++) {
            c = 0;
            for (int j = 0; j < inteiros.size(); j++) {
                if (inteiros.get(i).equals(inteiros.get(j))) {
                    c++;
                    if (c == 2) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    @Override
    public String toString() {
        return "ListaUtil{" + "inteiros: " + inteiros + '}';
    }

}
