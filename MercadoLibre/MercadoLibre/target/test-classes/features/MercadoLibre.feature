# language: es

  Característica: Crear cuenta como un nuevo cliente
  quiero ingresar a la pagina www.mercadolibre.com.co para crear
  cuenta


    Esquema del escenario: crear cuenta en mercado libre
      Dado que un cliente accede a la web y pueda crear una cuenta
      Cuando el agregar su correo para validar
      |<nombreCorreo>|
      Entonces el valida su correo y acepta terminos

      Ejemplos:
      |nombreCorreo|
      |jessicacovilla@gmail.com|

