#language:es
@e2e
Característica: Verifique las funcionalidades de la página advantage shopping
  Yo como usuario funcional del sitio web advantage shopping
  Quiero que se apliquen las acciones necesarias
  Para gestionar las funcionalidades: registro de usuario,inicio de sesión de usuario, registro de formulario de contacto y adición de cualquier producto de la sección Speaker del portal.

  @CrearUsuario
  Escenario: registro de usuario
    Dado "brandon" necesita ingresar a la pagina advantage shopping para registrarse
    Cuando el ingresa la informacion necesaria para crear el registro
    Entonces el verifica que te has registrado en el sistema

  @IniciarSesion
  Escenario: Iniciar sesion
    Dado que "brandon" necesita entrar en la pagina de compras online de advantage
    Cuando el introduce los datos necesarios para iniciar la sesion
      | user     | pass    |
      | bquevedo | Bq12345 |
    Entonces El verifica que ha iniciado la sesion con exito

  @Contactanos
  Escenario: Diligenciar formulario de contacto
    Dado que "brandon" necesita entrar en la pagina advantage onlines hopping para realizar un registro del formulario de contacto
    Cuando El ingresa la informacion necesaria desde el formulario de contacto
      | category | product                         | email                | subject                                                        |
      | Speakers | Bose SoundLink Wireless Speaker | funezneyer@gmail.com | I need more information about the product and payment methods. |
    Entonces el verifica que ha enviado correctamente la informacion con el mensaje "Thank you for contacting Advantage support."

  @RegistrarseYComprar
  Escenario:Registrarse para realizar una compra con mas de un producto
    Dado que "brandon" necesita ingresar al sitio web advantage shopping
    Y se registra en el pagina web advantage shopping
    Cuando el agrega al carrito articulos populares
    Entonces el verifica que el pago se finalizo con el mensaje "ORDER PAYMENT"