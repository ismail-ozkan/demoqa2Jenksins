@googleAll
Feature: go to google
  @google
  Scenario: go to google
    Given go to google homepage
    Then verify title of "Google"

  Scenario: go to google
    Given go to google homepage
    Then verify title of "google"