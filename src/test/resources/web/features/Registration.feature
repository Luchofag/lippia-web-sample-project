@Smoke
Feature: Como usuario de AutomationTesting.in necesito probar las funcionalidades de la pagina de registro de cuentas

  Scenario Outline: Registro sin password
    Given El usuario esta en la Home Page
    When hace click en el menu 'My account'
    And ingresa un <email> valido y con la casilla de password vacia, hace click en el boton para registrar la cuenta
    Then el registro debe fallar con el mensaje en pantalla: please enter an account password
    Examples:
      |email            |
      |usuario1@mail.com|


  Scenario: Registro sin mail y sin password
    Given El usuario esta en la Home Page
    When hace click en el menu 'My account'
    And con las casillas de email y contraseña vacios, hace click en el boton de registrar
    Then el registro debe fallar con el mensaje en pantalla: please provide valid email address

