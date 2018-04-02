# NewShame_B

NewShame is creating an equipment rental service. Two applications will be created that provide and consume a service from each other. 

NewShame B represents the customer portal application which will communicate with the inventory manager application (NewShame A). The 
customer app will control its own database(see schema below) of customer orders. The cusomter app will access information from the 
inventory app about what equipment is available for the customer to rent. The customer app will provide equipment return information
for the inventory app to access.

Database Schema
Table 1 : Customer Orders
Fields(Total of 8): Order Number (int), Customer Name (String), Equipment ID (int), Checkout Time Stamp(Time Date)
                    Return Time Stamp (Time Date), Location ID (String), Price (double), Estimated Return Date (Time Date)
                    
                    
