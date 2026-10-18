package es.evaluacion;
public class S05Ejercicio09 {

    /**
     * Método entregado por el alumno con las 3 trampas:
     * 1. Trampa de Tipo: Recibe un double en lugar de un int/long.
     * 2. Trampa de Lógica (Negativos): Bucle 'while (n > 10)' no procesa valores negativos.
     * 3. Trampa de Frontera (10): El valor 10 no entra en 'n > 10'
     */
    public static int contarDigitos(double numero) {
        double n = numero;
        int numeroDeDigitos = 1;

        while (n > 10) { 
            n /= 10;
            numeroDeDigitos++;
        }

        return numeroDeDigitos;
    }
}
