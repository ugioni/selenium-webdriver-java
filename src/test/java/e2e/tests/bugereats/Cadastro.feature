@BugerEats @Cadastro @CadastrarUsuario
Feature: Cadastro

  Scenario: Cadastrar Usuário

    Given o usuário acessou a home do cadastro para entregas
    When clicar no cadastre-se
    And preencher os dados de cadastro do usuario
    Then deve ser exibida a mensagem de confirmação do cadastro