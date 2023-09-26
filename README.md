# Spring Boot Agile Project

This Spring Boot application simulates Agile methods and manages tasks, sprints, and developers.

## Table of Contents
- [Overview](#overview)
- [Entities](#entities)
- [CRUD Operations](#crud-operations)
- [Testing](#testing)
- [ERD](#entity-relationship-diagram)
- [Getting Started](#getting-started)

## Overview

This project is a Spring Boot application that emulates Agile methodologies by managing tasks, sprints, and developers. It provides CRUD (Create, Read, Update, Delete) operations for these entities, allowing you to efficiently manage your project in an Agile manner.

## Entities

### Developer

A developer represents a team member who can own and be assigned tasks.

- `id`: Unique identifier for the developer.
- `name`: Name of the developer.
- `assignedTaskIds`: IDs of tasks assigned to this developer.
- `ownedTaskIds`: IDs of tasks owned by this developer.

### Sprint

A sprint represents a time-boxed iteration of work.

- `id`: Unique identifier for the sprint.
- `name`: Name of the sprint.
- `taskIds`: IDs of tasks associated with this sprint.

### Task

A task represents a unit of work that needs to be completed.

- `id`: Unique identifier for the task.
- `title`: Title of the task.
- `description`: Description of the task.
- `status`: Current status of the task.
- `ownerId`: ID of the developer who owns this task.
- `assignedToIds`: IDs of developers assigned to this task.
- `sprintId`: ID of the sprint to which this task belongs.

## CRUD Operations

The application supports the following CRUD operations for each entity:

- Create: Create a new developer, sprint, or task.
- Read: Retrieve information about developers, sprints, or tasks.
- Update: Modify the properties of existing developers, sprints, or tasks.
- Delete: Remove developers, sprints, or tasks from the system.

## Testing

The application includes unit tests for the repository and service layers to ensure the functionality of CRUD operations. You can run these tests to verify the correctness of your code.

## Entity Relationship Diagram

![24.09.2023_22.09.10_REC.png](..%2F..%2F24.09.2023_22.09.10_REC.png)
![24.09.2023_22.07.31_REC.png](..%2F..%2F24.09.2023_22.07.31_REC.png)

Above is the Entity-Relationship Diagram (ERD) representing the relationships between developers, sprints, and tasks in the database.

## Getting Started

To run this Spring Boot application locally, follow these steps:

1. Clone this repository.
2. Configure your database settings in `application.properties` or `application.yml`.
3. Build and run the application using your preferred IDE or command line tools.

Feel free to modify and extend this application to suit your project's requirements.

Enjoy using your Agile Spring Boot project!
