public class ExemploRecursao {

    public static void contagemRegressiva(int n) {
        for (int i = n; i >= 0 ; i--) {
            System.out.println(i);
        }
    }

    public static void contagemRegressivaRecursiva(int n) {
        if (n == 0)
            System.out.println(n);
        else {
            System.out.println(n);
            contagemRegressivaRecursiva(n-1);
        }
    }

    public static void main(String[] args) {
        contagemRegressiva(5);
        contagemRegressivaRecursiva(5);
    }
}
