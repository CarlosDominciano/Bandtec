import javax.swing.*;

public class DivisaoLoop {

    public static void main(String[] args) {
        String snum1, snum2;
        boolean fim = false;

        while (!fim) {

            snum1 = JOptionPane.showInputDialog("Digita um numero corno: ");
            snum2 = JOptionPane.showInputDialog("Digita um numero corno: ");

            try {
                int num1 = Integer.parseInt(snum1, 5);
                int num2 = Integer.parseInt(snum2, 5);

                JOptionPane.showMessageDialog(null, (double)num1 / num2);
                fim = true;
            } catch (ArithmeticException erro) {
                JOptionPane.showMessageDialog(null,
                        "Divida direito!!\n" + erro,
                        "Erro",
                        JOptionPane.ERROR_MESSAGE);

            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null,
                        "Digite apenas numeros!!\n" + erro,
                        "Erro",
                        JOptionPane.ERROR_MESSAGE);

            }
        }
    }
}
