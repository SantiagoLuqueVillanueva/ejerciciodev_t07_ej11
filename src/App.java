public class App {
    public static void main(String[] args) throws Exception {
        int[] origin = new int[10];

        System.out.println("Introduzca 10 números separados por INTRO:");

        for (int i = 0; i < origin.length; i++) {
            origin[i] = Integer.parseInt(System.console().readLine());
        }

        System.out.println();
        System.out.println("Array original:");

        int[] indice = new int[10];
        int[] destino = new int[10];

        for (int i = 0; i < indice.length; i++) {
            System.out.print((indice[i] = i)+" ");
        }

        System.out.println();

        for (int i = 0; i < indice.length; i++) {
            System.out.print(origin[i] + " ");
        }

        System.out.println();
        int contador = 0;

        for (int i = 0; i < origin.length; i++) {
            if (esPrimo(origin[i])) {
                destino[contador] = origin[i];
                contador++;
            }
        }

        for (int i = 0; i < origin.length; i++) {
            if (!esPrimo(origin[i])) {
                destino[contador] = origin[i];
                contador++;
            }
        }

        for (int i = 0; i < destino.length; i++) {
            System.out.print(destino[i] + " ");
        }
    }

    private static boolean esPrimo(int num){
        if (num <= 1)
            return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) 
                return false;
        }

        return true;
    }
}
