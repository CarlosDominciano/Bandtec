package Jogo;


import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;

public class TelaJFrame extends Canvas implements Runnable{
    
    public static JFrame frame;
    
    public static int w = 240;
    public static int h = 160;
    public static int s = 3;

    public TelaJFrame() {
        this.setPreferredSize(new Dimension(w*s, h*s));
        frame = new JFrame("Game 02");
        frame.add(this);
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        TelaJFrame jogo = new TelaJFrame();
    }
    
    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
