Feature: my store registration

  Scenario Outline: user can register with proper data
    Given user is on registration page
    When user inputs <title>, <firstName>, <lastName>, <email>, <password>, <birthDate>
    When user clicks Save button
    Then user is registered

    Examples:
       |title|firstName|lastName|email                       |password|birthDate |
       |Mr   |Karol    |Kowolczyk   |karol.kowolczyk@mail.com|12354   |11/09/1990|
       |Mr   |Bartosz  |Piętas      |bart.pietas@mail.com    |12345   |11/12/1990|