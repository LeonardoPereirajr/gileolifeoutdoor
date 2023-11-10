# Gi Leo Life outdoor - Project APP TREKKINGS
This repository contains a project built using Java Spring.

The project is made up of some entities, including:

 - Users: Customers who will participate in events with the gileolifeoutdoor team
 - Events: Events that the team plans to take participants to. More common are trekkings in places that are sparsely populated and difficult to access.
 - Access: For admin users to manage the app.

## Table of Contents

- [Installation](#installation)
- [Configuration](#configuration)
- [API Endpoints](#api-endpoints)
- [Database](#database)

## Installation

1. Clone the repository:

```bash
git clone https://github.com/Fernanda-Kipper/live-crud-java-spring.git
```

2. Install dependencies with Maven

## Usage

1. Start the application with Maven
2. The API will be accessible at http://localhost:8080


## API Endpoints
The API provides the following endpoints:

```markdown
GET / - Retrieve a list of all data.

POST / - Register a new data.

PUT / - Alter data.

DELETE / - Delete data.
```

## Database
The project utilizes PostgresSQL as the database. The necessary database migrations are managed using Flyway.

To [install PostgresSQL])(https://www.postgresql.org/download/) you can install here.
