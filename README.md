# Login Java Swing Window

This project is a Java desktop-based application that presents a Login Window developed using Java Swing. The system allows users to input their credentials and attempts to authenticate them by connecting to a MySQL database.

The interface is built with Java Swing, offering a lightweight, responsive, and cross-platform GUI. It demonstrates basic database integration, JDBC connectivity, and GUI event handling.


## Technologies Used

| Technology            | Purpose                                   |
| --------------------- | ----------------------------------------- |
| **Java (Swing)**      | GUI development (Login Window)            |
| **NetBeans**          | Integrated Development Environment (IDE)  |
| **MySQL**             | Relational Database for user data         |
| **MySQL Workbench**   | Visual tool to manage MySQL database      |
| **MySQL Connector/J** | JDBC driver for connecting Java and MySQL |



## Project Setup

1. Clone the repository

```bash
  git clone https://github.com/educonejo/TelaLogin.git
  cd TelaLogin
```

2. Open in NetBeans

Launch NetBeans.

Go to **File > Open Project.**

Select the project folder.

## Connecting NetBeans to MySQL

1. Extract MySQL Connector
Go to: **MySQL Connector/**

Extract the **mysql-connector-j-8.0.33.zip** file


2. Add Connector to NetBeans Project
Right-click your project in NetBeans → Properties.

Go to Libraries → Click Add JAR/Folder.

Locate the mysql-connector-j-8.0.33.jar file you downloaded.

Click Open and then OK to confirm.


## Creating a Database Schema in MySQL Workbench

1. Open MySQL Workbench

2. Connect to Your MySQL Server
Click on your local connection or create a new one.

3. Create a New Schema


```bash
CREATE TABLE `mapa`.`usuario` (
`id` INT NOT NULL AUTO_INCREMENT,
`nome` VARCHAR(45) NULL,
`login` VARCHAR(45) NULL,
`senha` VARCHAR(45) NULL,
`email` VARCHAR(45) NULL,
PRIMARY KEY (`id`));
```
## Running the Project

Make sure your MySQL server is running.
