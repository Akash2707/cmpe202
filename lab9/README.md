# Lab 9

- Design Pattern Implementation :

In original source code Strategy Pattern is implemented to calculate income based on different taxes.The three classes PersonalTaxStrategy,
PersonalTaxPenaltyStrategy and PersonalTaxRebateStrategy implements calculatetax method of TaxStrategy interface to calculate the income.

- Java Lambda Implementation:

In lambda function of creating Strategy Pattern, instead of creating three different strategy classes for calculating income on different 
taxes, all the strategy behaviour is written in the single context class using lambda function.

**Comparison between Java pattern implementation and Java Lambda Implementation:**

Lambda function treats function as a method argument without belonging to any class which leads to compact and managable code by 
reducing the number of classes,
