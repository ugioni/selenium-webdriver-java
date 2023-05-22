# selenium-webdriver-java

## GitHub Actions

[![Java CI with Maven](https://github.com/ugioni/selenium-webdriver-java/actions/workflows/maven.yml/badge.svg?branch=master)](https://github.com/ugioni/selenium-webdriver-java/actions/workflows/maven.yml)

## SonarCloud

[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=ugioni_quickstart-minds-testing&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=ugioni_quickstart-minds-testing)

## Getting Started
Projeto de automação de testes web na linguagem <b>Java</b> com <b>Maven</b> usando:

- Junit 4.13.2

- Cucumber 7.12.0

- Selenium WebDriver 4.9.1

###### Projeto rodando no ChromeDriver

Para outras versões do Chrome trocar o driver na pasta drivers do projeto.

###### ChromeDriver Download: http://chromedriver.chromium.org/downloads

### Executando os testes

Para baixar as dependências e rodar os testes pela primeira vez, executar o comando <b>maven clean install</b>

### Relatório de execução

O relatório local do <b>Cucumber</b> de execução dos testes, está localizado em <b>target/cucumber-html-report/index.html</b>

O link do relatório na nuvem do <b>cucumber.io</b> de execução dos testes, está localizado no console ao final da execução do testes e fica disponível para acesso por 24 horas