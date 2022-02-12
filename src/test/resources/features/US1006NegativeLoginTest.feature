Feature: US1006 Negative Login Test

  Scenario: TC09 yanlis username , dogru sifre ile giris yapilamaz

    Given kullanici "HMCUrl" sayfasina gider
    Then login linkine tiklar
    And kullanici adi olarak "HMCWrongUsername" girer
    And password olarak "HMCWrongPassword" girer
    Then verileri kaydeder
    And giris yapilamadigini test eder

    Scenario: TC10 dogru username,  yanlis sifre ile giris yapilamaz
      Given kullanici "HMCUrl" sayfasina gider
      Then login linkine tiklar
      And kullanici adi olarak "HMCValidUsername" girer
      Then password olarak "HMCWrongPassword" girer
      Then verileri kaydeder
      And giris yapilamadigini test eder

      Scenario: TC11 yanlis username , yanlis password ile girisyapilamaz
        Given kullanici "HMCUrl" sayfasina gider
        And login linkine tiklar
        Then kullanici adi olarak "HMCWrongUsername" girer
        And password olarak "HMCWrongPassword" girer
        Then verileri kaydeder
        And giris yapilamadigini test eder