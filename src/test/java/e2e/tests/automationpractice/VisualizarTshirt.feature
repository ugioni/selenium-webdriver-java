@AutomationPractice @Produto @VisualizarTshirt
Feature: Visualizar Tshirt

  Scenario: Visualiza o produto T-shirt

    Given o usuário acessou a home da loja
    And  clica no menu T-Shirt
    When clicar em Quick view do produto
    Then a modal contendo o produto descrito deveria aparecer