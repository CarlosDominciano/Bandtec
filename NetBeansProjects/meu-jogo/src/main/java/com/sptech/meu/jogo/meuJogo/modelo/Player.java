/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.meu.jogo.meuJogo.modelo;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class Player {
    private int x,y;
    private int dx, dy;
    private Image imagem;
    private int altura, largura;
    
    
    
    public Player() {
        this.x = 100;
        this.y = 300;
        
    }
    
    public void load() {
        ImageIcon referencia = new ImageIcon("res//ship.png");
        imagem = referencia.getImage();
        altura = imagem.getHeight(null);
        largura = imagem.getWidth(null);
    }
    
    public void update() {
        x += dx;
        y += dy;
    }
    
    public void keyPressed(KeyEvent tecla){
        int codigo = tecla.getKeyCode();
        
        if (codigo == KeyEvent.VK_UP) {
            dy = -3;
        }
        if (codigo == KeyEvent.VK_DOWN) {
            dy = 3;
        }
        if (codigo == KeyEvent.VK_RIGHT) {
            dx = 3;
        }
        if (codigo == KeyEvent.VK_LEFT) {
            dx = -3;
        }
    }
    
     public void keyRelease(KeyEvent tecla) {
        int codigo = tecla.getKeyCode();
        
        if (codigo == KeyEvent.VK_UP) {
            dy = 0;
        }
        if (codigo == KeyEvent.VK_DOWN) {
            dy = 0;
        }
        if (codigo == KeyEvent.VK_RIGHT) {
            dx = 0;
        }
        if (codigo == KeyEvent.VK_LEFT) {
            dx = 0;
        }
     }    

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImagem() {
        return imagem;
    }
     
     
     
}
