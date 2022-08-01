package co.com.tyba.reto.advantageonlineshopping.utils;

public enum Excepcion {
    MENSAJE_ERRADO("No obtuvo el mensaje esperado"),
    MENSAJE_NO_FUE_ENVIADO("mensaje no fue enviado"),
    USUARIO_NO_ENCONTRADO("No encontro registros del usuario ingresado"),
    NO_CREO_USUARIO("No se creo el usuario");

    String mensaje;

    Excepcion(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}