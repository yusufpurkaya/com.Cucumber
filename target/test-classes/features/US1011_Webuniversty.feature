Feature: US1011 Webuniversty window handle
@WebU
  Scenario Outline: TC16 Reusable methods ile Window handle testi
     Given kullanici "WebdriverUnivertyUrl" sayfasina gider
    Then WUlogin portala kadar asagi iner
    And WUlogin portala tiklar
    Then WUacilan diger window a gecer
    And WU "<username>" ve "<password>" kutularina deger yazdirin
   Then WU login butonuna basar
    And WU popup da cikan yazinin "validation failed" oldugunu test eder
    Then WU ok diyerek popup a kapatir
    And WU ilk sayfaya geri doner
    Then WU ilk sayfaya geri donuldugunu test eder
And sayfayi kapatir

    Examples:
    |username|password|
    |Alican|kayali|