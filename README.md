# KT Jab Houy Catalog Service

This repository provides a **Spring Boot Application** for running a **Catalog Microservice**. The catalog service acts as the products showing like product category, product tag, product, product variant,etc. This repository contains the sub-modules from other repositories.

---

## Project Structure

```shell
kt-jab-houy-catalog-service/
├── build.gradle # a script file for gradle
├── settings.gradle # a crucial configuration file in a gradle project
├── gradlew # used to run gradle on linux/mac os
├── gradlew.bat # used to run gradle on window os
├── gradle.properties # a gradle properties config
├── gradle/ # a gradle wrapper
├── src/ # a source directory for application code
├── docker/ # a docker sub-module
├── .gitignore # a git file used to ignore files or folders
├── .gitattributes # a git file used to handle specific files or file types, primarily for managing text line ending
├── .gitmodules # a git file used to stores metadata about the git submodules
├── .dockerignore # a docker file used to exclude files or folder from the build context sent to the Docker daemon
├── docker-compose.yml # a docker file used to define and run multi-container docker applications
├── CHANGES # an history of changed
└── README.md # a main document about the project
```

---

## Cloning the Repository

### Option 1: Clone Normally

If you’re using this as a standalone project:

```bash
git clone https://github.com/kmeng-tech/kt-jab-houy-catalog-service.git
cd kt-jab-houy-catalog-service
```

### Option 2: Add as a Submodule to Another Project

If this database setup is part of a larger project, you can add it as a **Git submodule**:

```bash
git submodule add https://github.com/kmeng-tech/kt-jab-houy-docker.git docker
git submodule update --init --recursive
```

This will clone the submodule inside your main project at `docker`.

To update the submodule later:

```bash
git submodule update --remote --merge
```

### Option 3: Clone a Repository That Already Has Submodules

If you’re cloning a project that already includes this as a submodule, you must initialize and fetch submodules right after cloning:

```bash
git clone --recurse-submodules https://github.com/kmeng-tech/kt-jab-houy-catalog-service.git
cd kt-jab-houy-catalog-service
```

If you forgot to use `--recurse-submodules`, run:

```bash
git submodule update --init --recursive
```

---

## Environment Variables

Before starting the application, please the environments at this first `src/main/resources/application.yml` and also can at this too `src/main/resources/application-local.yml`:

| Variable         | Description           | Default            |
| ---------------- | --------------------- | ------------------ |
| `SERVER_PORT`    | Server port           | `8080`             |
| `ACTIVE_PROFILE` | Spring active profile | `local`            |
| `DEBUG_MODE`     | Spring debug mode     | `true`             |
| `DB_HOST`        | Database host         | `kt-postgresql-db` |
| `DB_PORT`        | Database port         | `5432`             |
| `DB_NAME`        | Database name         | `kt-jab-houy-db`   |
| `DB_USER`        | Database user         | `kt-jab-houy-user` |
| `DB_PASSWORD`    | Database password     | `password`         |

---

## Getting Started

### 1. Create an External Network

If you haven’t created the external network yet:

```shell
docker network create kt-network
```

### 2. Start the Container

```shell
docker-compose up -d
```

### 3. Verify the Container

```shell
docker ps
```

---

## Gradle Development Commands

| Command                | Description              |
| ---------------------- | ------------------------ |
| `./gradlew bootRun`    | Run Spring Boot locally  |
| `./gradlew build`      | Build the application    |
| `./gradlew test`       | Run unit tests           |
| `docker-compose up -d` | Start the app via Docker |

---

## Useful Docker Commands

| Command                                                | Description                                 |
| ------------------------------------------------------ | ------------------------------------------- |
| `docker-compose down`                                  | Stop all containers                         |
| `docker-compose logs -f`                               | Follow container logs                       |
| `docker exec -it kt-jab-houy-app-catalog-service bash` | Access the catalog service shell            |
| `docker-compose down -v`                               | Remove containers and volumes (fresh start) |

---

## License

- This project is open for internal and educational use.
- Feel free to extend or integrate it in your own environment.
