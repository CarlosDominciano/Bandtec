package sptech;

public class ListaEstatica {
    protected int[] vetor;

    protected int qtdElem;

    public ListaEstatica(int length) {
        vetor = new int[length];
        qtdElem = 0;
    }

    public void adiciona(int elemNovo){
        if (qtdElem != vetor.length){
            vetor[qtdElem++] = elemNovo;
        }
        else{
            System.out.println("Lista cheia");
        }
    }

    public void exibir(){
        for(int i = 0; i < qtdElem; i++){
            System.out.println(vetor[i]);
        }
    }


    public int busca(int elemBusca){
       for (int i = 0; i < qtdElem; i++){
           if (vetor[i] == elemBusca){
               return i;
           }
       }
       return -1;
    }


    public boolean removePeloIndice(int indice){
        if (indice <= vetor.length - 1 && indice >= 0){
            qtdElem--;
            for (int i = indice; i < qtdElem; i++){
                vetor[i] = vetor[i + 1];
            }
            return true;
        }
        return false;
    }

    public boolean removeElemento(int elemBusca){
        int indElemBusca = busca(elemBusca);
        if(indElemBusca >= 0){
                removePeloIndice(indElemBusca);
                return true;
        }
        return false;
    }

    public boolean substitui(int elemAlvo, int elemNovo){
        for (int i = 0; i < this.qtdElem; i++){
            if (vetor[i] == elemAlvo){
                vetor[i] = elemNovo;
                return true;
            }
        }
        System.out.println("Valor não encontrado");
        return false;
    }

    public int contaOcorrencias(int elemAlvo){
        int qtdOcorrencias = 0;
        for(int i = 0; i < qtdElem; i++){
            if(vetor[i] == elemAlvo){
                qtdOcorrencias++;
            }
        }
        return qtdOcorrencias;
    }

    public boolean adicionaNoInicio(int elemNovo){
            if(qtdElem != vetor.length){
                qtdElem++;
                for(int i = qtdElem-1; i > 0; i--){
                    vetor[i] = vetor[i-1];
                }
                vetor[0] = elemNovo;
                return true;
            }
            return false;
    }

}
