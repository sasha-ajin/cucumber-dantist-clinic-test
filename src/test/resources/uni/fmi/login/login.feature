Feature: Вход в системата

	
	
  Scenario: Вход в системата с валидни потребителски данни
    When Въведе потребителско име: "Иван"
    And въведе потребителска парола: "123!pass"
    And натисне бутона за вход в системата
    Then Вижда съобщение: "Успешно влизане!"