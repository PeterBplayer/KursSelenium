Feature: my store registration

  Scenario Outline: user can register with proper data
    Given user is on registration page
    When user inputs <title>, <firstName>, <lastName>, <email>, <password>, <birthDate>
    When user clicks Save button
    Then user is registered

    Examples:
       |title|firstName|lastName |email                     |password|birthDate |
       |Mr.  |Andrzej  |Kowolczyk|andrzej.kowolczyk@mail.com|12354   |11/09/1990|
       |Mrs. |Barbara  |Piętas   |barbara.pietas@mail.com   |12345   |11/12/1990|