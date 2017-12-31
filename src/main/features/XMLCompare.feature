#Author: Vaishnavi Kankanala
@Xml @Compare
Feature: XMLCompare

Scenario: Compare two XML Files
	Given Input xml firstFile filePath "src/main/resources/Book1.xml"
	Given Input xml secondFile filePath "src/main/resources/Book2.xml"
	When Compare two files for redundants
	Then Save Output to filePath "src/main/resources/Book3.xml"
	