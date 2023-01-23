@AutomationPractice @Contato @ContactUs
Feature: Contact Us

  Scenario Outline: Preenche e manda o formulario de contato

    Given o usuário acessou a home da loja
    And Clica em Contact us
    And Seleciona a opcão Custumer Service
    And Digitar o "<email>" no campo email address
    And Digitar "<orderReference>" no campo order reference
    And Anexa um arquivo no campo de file
    And Digitar "<message>" no campo message
    When Clico no botão send
    Then Deverá mostrar a "<mensagemDeSucesso>"

    Examples:
      | email                    | orderReference | message | mensagemDeSucesso                                    |
      | leandromaz1988@gmail.com | testing        | teste   | Your message has been successfully sent to our team. |