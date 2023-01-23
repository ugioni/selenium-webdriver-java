@AutomationPractice @Produto @BuscarProduto
Feature: Buscar Produto

  Scenario Outline: Busca um produto válido na loja

    Given o usuário acessou a home da loja
    And digitar a descrição do produto "<descProduto>" na barra de pesquisa
    When clicar no botão buscar na barra de pesquisa
    Then deve ser exibido um resultado encontrado para a pesquisa
    And deve ser exibido o produto "<produto>" encontrado para a pesquisa

    Examples:
      | descProduto | produto                     |
      | t-shirts    | Faded Short Sleeve T-shirts |
      | blous       | Blouse                      |