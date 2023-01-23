/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.meu.jogo.meuJogo.modelo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author carlos.dominciano@VALEMOBI.CORP
 */
public class Fase extends JPanel implements ActionListener {
    
    private Image fundo;
    private Player player;
    private PlayerTwo playerTwo;
    private Timer timer;
    
    
    public Fase() {
        
        setFocusable(true);
        setDoubleBuffered(true);
        
        ImageIcon referencia = new ImageIcon();
        fundo = referencia.getImage();

        player = new Player();
        player.load();
        
        playerTwo = new PlayerTwo();
        playerTwo.load();
        
        addKeyListener(new TecladoAdapter());
        
        timer = new Timer(5, this);
        timer.start();
    }
    
    public void paint(Graphics g) {
        Graphics2D graficos = (Graphics2D) g;
        graficos.drawImage(fundo, 0, 0, null );
        graficos.drawImage(player.getImagem(), player.getX(),
        player.getY(), null);
        
        graficos.drawImage(playerTwo.getImagem(), playerTwo.getX(),
        playerTwo.getY(), null);
        g.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        player.update();
        repaint();
       playerTwo.update();
       repaint();
    }
    
    private class TecladoAdapter extends KeyAdapter {
        
        @Override
        public void keyPressed(KeyEvent e) {
                player.keyPressed(e);
                playerTwo.keyPressed(e);
            
        }
        
        @Override
        public void keyReleased(KeyEvent e) {
            player.keyRelease(e);
            playerTwo.keyRelease(e);
        }
    }
    
}
