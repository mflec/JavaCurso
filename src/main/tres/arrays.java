public class MyClass {
    public static void main(String args[]) {
        // 1. Utilizando solo tipos primitivos, String (solo usar método length),
        // vectores, iteraciones simples y condicionales, genere una clase por ejercicio
        // que posea
        // los siguientes métodos:
        // a. Dado un String y una letra, que cuente la cantidad de apariciones de la
        // letra en el String
        String palabra = "Pablito tenia un clavi";
        String letra = "a";

        System.out.println(palabra.contains(letra));

        // b. Dados 3 números y un orden (ascendente o decreciente) que ordene los
        // mismos y los retorne en un vector de 3
        int numeros[] = { 7, 2, 3 };
        int acumulador = 0;
        String orden = "descendiente";

        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (orden == "ascendente") {
                    if (numeros[i] > numeros[j]) {
                        acumulador = numeros[i];
                        numeros[i] = numeros[j];
                        numeros[j] = acumulador;
                    }
                } else {

                    if (numeros[i] < numeros[j]) {
                        acumulador = numeros[i];
                        numeros[i] = numeros[j];
                        numeros[j] = acumulador;
                    }
                    ;
                }
                ;
            }
            ;
        }
        ;

        System.out.println("Ordenado de forma " + orden);
        for (int num : numeros) {
            System.out.println(num);
        }

        // c. dado un vector de números, y un número X, que sume todos los números > X y
        // retorne el

        int numeros1[] = { 7, 4, 2, 3 };
        int acumulador1 = 0;

        for (int num : numeros1) {
            acumulador1 = acumulador1 + num;
        }
        ;

        System.out.println("La suma de los valores del Array es: " + acumulador1);

        // 2. Genere una clase que tenga los métodos para realizar la codificación y
        // decodificación
        // de un string, dado un número de desplazamiento.
        // ● Por ejemplo, con desplazo de 1:
        // “hola que tal” -> “ipmbarvfaubm”
        // h -> i
        // o -> p
        // ● con desplazo de 2
        // “hola que tal” -> “jqncbswgbvcn”
        // h -> j
        // o -> q

        String stringACodificar = "hola que tal";
        String arrayDeStrings[] = stringACodificar.split("");

        String abecedario = "abcdefghijklmnñopqrstuvwxyz";
        int posicionDeDesplazo = 2;

        String codificado = "";

        for (int i = 0; i < arrayDeStrings.length; i++) {
            String temporal = arrayDeStrings[i];
            if (!temporal.equals(" ")) {
                int posicionEnAbecedario = abecedario.indexOf(temporal);
                String nuevaLetra = String.valueOf(abecedario.charAt(posicionEnAbecedario + posicionDeDesplazo));

                codificado = codificado + nuevaLetra;
            }
        }

        System.out.println(codificado);
    }
}