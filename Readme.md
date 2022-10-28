This a demo Email application using Spring Boot. Spring boot MVC (Model-View-Controller) design pattern has been used.
For Api documentation I have used Swagger. 
The required steps are given below.
Step 1 - Run the Main class of Spring Boot Application.
Step 2 - Goto http://localhost:8080/swagger-ui/index.html and 'user-and-email-controller' for testing apis.
Step 3 - First, you need to create user. Goto '/user' and try out. Please delete the 'userId' field. Spring automatically creates that field. 
            Please note the user id. 
Step 4 - Next, you can retrieve user details from '/user/{id}' . Please give the userId which you have got from previous step.
Step 5 - Also , you can find all the users details from '/users'.
Step 6 - Next , you can send email from '/email' . Please give all the required field and delete the 'emailTransactionNo' field.
        Also, If the 'fromEmail' value doesn't exist in the database, The api doesn't work.
Step 7 - Next, you can count the total email no of any user from '/emails/count' and give the user id from step 3.