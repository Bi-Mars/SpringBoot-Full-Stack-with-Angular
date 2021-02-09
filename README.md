__Prerequisite__
- Java
- Spring Boot
- HTML
- JavaScript
- TypeScript
- Angular
- HTTP & CSS
- CLI (HTTPie)
- Database (MySQL)

__Environment set-up__
1. Java: Download and configure JDK 1.8 or above
2. NodeJS (we will use __npm__ package manager to install angular cli)
3. Angular Cli (cli.angular.io)
4. IDE (IntelliJ IDEA,VS code)
5. Postman
6. HTTPie (https://httpie.io/)

__Initialize Project__
1. Initialize SpringBoot project:
    a. Spring Initializer (Spring Web, Spring Data JPA and MySQL Driver)

__Where to start?__
1. Create new User in your database:

    - CREATE USER 'employeemanager' IDENTIFIED BY 'manager';

        - username = employeemanager
        - password = manager

    - GRANT ALL PRIVILEGES ON * . * TO 'employeemanager'
    - Verify user by login:

        - mysql -u employeemanager -p manager

2. Configure Database

    - Make sure you have database installed.
    - __Goto:__ springboot project > src > main > resources > application.properties

        - __spring.datasource.url__ = URL to your database and name of the database
        - __spring.datasource.username__=userName
        - __spring.datasource.password__=password
        - __spring.jpa.show-sql=true__  --> sql queries will be displayed in console whenever JPA is executing queries
        - __spring.jpa.hibernate.ddl-auto=update__
3. Create Database:

    - CREATE DATABASE employeemanager;
4. Run the application
5. Create Repository package

    i. Create an Interface that extends JpaRepository<model/entityName, dataType-of-primary-key>

        - Why?
            - JpaRepository is an Interface and has methods definition for common database operations like findAll,saveAll...
6. Create a service package and that provides services to employee manager.

    - All CRUD operations logic goes here
7. Exception Handling

    - Create a package for exceptions
    - Create a class that extends RuntimeException
8. Exposing the API:

    CLIENT&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;SERVER
    
    HTTP Requests ---------> Controller (Accepts Client request and forward the request to particular service) --------> Service ---------> Database

9. Create controller package and create RestController class that handles HTTP request and forward the request to necessary interface or services.

    - Initialize Service Class in constructor of RestController

        - Create Mapping for CRUD operations that completes the task by calling Service class

10. Testing:

    - Run your application
    - Postman

        - Make API call and test if you are getting expected result or not

    - HTTpie:

        - Command Line tool to test REST APIs

            - http GET http://localhost:8080/api/employee/all
            - For Post requests: Create a test file that contains data and then point the file while making the request

                - http POST :8080/api/employee/add < testAPI.json

                    - testAPI.json is the file I created
            
            - For PUT request:

                - http PUT :8080/api/employee/update < testAPI.json


__Creating Front-end using Angular__
1. Command to start Angular project: cd to directory where your project will be created and then:

    - ng new employeemanagerfrontend

2. Design:

  CLIENT&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;SERVER
 UI ===>  Component ===> Service (HTTP Requests) ===> Rest Controller ===> ... ===> Database

3. cd into the directory and type __ng serve__ to run 

4. Mock data that comes from the backend:

    - src > app > new file > fileName.ts (Employee.ts)

        - This file contains the properties (of Employee) that backend is returning

            - Mirror what the data looks like when it comes from the backend
5. Create service file 

    - src > app > new file > fileName.service.ts 