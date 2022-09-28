public class SelectionSort {

    public static void main(String[] args) {
        int[] numeros = {9, 5, 3, 7, 3, 1, 2, 4};
        int aux = 0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i] < numeros[j]){
                   aux = numeros[i];
                   numeros[i] = numeros[j];
                   numeros[j] = aux;
                }
            }
        }
        for (int n : numeros){
            System.out.println(n);
        }
    }

}
