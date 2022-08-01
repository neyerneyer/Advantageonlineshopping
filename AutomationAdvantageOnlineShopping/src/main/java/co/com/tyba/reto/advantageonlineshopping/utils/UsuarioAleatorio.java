package co.com.tyba.reto.advantageonlineshopping.utils;

import java.util.Random;

public class UsuarioAleatorio {

    /**
     * Este metodo genera usuarios. El proceso es aleatorio. Cada vez
     * que se corra el programa mostrara usuarios diferentes.
     *
     * @return un arreglo de String con los nombres y apellidos generados. El
     * formato de salida es: user+numero
     */
    public static String generarUsuarioAleatorio() {
        String usuarioAleatorio = null;

        String[] nombres = {"Rosa", "Maria", "Brandon", "Cindy", "David", "Pepe", "Brayan", "Juan",
                "Brenda", "Luis", "Rafaela", "Andres", "Andrea", "Felipe", "Rogelio", "Duban", "Adriana",
                "Catalina", "Karina", "Emilio"};

        for (int i = 0; i < 1; i++) {
            usuarioAleatorio = nombres[(int) (Math.floor(Math.random() * ((nombres.length - 1) + 1)))]
                    + generarNumero();
        }
        return usuarioAleatorio;
    }

    /**
     * Genera un numero entre 1 y 99
     */
    private static int generarNumero() {
        Random r = new Random();
        return r.nextInt(98) + 1;
    }
}