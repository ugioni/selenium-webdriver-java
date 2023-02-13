@AutomationPractice @Account @Createanaccount
Feature: Cria uma conta nova

  Scenario Outline:  envia o cadastro de uma conta nova
    Given o usuário acessou a home da loja
    And clica em sign
    And Digita o "<email>" no campo email address do sign
    And Clica no botão Create an account
    And Clica no radiobutton com o nome de mr
    And Digita o primeiro nome "<firstName>"
    And Digita o ultimo nome "<lastName>"
    And Limpa e digita o "<email>" no campo email
    And Digita o "<password>" no campo password
    And Seleciona o dia do aniversario
    And Seleciona o mês do aniversario
    And Seleciona o ano do aniversario
    And limpa e digita o "<firstName>" no campo first name
    And limpa e digita o "<lastName>" no campo last name
    And Digita o nome da "<companhia>" no campo company
    And Digita o "<endereco>" no campo address
    And Digita o "<complemento>" no campo address line two
    And Digita a "<cidade>" no campo city
    And Seleciona o estado no campo state
    And Digita o "<cep>" no campo zip code
    And Selecione o pais
    And Digita a informação adicional testing no campo information addicional
    And Digita o "<telefoneResidencial>" no campo phone home
    And Digita o "<telefoneCelular>" no campo mobile phone
    And Limpe o campo e digite o "<endereco>" no campo Assign an address alias for future reference
    When Clico no botão Register
    Then mostre a mensagem de boas vindas "<mensagemDeBoasVindas>"

    Examples:
      | email                    | firstName | lastName | password        | companhia | endereco               | complemento | cidade | cep   | mensagemDeBoasVindas                                                                      |
      | leandromaz1988@gmail.com | Leandro   | Souza    | a7x44.mjLVpVhSf | teste S.A | Av Rua duque de caxias | Edificio    | içara  | 32808 | Welcome to your account. Here you can manage all of your personal information and orders. |