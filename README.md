# Airline-Project

How to use the Rest Webservice
BaseUrl : http://localhost:8080/airlinesWebApp/rs/

#AirLineService: 
1.To get list of Airline Method: GET URL : http://localhost:8080/airlinesWebApp/rs/airline/ 

Response : [{"id":2,"name":"SkyTeam"},{"id":10,"name":"oneworld"},{"id":17,"name":"North Star"}

2.To get Airline by Id Method: GET URL : http://localhost:8080/airlinesWebApp/rs/airline/{id} 
Response : {"id":2,"name":"SkyTeam"}

3 To Create Airline Method: POST URL : http://localhost:8080/airlinesWebApp/rs/airline/create
 Parameter : {"name": "Dream"} Response : {"id": 1251,"name": "Dream"}

4 To Update Airline Method: PUT URL : http://localhost:8080/airlinesWebApp/rs/airline/update 
Parameter : {"id": 1251,"name": "Dream"} Response : {"id": 1251,"name": "Dream"}

4 To Delete Airline Method: POST URL : http://localhost:8080/airlinesWebApp/rs/airline/delete
 Parameter : {"id": 1251,"name": "Dream"} Response : { "status": "Sucess","message": "SucessFully deleted"}

5 To get List of by Airline name Method : GET URL : http://localhost:8080/airlinesWebApp/rs/airline/flight/oneworld
     Response : [{"id":10,"name":"oneworld"},{"id":2,"name":"SkyTeam"},{"id":17,"name":"NorthStar"}]

 These all are similar to airport service
#AirPlaneService: 
#AirPortService: 
#FlightService:
