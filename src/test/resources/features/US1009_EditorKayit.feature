Feature: US1009 Scenario Outline ile editor database sayfasina gider
@Editor
  Scenario Outline: TC14 yeni kayit ekleyebilmeli

    Given kullanici editor anasayfaya gider
    Then new butonuna basar
    And firstname olarak "<firstname>" yazar
    And lastname olarak "<lastname>" yazar
    And Position olarak "<position>" yazar
    And Office olarak "<office>" yazar
    And Extension olarak "<extension>" yazar
    And Start date olarak "<startDate>" yazar
    And 1 saniye bekler
    And Salary olarak "<salary>" yazar
    And Create tusuna basar
    When kullanici "<firstname>" ile arama yapar
    Then isim bolumunde "<firstname>" oldugunu dogrular


Examples:
  |firstname|lastname|position|office|extension|startDate|salary|firstname|
  |mehmet|kaya|developer|||11/11/2011|200000|mehmet|