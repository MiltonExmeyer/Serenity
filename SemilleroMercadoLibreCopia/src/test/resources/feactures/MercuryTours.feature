# language: es

Característica: Realizar registro en Mercury Tours
  como un nuevo usuario
  quiero ingresar a la pagina web https://demo.guru99.com/selenium/newtours/
  para tener mi propia cuenta


  @EscenarioCrearCuentaFormulario
    Escenario: crear cuenta de usuario nuevo
      Dado que un usuario ingrese a la pagina web he ingrese a register
      Cuando ingrese sus datos Milton, guzman, 123456789, jajaja@gmail.com, dg 147 # 24-56, Bogota, Suba, 111151, COLOMBIA, user@gmail.com, periferia y periferia
      Entonces el usuario se encuentra registrado

