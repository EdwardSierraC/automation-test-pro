#Author: Edward Sierra

  Feature: Login to the academy website
    As a user, I want to log in to the Choucair Academy website to study


  @Login
  Scenario Outline: Login to the website
    Given I login to the website
    When I type my username <user> and password <password>
    Then I should see the courses

    Examples:
    |user     |password       |
    |esierrac |Choucair2023*  |