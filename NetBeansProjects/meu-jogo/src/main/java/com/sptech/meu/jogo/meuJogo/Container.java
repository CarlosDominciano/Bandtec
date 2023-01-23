package com.sptech.meu.jogo.meuJogo;

import com.sptech.meu.jogo.meuJogo.modelo.Fase;
import javax.swing.JFrame;

public class Container extends JFrame {
    
    public Container() { //Construtor sempre começa com public e tem
        //o mesmo nome da classe
        
        add(new Fase()); //Adiciono o Objeto fase para dentro do Conatiner
        setTitle("ShipBattle"); //Titulo da aba aberta
        // setExtendedState(MAXIMIZED_BOTH); // Faz a tela começar em FullScreen
        setSize(1024, 720); //Tamanho da aba a ser aberta inicialmente
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Fechar o programa quando fechar a janela
        setLocationRelativeTo(null); //Local onde a tela vai aparecer inicialmente, no caso aqui ela aparece no meio
        this.setResizable(false);// Se a tela pode ser redimencionada ao gosto do usuário
        setVisible(true); //Se tudo setado acima será visivel
    }

    public static void main(String[] args) {
        new Container(); //Crio um novo objeto contendo tudo dentro da classe container
    }
}