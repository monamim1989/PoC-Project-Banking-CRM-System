# PoC-Project-Banking-CRM-System

### PROJECT DESCRIPTION</br>
This is a Customer relationship management platform for TIAA Bank, which is an American diversified financial services company which provides various services in the field of banking, life insurance, investment management and finance. This project introduces a Banking CRM application that overlays the core banking system with a simple, user-friendly solution that dramatically improves and simplifies the way the banking institution operates. This system enables any banking customers to virtually access full bank services including account creation and data handling, fund transfer, transaction management, generating invoice and reports, automated statement generation and status check.

### SCOPE</br>
The major scope of this project is to convert the legacy application from monolith to microservices architecture which are build utilizing Java 8 and Spring Boot 2.0 framework. The primary independent services are -  </br>
Customer/User Service - Using this service, a new customer is able to register themselves with the banking system and create a profile. They are also able to edit their existing profiles.</br>
Account Service - Using the account management service, the customer is able to create and access primarily two types of account - primary account and savings account. Once customer is signed in, they can see the balance amounts in both these accounts for their respective accounts.</br>
Transaction Service - Using this service, customers can perform fund transfer between a customer’s primary and savings account, and also fund transfer from one customer’s account to other recipient’s account. The debit and credit data along with transaction invoice and description is updated and maintained using the transaction management microservice.</br>
In this way developing a single Customer Relationship Management application as a suite of small services each running in its own process and communicating with lightweight mechanisms helps in achieving modularity and scalability for microservices architecture. </br>

### RESPONSIBILITIES</br>
• This project is build utilizing Java 8 and Spring Boot 2.0 framework. </br>
• As this is a banking application, security is of major concern. I implemented logging authentication in the application using Spring Framework AOP module to know the application status and used Spring Security OAuth2 for single sign on feature in order to provide security authorization and authentication for the customer details. In addition to that I ensured complete protection against OWASP Top 10 web vulnerability risk. </br>
• I developed the web services using Spring REST and used Spring Data JPA 2.1.5 to extract the customer related data like account information, transaction records, balance amounts etc. from MySQL 8.0 database. </br>
• I was able to create Single Page Application using Angular 8 for customer data management by the admin. Through this application, a banking admin official is able to view all customer transaction list present in the system, enable/disable customer account, aid in customer services when needed. </br>
• For the front-end, I could successfully build a user-friendly cross browser compatible web application using HTML5, JavaScript 2.0, CSS3, jQuery 3.0 and Bootstrap 4.2.1. This would enable customer searches like accounts, transaction, registration, transfer, profile etc. </br>
• I implemented unit testing, integration and functional testing for all modules using Test Driven Development (TDD) tools like JUnit 5.0 and Mockito 2.0 for the controllers and services. </br>
• I used Docker to deploy separate microservices for platform independence. </br>
• I generated Maven scripts to build and deploy, and utilized GIT for version control, and used Jenkins for Continuous Integration and Continuous Deployment process.</br>

### ENVIRONMENT </br>
Java 8, Java EE, MySQL 8.0, Spring Boot 2.0, Spring MVC 5.0, Spring REST, Spring Data JPA 2.1.5, Spring Security 5.0, Spring AOP, OAuth2, OWASP, Angular 8, jQuery 3.0, HTML5, CSS3, Bootstrap 4.2.1, GitHub 2.26.0, Jenkins 2.0, Maven 3.0, Junit 5, Mockito 2.0, Apache Tomcat 8.0
