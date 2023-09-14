@BugerEats @Cadastro @CadastrarUsuario
Feature: Cadastro

  Scenario Outline: Cadastrar Usuário

    Given o usuário acessou a home do cadastro para entregas
    When clicar no cadastre-se
    And preencher os dados de cadastro do usuario "<nome>" "<cpf>"
    Then deve ser exibida a mensagem de confirmação do cadastro

    Examples:
      | nome    | cpf         |
      | Leandro | 95111673083 |
      | Kenia   | 70688982034 |
      | Jose    | 16934836022 |
