Feature: Pruebas relacionadas a Affare Bienes Raices webApp
  @PI2-1 @TESTPLAN_PI2-1
  Scenario: Ingreso a la seccion Nosotros en la pagina Affare webApp
    Given Ingresar a la pagina
    When selecciono Nosotros
    Then visualizar la informacion de la pagina nosotros

  @PI2-1 @TESTPLAN_PI2-2
  Scenario: Verificar precio de la casa en Venta frente al Bosque
    Given Ingresar a la pagina
    When selecciono ver propiedad de la casa tranquilidad en el Lago
    And se describe las caracteristicas de la misma
    Then verificar que el precio sea 3,000.000

  @PI2-1 @TESTPLAN_PI2-3
  Scenario: Verificar que la casa terminaciones unicas tenga 3 baños
    Given Ingresar a la pagina
    When selecciono ver propiedad de la casa terminaciones unicas
    And se describe las caracteristicas de la misma
    Then verificar que tenga 3 banos