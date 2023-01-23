package sptech;

public class ListaEstaticaOrdenada extends ListaEstatica{

    public ListaEstaticaOrdenada(int length) {
        super(length);
    }

    @Override
    public void adiciona(int elemNovo) {
        if(qtdElem != vetor.length){
            int posInser = qtdElem;
            for (int i = 0; i < qtdElem; i++) {
                if(elemNovo < vetor[i]){
                    posInser = i;
                    for(int j = qtdElem; j > i; j--){
                        vetor[j] = vetor[j-1];
                    }
                    vetor[posInser] = elemNovo;
                    qtdElem++;
                    return;
                }
            }
            vetor[posInser] = elemNovo;
            qtdElem++;

        }else{
            System.out.println("Lista Cheia");
        }
    }

}
