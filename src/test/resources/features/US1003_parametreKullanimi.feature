@ParametreliTest
Feature: US1003 parametre ile stepdefinition olusturma
  Scenario: TC05_parametre kullanimi

    Given kullanici amazon sayfasina gider
    And "iPhone" icin arama yapar
    Then sonuclarin "Iphone" icerdigini test eder
    And sayfayi kapatir