#Author: Vianka Medina Balbi
Feature: feature para probar Login

  @Escenario1
  Scenario Outline: Verificar que un usuario puede iniciar sesión correctamente con credenciales válidas
  
    Given el usuario ingresa a la pagina de inicio de sesion
    When el usuario introduce el Username y Password validos
    And Hace click en el boton Login
    Then el usuario es redirigido al dashboard con el mensaje Welcome to the Secure Area
    And cierra sesion

  @Escenario2
  Scenario Outline: Verificar que un usuario no pueda iniciar sesión con credenciales no válidas
  
    Given el usuario ingresa a la pagina de inicio de sesion
    When el usuario introduce el Username y Password no validos
    And Hace click en el boton Login
    Then verificar mensaje Your username is invalid!

  @Escenario3
  Scenario Outline: Verificar que alerta cuando no se suministre el usuario
  
    Given el usuario ingresa a la pagina de inicio de sesion
    When el usuario introduce el Password
    And Hace click en el boton Login
    Then verificar mensaje Your username is invalid!
