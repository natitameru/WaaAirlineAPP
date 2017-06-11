# WaaAirlineAPP
waa project
Title	URL	Http Method	messages format 	Description
Create	/airline	POST	JSON	Create new airline
 delete	/airline	DELETE	JSON	Delete airline
Update	/airline	PUT	JSON	Update airline
Find	/airline	GET	JSON	Find one airline
Find by name	/airline /{name}	GET	JSON	Find airline by name
Find by flight	/airline /flight	GET	JSON	Find airline by flight
Find all	/airline/all	GET	JSON	Find all airline
				
  Restfull web service documentation 
Airline Web Service



Airplane web service

Title	URL	Http Method	Message Format	Description
Create	/airplane	POST	JSON	Create new airplane
 delete	/airplane	DELETE	JSON	Delete airplane
Update	/airplane	PUT	JSON	Update airplane
Find	/airplane	GET	JSON	Find one airplane
Find by name	/airplane/serialno	GET	JSON	Find airplane by name
Find by flight	/airplane /flight	GET	JSON	Find airplane by flight
Find by model	/airplane /model	GET	JSON	Find airplane by model
Find all	/airplane /all	GET	JSON	Find all airplane
				
				







Airport web service 

Title	URL	Http Method	Message Format	Description
Create	/airport	POST	JSON	Create new airport
 delete	/airport	DELETE	JSON	Delete airport
Update	/airport	PUT	JSON	Update airport
Find	/airport	GET	JSON	Find one airport
Find by name	/airport /serialno	GET	JSON	Find airport by name
Find by code	/airport /code	GET	JSON	Find airport by flight
Find by departure	/airport /departure	GET	JSON	Find airport by departure point
Find by city	/airport /city	GET	JSON	Find airport by city
Find by country	/airport /country	GET	JSON	Find airport by country
Find by name	/airport /name	GET	JSON	Find airport by airport name
Find all	/airport /all	GET	JSON	Find all airplane
				


Flight web service 

Title	URL	Http method	Message format	Description
Create	/flight	POST	JSON	Create new flight
 delete	/flight	DELETE	JSON	Delete flight
Update	/flight	PUT	JSON	Update flight
Find	/flight	GET	JSON	Find one flight
Find by Airline	/flight /airline	GET	JSON	Find flight by airline
Find by origin	/flight /origin	GET	JSON	Find flight by origin
Find by Destination	/flight /destination	GET	JSON	Find flight by destination
Find by arrival	/flight /arrival	GET	JSON	Find flight by arrival
Find by arrival between	/flight/arrivalbetween	GET	JSON	Find flight between date and time
Find by departure	/flight /departure	GET	JSON	Find flight by departure
Find by departure between	/flight/departurebetween	GET	JSON	Find by flight by between departure time and date
Find all	/flight/all	GET	JSON	Find all flight

