CRC cards:<br/><br/>
1)Class Name: Customer<br/>
	Knows: Phone number,Number of guests<br/>
	Do : Sign up into the system, Request for the table in the system, Conforms or leaves the request<br/>
	Collaborators: Restaurant Reservation System<br/>
2)Class Name: Restaurant Reservation System<br/>
	Knows: Customers in waitlist, table availability<br/>
	Do : Identify the customer which is fit for that particular table, sends notification to the customer on table availability,<br/>
		 removes customer from the waitlist queue<br/>
	Collaborators: Customer,Table<br/>
3)Class Name: Table Available<br/>
	Do: Changes table available to table occupied once the table gets filled<br/>
	Collaborators : Table,Table Occupied<br/>
4)Class Name: Table Occupied<br/>
	Do: Changes table occupied to table available once customer leaves the table<br/>
	Collaborators : Table,Table Available<br/>
5)Class Name : Table(Subject)<br/>
	Do: Attaches Observers,Notify on table availability<br/>
	Collaborators: Customer,Restaurant Reservation System,Table Available,Table Occupied<br/><br/>

Design Pattern Used:<br/><br/>
	
1)Used Observer Pattern in my design as the customer registers on the system and gets notified when a table gets available<br/>
		Objects in Observer pattern :  Customer,Reservation Reservation System<br/>
2)Used State Pattern as depending on the table state whether the table is available or not the restautant reservation system notifies the customer.<br/> 
		Objects in State pattern : Table Available,Table Occupied,Reservation Reservation System<br/>