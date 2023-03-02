@google
Feature: go to google
  Scenario: go to google
    Given go to google homepage
    Then verify title of "Google"

  Scenario: go to google
    Given go to google homepage
    Then verify title of "google"