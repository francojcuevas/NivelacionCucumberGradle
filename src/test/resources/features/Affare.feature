Feature: PLan de pruebas Franco Cuevas capacitaicon

  @TEST_XRAY1-4
  Scenario: Ingreso a la seccion Nosotros en la pagina Affare webApp
    Given Ingresar a la pagina
    When selecciono Nosotros
    Then visualizar la informacion de la pagina nosotros
  @TEST_XRAY1-5
  Scenario: Verificar precio de la casa en Venta frente al Bosque
    Given Ingresar a la pagina
    When selecciono ver propiedad de la casa tranquilidad en el Lago
    And se describe las caracteristicas de la misma
    Then verificar que el precio sea 3,000.000
  @TEST_XRAY1-7
  Scenario: Verificar que la casa terminaciones unicas tenga 3 baños
    Given Ingresar a la pagina
    When selecciono ver propiedad de la casa terminaciones unicas
    And se describe las caracteristicas de la misma
    Then verificar que tenga 3 banos
