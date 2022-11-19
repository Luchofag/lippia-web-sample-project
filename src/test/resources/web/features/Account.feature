@Smoke
Feature: Como usuario de AutomationTesting.in necesito entrar a la pagina de 'My Account'

  Scenario Outline: Detalles de la cuenta
    Given El usuario esta en la Home Page
    And  hace click en el menu 'My account'
    When   ingresa <usuario> y <contrasena> validos en las casillas correspondientes, luego hace click en el boton de 'login'
    And   el usuario entra exitosamente a la pagina de la cuenta, hace click en 'account details'
    Then  el usuario puede ver la posibilidad de cambiar la contrasena
  Examples:
    |usuario |contrasena|
    |usuario7|usuario7u |

  Scenario Outline: Logout button
    Given El usuario esta en la Home Page
    And  hace click en el menu 'My account'
    When   ingresa <usuario> y <contrasena> validos en las casillas correspondientes, luego hace click en el boton de 'login'
    And   el usuario entra exitosamente a la pagina de la cuenta, hace click en 'Logout'
    Then  el usuario regresa a la pagina de login
  Examples:
    |usuario |contrasena|
    |usuario7|usuario7u |