Feature: US1008 Scenario Outline kullanarak farkli degerlerle Negative Login Test
  
  Scenario Outline: TC13 farkli kullanici adi ve password
    Given kullanici "HMCUrl" sayfasina gider
    And login linkine tiklar
    Then scenario outline'dan kullanici adi olarak "<username>" yazar
    And scenario outline'dan kullanici password  olarak "<password>" yazar
    And verileri kaydeder
    Then giris yapilamadigini test eder
    
    
    
    Examples:
    |username|password|
    |MANAGER |MANAGER1|
    |MAnAgEr |Manager1|
    |123455  |---77777|
    | a a a  |55++--iaf|