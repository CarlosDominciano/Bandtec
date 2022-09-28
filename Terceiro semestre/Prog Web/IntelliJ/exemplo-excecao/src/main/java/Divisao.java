import javax.swing.*;

public class Divisao {

    public static void main(String[] args) {
        String snum1, snum2;

        snum1 = JOptionPane.showInputDialog("Digita um numero corno: ");
        snum2 = JOptionPane.showInputDialog("Digita um numero corno: ");



        try {
            int num1 = Integer.parseInt(snum1, 10);
            int num2 = Integer.parseInt(snum2, 10);

            JOptionPane.showMessageDialog(null, num1 / num2);
        }
        catch (ArithmeticException erro) {
            JOptionPane.showMessageDialog(null,
                    "Divida direito!!\n" + erro,
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);

        }
        catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null,
                    "Digite apenas numeros!!\n" + erro,
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);

        }


        System.exit(0);

    }
}
