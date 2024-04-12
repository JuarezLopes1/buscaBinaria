public class BuscaBinaria {
    // Implementação da busca binária iterativa com for
    public static boolean buscaBinaria(int[] array, int n) {
        int left = 0;
        int right = array.length - 1;

        for (; left <= right;) {
            int mid = left + (right - left) / 2;

            if (array[mid] == n) {
                return true;
            } else if (array[mid] < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

    // Implementação da busca binária recursiva
    public static boolean buscaBinaria(int[] array, int n, int indiceInicio, int indiceFim) {
        if (indiceInicio > indiceFim) {
            return false;
        }

        int mid = indiceInicio + (indiceFim - indiceInicio) / 2;

        if (array[mid] == n) {
            return true;
        } else if (array[mid] < n) {
            return buscaBinaria(array, n, mid + 1, indiceFim);
        } else {
            return buscaBinaria(array, n, indiceInicio, mid - 1);
        }
    }

    // Método main para testar as funções
    public static void main(String[] args) {
        int[] array = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int n = 11;

        // Teste da busca binária iterativa com for
        System.out.println("Busca binária iterativa com for:");
        System.out.println("O número " + n + " está presente no array? " + buscaBinaria(array, n));

        // Teste da busca binária recursiva
        System.out.println("\nBusca binária recursiva:");
        System.out.println(
                "O número " + n + " está presente no array? " + buscaBinaria(array, n, 0, array.length - 1));
    }
}