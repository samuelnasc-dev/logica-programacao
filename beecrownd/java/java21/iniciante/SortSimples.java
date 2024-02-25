import java.util.Scanner;

public class SortSimples {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num, i = 0, aux;

        int[] numeros = new int[3];
        int[] newNumeros = new int[3];

        while (i < numeros.length) {
            num = ler.nextInt();
            numeros[i] = num;
            newNumeros[i] = num;
            // System.out.println(numeros[i]);
            i++;
        }

        i = 0;

        for (int a = 0; a < newNumeros.length - 1; a++) {
            for (int b = 1; b < newNumeros.length; b++) {
                if (newNumeros[a] > newNumeros[b]) {
                    aux = newNumeros[a];
                    newNumeros[a] = newNumeros[b];
                    newNumeros[b] = aux;
                }
            }
        }

        for (int c = 0; c < numeros.length; c++) {
            System.out.println(newNumeros[c]);
        }
        System.out.println();

        for (int d = 0; d < numeros.length; d++) {
            System.out.println(numeros[d]);
        }

        ler.close();
    }
}
