Feature: Login

  @regression
  Scenario Outline: Login with multiple invalid username and password combinations
    When user enters different invalid "<username>" and invalid "<password>" and "<errorMessage>" and verify the error

    Examples:
      | username          | password   | errorMessage             |
      | Admin             | Human      | Invalid credentials      |
      | william1236000000 | Syntax     | Invalid credentials      |
      | James             |            | Password cannot be empty |
      |                   | Syntax123! | Username cannot be empty |

  @regression
  Scenario: login with multiple valid credentials
    When user enters valid username and password and logs in successfully

      | username | password     | firstname |
      | Admin    | Hum@nhrm123  | Admin     |
      | Polina   | Syntax12!!!! | Polina    |

