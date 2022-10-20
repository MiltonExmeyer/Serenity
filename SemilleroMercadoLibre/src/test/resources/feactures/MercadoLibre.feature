# language: es

Característica: Crear cuenta nueva
  como un nuevo usuario
  quiero ingresar a la pagina www.mercadolibre.com.co
  para tener mi propia cuenta


  @EscenarioCrearCuenta
    Escenario: crear cuenta de usuario nuevo
      Dado que un usuario ingrese a la pagina web
      Cuando ingresa a crear tu cuenta
      Entonces tiene la opcion de ingresar email correoPrueba@gamil.com

  @EscenarioComprarProducto
  Escenario: ingresar a la pagina web y comprar algun producto
    Dado que un usuario ingrese a la pagina web elegida
    Cuando busque un teclado he ingrese jajejijoju@gmail.com
    Entonces podra ralizar la compra

