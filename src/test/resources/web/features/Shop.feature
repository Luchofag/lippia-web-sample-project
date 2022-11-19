@Smoke
Feature: como usuario de AutomationTesting.in necesito probar las funcionalidades del menu shop

  Scenario Outline:
    Given El usuario esta en la Home Page
    When el usuario hace click en el boton 'shop' del menu
    And hace click en el primer boton add to basket
    And ingresa al Item menu, para ver el carro de compras
    When el usuario puede ver el importe total, procede haciendo click en el boton Proceed to chekout
    And el usuario ingresa los datos de <FirstName>, <LastName>, <Email>, <Phone>, <Country>, <Address>, <City>, <County>, <Postcode>
    When hace click en place order, para realizar el pedido
    Then el usuario puede ver los detalles del pedido
  Examples:
    |FirstName|LastName|Email            |Phone     |Country  |Address      |City      |County    |Postcode|
    |Francisco|Sosa    |usuario7@mail.com|3782454644|Argentina|Av Mayo de 25|Ranta Sosa|Corrientes|2134    |