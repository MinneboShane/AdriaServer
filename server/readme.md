# Analysis & Development Project - Adria 2084 - Server Project

This repository serves as the **server-side starter project**.

It offers the foundational structure for an OpenAPI web server, along with push notifications capabilities.

**Working in this folder structure with Java & Vert.x is mandatory.**

See the instructional videos and example server repository for guidance.

## Requirements
- Adhere to the project structure as detailed in the Leho instructional videos and example server.
  - Please review the example repository and these videos thoroughly.
- Follow the coding standards outlined in the project documentation.
- Ensure unit testing for both the application and domain layers.
  - Refer to the project document for detailed testing guidelines.
- Modify the existing `webapi.yaml` instead of creating a new one.
  - Complete the `webapi.yaml` file with your custom endpoints and relevant details.

## What's Included
- SQLite Database:
  - The database is included in the project's root directory.
  - SQLite is file-based, so no database server setup is required.
  - Tools like JetBrains DataGrip can be used to inspect the database.
- Database Scripts:
  - **Migrations**: Recreates the database structure with every run/deployment.
  - **Seeders**: Populates the database with initial data.
- Refer to the example server repository for a working todo list application, **Taskly**:

## Prerequisites
- Ensure Java 11 or later is installed.
- **Make sure to have cloned the example repository to guide you through the project structure.**

## Testing & quality checks locally
- Use the Gradle task **check** to execute unit tests.
- Use the Gradle task **qa** for generating a SonarQube analysis.
- Access SonarQube reports:
  - [SonarQube Dashboard - Adria Server](https://sonarqube.ti.howest.be/dashboard?id=2024.ad-project.adria.19.server)
  - [SonarQube Dashboard - Adria Client](https://sonarqube.ti.howest.be/dashboard?id=2024.ad-project.adria.19.client)

## Running the project locally
Execute the Gradle task **run**.

## Local Endpoints
- **Database**:
  - Open the SQLite file (located in the root directory) using JetBrains DataGrip or any SQLite viewer. No password required.
- **Server Logs**:
  - Available via terminal output.
- **Swagger Interface**:
  - The `webapi.yaml` file is located in `src/main/resources`.
  - Use an OpenAPI plugin in your IDE for easy visualization and testing.
- **Web Client Project**:
  - Launch using an IDE like WebStorm/PhpStorm (refer to the client-side README).
- **Server API**:
  - Accessible at `http://localhost:8080/api/`.

## Production Endpoints
- **Database**: 
  - Read-only access: [Production Database](https://project-2.ti.howest.be/monitor/dbs/group-19)
  - Open with JetBrains DataGrip or any SQLite viewer.
- **Server Logs**:
  - [Production Logs](https://project-2.ti.howest.be/monitor/logs/group-19)
- **Server API**:
  - [Production API](https://project-2.ti.howest.be/monitor/apis/group-19)
- **API Overview**:
  - [Adria API Overview](https://project-2.ti.howest.be/monitor/overview/)
  - Please complete the `openapi.yaml` to contribute.
- **Web Client Project**:
  - [Web Client Access](https://project-2.ti.howest.be/2024-2025/group-19/)

## Build Pipeline
- The build pipeline is pre-configured:
  - Executes unit tests on every push to the main branch.
  - Generates a SonarQube analysis.
  - Deploys the server to the production environment.

## Configuring Properties
- Local properties: `src/main/resources/config/config.properties`
- Production properties are managed on the remote server.
- Local property changes aren't automatically applied to the production environment.
- For any updates to production properties, contact Mr. Blomme on MS Teams with your modified `config.properties` file. Ensure thorough local testing.

## Database Management
- No need for manual database entry.
- Use the **Migrations** and **Seeders** scripts in the `infrastructure/persistence` folder.
  - Use the **migration.sql** script to create or update the database structure (src/main/resources/migrations/migration.sql)
- The database will be recreated (Migration) and repopulated (Seeder) every time you run the API.
