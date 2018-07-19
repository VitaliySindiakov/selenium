Feature:
  As an enterprenuer
  I want to register a business project
  Scenario: Register a new project
    Given I am on new project registration page
    When enter my name "Vitaliy" and My last name "Sindiakov"
    When text my phone "630000000"
    When i enter my city "Kyiv"
    When i enter my email "vitaliysindjakov@gmail.com"
    When i enter my password "Ab12345!"
    When i press next
    Then I check where am i

    
    