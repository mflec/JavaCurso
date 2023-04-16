class Main {
    public static void main(String[] args) {
        // 1. Vamos a practicar operaciones básicas con números
        // a. Utilizando la sentencia while, imprima todos los números entre 2 variables
        // “a”
        // y “b”. Su código puede arrancar
        int numeroInicio = 5;
        int numeroFin = 14;
        int numeroVariable = numeroInicio;

        while (numeroVariable <= numeroFin) {
        System.out.println(numeroVariable);
        numeroVariable = (numeroVariable + 1);
        }

        // b. A lo anterior, solo muestre los números pares
        while (numeroVariable <= numeroFin) {
        if ((numeroVariable % 2) == 0) {
        System.out.println(numeroVariable);
        }
        ;
        numeroVariable = (numeroVariable + 1);
        }

        // c. A lo anterior, con una variable extra, elija si se deben mostrar los
        // números pares o impares

        boolean esPar = (numeroVariable % 2) == 0;
        boolean esImpar = (numeroVariable % 2) != 0;
        while (numeroVariable <= numeroFin) {
        if (esPar) {
        System.out.println(numeroVariable);
        }
        ;
        numeroVariable = (numeroVariable + 1);
        }

        // d. Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el
        // orden

        for (int otroNum = 14; otroNum > 4; otroNum--) {
        System.out.println(otroNum);
        }

        // a. Lea atentamente el texto, primero que nada piense cuáles son las variables
        // de entrada.
        // Las variables de entradas son: ingresosMensuales(float),
        // cantidadDeVehiculosConAntiguedadMenorA5Anios(int),
        // cantidadDeInmuebles(int), posesionDeActivos (bool)

        // d. Finalmente, vea si puede resolver el problema utilizando código Java. Por
        // ejemplo si estuviésemos intentando resolver el ejemplo de monotributo
        // tendríamos el código que se muestra más abajo, y cambiando las variables

        float ingresosMensuales = 299000;
        int cantidadDeVehiculosConAntiguedadMenorA5Anios = 2;
        int cantidadDeInmuebles = 2;
        boolean posesionDeActivos = true;

        /*********************************************/
        if ((ingresosMensuales >= 489083) &&
                (cantidadDeVehiculosConAntiguedadMenorA5Anios >= 3) &&
                (cantidadDeInmuebles >= 3) && posesionDeActivos) {
            System.out.println("Pertenece a Ingresos altos");
        } else {
            System.out.println("No pertenece a Ingresos altos");
        }

    }
}