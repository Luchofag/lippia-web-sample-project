@Login
Feature: As a user of AutomationTesting.in i need to test the register page

Scenario Outline: Login con usuario y password en mayuscula
  Given El usuario esta en la Home Page
  And hace click en el menu 'My account'
  When ingresa <usuario> y <password> con letras cambiadas en las casillas correspondientes
  And hace click en el boton de login
  Then se muestra en pantalla un mensaje de usuario o contrasena incorrecta
  Examples:
  |usuario |password |
  |usuario7|usuario7u|

Scenario Outline: Logout Authentificacion
  Given El usuario esta en la Home Page
  And hace click en el menu 'My account'
  When ingresa <usuario> y <password> validos en las casillas correspondientes
  And hace click en el boton de login
  When se logea exitosamente, hace click en el boton de sign out, para salir del sitio
  And hace click en el boton atras, para volver a la pagina anterior
  Then puede ver que no vuelve al dashboard de la cuenta
Examples:
  |usuario |password |
  |usuario7|usuario7u|

