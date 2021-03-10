Feature: Add new address after login

  Scenario: Add new shipping address
    Given User is properly logged in to CodersLab
    When User goes to UserAddressPage
    And User fill new address fields: "Adres 17", "00-000", "Londek", "United Kingdom"
    And User saves new shipping address
    Then User will see "Address successfully added!"
