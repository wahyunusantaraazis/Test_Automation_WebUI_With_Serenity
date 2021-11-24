@deletebook
  Feature: Delete Book in My Collection
    As a User
    I want to delete book in my collection
    So that i success delete book

  Scenario: Success delete book
    Given I am success login
    When I am delete certain book
    When click button delete
    Then Succes delete book