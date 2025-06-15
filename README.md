# Onebox-for-Emails (Spring Boot Version)

Overview

Onebox-for-Emails is a web-based email portal built using Java (Spring Boot). It allows users to send emails from multiple sender accounts, using HTML templates powered by Thymeleaf, and optionally loads recipient data from a CSV file. The system is designed for efficient, customizable email communication.


 Features

- Send emails using multiple Gmail accounts
- Email templates using Thymeleaf
- Read recipients from a CSV file
- Simple REST API for email sending
- Built with Spring Boot and Maven

Requirements
Java 17 or higher
Maven
Gmail account(s) with App Passwords
.properties
Setup
1. Clone the repository

2. Configure Your Email Settings 
Create a file application.properties  and configure your email login info like:
# SMTP Settings
MAIL_SERVER=smtp.gmail.com
MAIL_PORT=587
MAIL_USE_TLS=true

# First Gmail account
MAIL_USERNAME_1=youremai1@gmail.com
MAIL_PASSWORD_1=your_app_password_1

# Second Gmail account
MAIL_USERNAME_2=youremail2@gmail.com
MAIL_PASSWORD_2=your_app_password_2
spring.thymeleaf.prefix=classpath:/templates/
spring.thymeleaf.suffix=.html
spring.thymeleaf.cache=false

3. Run the Application
To start the Spring Boot application, use the following command:
mvn spring-boot:run

Once the application starts successfully, it will be available at:
http://localhost:8080/

You should have Java 17+ and Maven installed on your machine.

4. Sending Emails
Enter the recipient email, subject, and message to send individual emails.
For bulk sending, use a emails.csv file with recipient details.
Emails will be sent using the configured Gmail accounts.