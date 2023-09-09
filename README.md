# AulaCube_technologies
This is a simple project is given by auticude organization the project is
```
Create a Simple RESTful API
● Preferred Programming Language: Java(Spring-boot) or JavaScript
● Database: Any SQL or NoSQL DB (Mongo or PostgreSQL recommended)
Objective:
Create a basic RESTful API using the mentioned programming languages and databases.
The goal is to perform CRUD operations (Create, Read, Update, and Delete) on a single
object.
Task Table/Collection Details:
● id: Unique identifier
● title: String
● description: String
● status: String (e.g., "completed", "pending")
Requirements:
1. Database Setup:
● Set up the database table/collection for Task.
2. API Implementation:
● GET /tasks: Fetch all tasks.
● POST /task: Create a new task.
● PUT /task/{id}: Update the status of an existing task.
3. Code Quality:
● Ensure your code is clean and readable.
Instructions:
1. Fork a new branch from the main code repository.
2. Complete the assignment on your branch.
```





## Tech Stack

- Core Java
- Spring Boot
- Spring Security
- Hibernate
- MySQL (RDBMS)
- Sql
- Maven
- postman
- Intellij Idea
- Giuhub


## Deployment

To deploy this project on localhost paste this below code in application.properties file in the 
resources and update according to your database name, username and password of your MySQL database.

```properties
 #changing the server port
server.port=8080

#db specific properties
spring.datasource.url=jdbc:mysql://localhost:3306/database
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.username=username
spring.datasource.password=password



#ORM s/w specific properties
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

spring.mvc.throw-exception-if-no-handler-found=true
spring.web.resources.add-mappings=false

spring.mvc.pathmatch.matching-strategy = ANT_PATH_MATCHER

```
