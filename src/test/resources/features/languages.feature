Feature: languages
  @test1
  Scenario: user is able to add any language
    Given user logs in with valid admin username "Admin" and password "Hum@nhrm123"
    When user navigates to languages
    Then user is able to add language "Spanish" successfully


