Feature: Check Amazon Login Page functionality

  Scenario: Validate Login Function
    When User is on Amazon page
    When User enter credentials
      | Username   | Password |
      | 8778890167 | 10989840 |
    And Click login button
