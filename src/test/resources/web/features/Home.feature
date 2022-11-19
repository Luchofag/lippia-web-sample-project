@Smoke
Feature: Como usuario de AutomationTesting.in necesito probar las funcionalidades del home page

  Scenario: Home Page with three Arrivals only
    Given El usuario esta en la Home Page
    When el usuario hace click en el boton 'shop' del menu
    And regresa al home page, con el boton de 'home'
    When el usuario puede ver solo tres 'arrivals'
    Given el usuario hace click en la imagen del primer 'arrival'
    When ingrese en la pagina del libro, hace click en Add to basket para agregarlo al carro
    And ingresa al Item menu, para ver el carro de compras
    When el usuario puede ver el importe total, procede haciendo click en el boton Proceed to chekout
    Then el usuario puede ver el detalle de facturacion e informacion adicional

  Scenario Outline: Fill the form
    Given el usuario hace click en la imagen del primer 'arrival'
    When ingrese en la pagina del libro, hace click en Add to basket para agregarlo al carro
    And ingresa al Item menu, para ver el carro de compras
    When el usuario puede ver el importe total, procede haciendo click en el boton Proceed to chekout
    And el usuario ingresa los datos de <FirstName>, <LastName>, <Email>, <Phone>, <Country>, <Address>, <City>, <County>, <Postcode>
    When hace click en place order, para realizar el pedido
    Then el usuario puede ver los detalles del pedido
  Examples:
    |FirstName|LastName|Email            |Phone     |Country  |Address      |City      |County    |Postcode|
    |Francisco|Sosa    |usuario7@mail.com|3782454644|Argentina|Av Mayo de 25|Ranta Sosa|Corrientes|2134    |
