Feature: Add new shipping address

  Scenario Outline: User can additional shipping address
    Given User is logged in to my-store
    When User goes to Your Account page clicks Addresses and then click Create new address
    And User inputs <alias>, <address>, <zip>, <city>, <country>, <phone>
    And User submits new address
    Then User will see "Address successfully added!" and <alias>, <address>, <zip>, <city>, <country>, <phone>

    Examples:
      | alias | address   | zip    | city   | country        | phone     |
      | Firma | Onions 12 | 11-111 | Londek | United Kingdom | 111111111 |