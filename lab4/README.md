CRC cards:
1)Class Name: Customer
	Knows: Phone number,Number of guests
	Do : Sign up into the system, Request for the table in the system, Conforms or leaves the request
	Collaborators: Restaurant Reservation System
2)Class Name: Restaurant Reservation System
	Knows: Customers in waitlist, table availability
	Do : Identify the customer which is fit for that particular table, sends notification to the customer on table availability,
		 removes customer from the waitlist queue
	Collaborators: Customer,Table
3)Class Name: Table Available
	Do: Changes table available to table occupied once the table gets filled
	Collaborators : Table,Table Occupied
4)Class Name: Table Occupied
	Do: Changes table occupied to table available once customer leaves the table
	Collaborators : Table,Table Available
5)Class Name : Table(Subject)
	Do: Attaches Observers,Notify on table availability
	Collaborators: Customer,Restaurant Reservation System,Table Available,Table Occupied

Design Pattern Used:
	
	1. Used Observer Pattern in my design as the customer registers on the system and gets notified when a table gets available
		Objects in Observer pattern :  Customer,Reservation Reservation System
	2. Used State Pattern as depending on the table state whether the table is available or not the restautant reservation system notifies the customer. 
		Objects in State pattern : Table Available,Table Occupied,Reservation Reservation System