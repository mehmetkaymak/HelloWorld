Feature: OrangeHRM Login
  Scenario: Logo presence on OrangeHRM home Page
    Given I launch chrome browser
    When  I open orange hrm homepage
    Then verify that logo is present
    And close the browser