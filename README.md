# super-simple-stock-market

#### Build:
```sh
$ mvn clean package
```
#### Run:
```sh
java -jar target/super-simple-stock-market-1.0-SNAPSHOT.jar
```
#### Options:
```sh
m: Show menu
1: Calculate dividend yield for stock
2: Calculate P/E ratio for stock
3: Record a trade for stock
4: Calculate Volume Weighted Stock Price for stock
5: Calculate GBCE All Share Index
q: Quit
```

Requirements
	Provide working source code that will :-

	For a given stock, 

	calculate the dividend yield

	calculate the P/E Ratio

	record a trade, with timestamp, quantity of shares, buy or sell indicator and price

	Calculate Stock Price based on trades recorded in past 15 minutes

	Calculate the GBCE All Share Index using the geometric mean of prices for all stocks


Constraints & Notes
	Written in one of these languages:

	Java, C#, C++, Python

	No database or GUI is required, all data need only be held in memory

	Formulas and data provided are simplified representations for the purpose of this exercise
