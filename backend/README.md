# Travel Planner - Backend

Backend de la aplicación Travel Planner, desarrollado con Spring Boot.

## Descripción

El backend proporciona una API REST para gestionar la información de los viajes.

Permite recibir peticiones desde el frontend, procesar la lógica de la aplicación y almacenar los datos en una base de datos PostgreSQL.

## Tecnologías

* Java
* Spring Boot
* Spring Web
* Spring Data JPA
* PostgreSQL
* Maven

## Instalación

Instalar las dependencias y compilar el proyecto:

```bash id="75tzxs"
mvn clean install
```

## Ejecución

Ejecutar la aplicación:

```bash id="olp1gs"
mvn spring-boot:run
```

El backend se ejecuta por defecto en:

```text id="nbtoed"
http://localhost:8080
```

## Base de datos

El proyecto utiliza PostgreSQL como base de datos.

La configuración de conexión se define en el archivo:

```text id="g91cgi"
src/main/resources/application.properties
```

## API REST

Endpoint principal de viajes:

```text id="f5uw65"
/api/trips
```

Ejemplos de operaciones:

```text id="ne84s8"
GET /api/trips
POST /api/trips
```

## Autor

Luis Menéndez Ramos
