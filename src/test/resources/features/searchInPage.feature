#Author: Luis Miguel
@stories
Feature: Shearch in page
  As a user, I want to seach a especific information in all page
  @scenario1
  Scenario Outline: The user wants to change to search a info
    Given than luis want search with the button lens
    When he click the button lens
    |search|
    |<search>|

    Then the page change to show results whit Pruebas Móviles

    Examples:
    |search|
    |pruebas|