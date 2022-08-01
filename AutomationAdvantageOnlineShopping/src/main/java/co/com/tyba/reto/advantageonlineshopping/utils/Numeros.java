package co.com.tyba.reto.advantageonlineshopping.utils;

public enum Numeros {
    CERO(0),
    SESENTA(60);

    int numero;

    Numeros(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
}