# Poseidon
## Technical:

1. Spring Boot 3.1.0
2. Java 17
3. Thymeleaf
4. Bootstrap v.4.3.1
5. MySql 8.0
6. (developped with Eclipse 4.25)

## Setup for running
1. Run sql script doc/data.sql to create table
	- database is named demoPoseidon
2. Update the database information in src/main/resources/application.properties by the credentials for your own database
3. Run the application


## Setup with Intellij IDE
1. Create project from Initializr: File > New > project > Spring Initializr
2. Add lib repository into pom.xml
3. Add folders
    - Source root: src/main/java
    - View: src/main/resources
    - Static: src/main/resource/static
4. Create database with name "demo" as configuration in application.properties
5. Run sql script to create table doc/data.sql

## Implement a Feature
1. Create mapping domain class and place in package com.nnk.springboot.domain
2. Create repository class and place in package com.nnk.springboot.repositories
3. Create controller class and place in package com.nnk.springboot.controllers

## Security
1. Created user service to load user from  database and place in package com.nnk.springboot.services
2. Added configuration class and place in package com.nnk.springboot.security
