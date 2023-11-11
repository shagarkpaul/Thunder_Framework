
Feature: searching products 

Scenario Outline: searching products in google

Given i am on the google homepage 

When i enter the "<Product_name>" in the search bar 
And i click on the search button 


Then I can see the search results successfully 


Examples: 

| Product_name | 
| Computer     | 
| Football     | 
| Flower       | 
