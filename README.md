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
