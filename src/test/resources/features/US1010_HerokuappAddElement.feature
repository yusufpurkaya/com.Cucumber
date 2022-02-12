Feature: Herokuapp Sayfasinda Add butonu Testi
  @Hero
  Scenario: TC15 Sonradan gorunen elemanlar calismali

  Given kullanici "HerkuappAddelementUrl" sayfasina gider
  When Add Element butonuna basar
    Then Delete butonu gorununceye kadar bekler
    And Delete butonunun gorunur oldugunu test eder
    Then Delete butonuna basarak butonu siler
    And sayfayi kapatir
