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
public class PlayerTwo {
    private int x,y;
    private int dx, dy;
    private Image imagem;
    private int altura, largura;
    
    
    
    public PlayerTwo() {
        this.x = 100;
        this.y = 100;
        
    }
    
    public void load() {
        ImageIcon referencia = new ImageIcon("res//ship2.png");
        imagem = referencia.getImage();
        altura = imagem.getHeight(null);
        largura = imagem.getWidth(null);
    }
    
    public void update() {
        x += dx;
        y += dy;
    }
    
    public void keyPressed(KeyEvent tecla) {
        int codigo = tecla.getKeyCode();
        
        if (codigo == KeyEvent.VK_W) {
            dy = -1;
        }
        if (codigo == KeyEvent.VK_S) {
            dy = 1;
        }
        if (codigo == KeyEvent.VK_D) {
            dx = 1;
        }
        if (codigo == KeyEvent.VK_A) {
            dx = -1;
        }
    }
    
     public void keyRelease(KeyEvent tecla) {
        int codigo = tecla.getKeyCode();
        
        if (codigo == KeyEvent.VK_W) {
            dy = 0;
        }
        if (codigo == KeyEvent.VK_S) {
            dy = 0;
        }
        if (codigo == KeyEvent.VK_D) {
            dx = 0;
        }
        if (codigo == KeyEvent.VK_A) {
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
