Feature: Reserve time to dantist from super user

  Scenario: reserve time with valid fields
    Given Open window for reserving time
    When Enter valid user email 
    And Enter valid time
    And click reserve button
    Then see message success 
    
   Scenario: reserve  without time
    Given Open window for reserving time
    When Enter valid user email 
    And click reserve button
    Then see message missing some field

    
   Scenario: reserve time without email
    Given Open window for reserving time
    When Enter valid time
    And click reserve button
    Then see message missing some field
    
    
   Scenario: reserve time without email and time
    Given Open window for reserving time
    When click reserve button
    Then see message missing some field
    
   Scenario: reserve time with invalid email
    Given Open window for reserving time
    When Enter invalid user email 
    And Enter valid time
    And click reserve button
    Then see message invalid email 
    