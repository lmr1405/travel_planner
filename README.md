# Travel Planner

Travel Planner es una aplicación web para organizar viajes y preparar todo lo necesario antes de salir.

La idea es centralizar en un único sitio la información básica de cada viaje: destino, fechas, descripción, tareas previas y listas de preparación. De esta forma, la organización del viaje no depende de notas sueltas, capturas, correos o mensajes repartidos en distintas aplicaciones.

El proyecto está planteado como una aplicación full stack, con backend en Java Spring Boot, base de datos PostgreSQL y frontend web consumiendo una API REST.

## MVP

El MVP se centra en la organización básica de viajes.

La primera versión permitirá:

* Crear viajes con destino, fechas y descripción.
* Consultar el listado de viajes guardados.
* Ver el detalle de un viaje concreto.
* Editar la información básica de un viaje.
* Eliminar viajes.
* Añadir tareas previas asociadas a un viaje.
* Marcar tareas como completadas.
* Crear listas de preparación para cada viaje.
* Marcar elementos de la lista como preparados.

## Tecnologías

### Backend

* Java 17
* Spring Boot
* Maven
* Spring Web
* Spring Data JPA
* PostgreSQL
* Bean Validation

### Frontend

* HTML
* CSS
* JavaScript
* JSON

### Herramientas

* Eclipse
* PostgreSQL / pgAdmin
* Git

## Estructura del proyecto

```text
travel-planner/
│
├── backend/
│   ├── src/
│   ├── pom.xml
│   ├── mvnw
│   └── mvnw.cmd
│
├── frontend/
│	├── index.HTML
│   ├── style.css 
│   └── app.js
│
├── .gitignore
├── .gitattributes
└── README.md
```

## Desarrollo local

Para ejecutar el proyecto en local es necesario tener instalado:

* Java 17
* Maven
* PostgreSQL

La aplicación utiliza PostgreSQL como base de datos. Durante el desarrollo local se utiliza una base de datos llamada:

```text
travel_planner_db
```

## Ejecutar el backend

Desde la raíz del proyecto:

```bash
cd backend
mvn spring-boot:run
```

Por defecto, el backend se ejecuta en:

```text
http://localhost:8080
```

## Comprobación del backend

La API incluye un endpoint básico para comprobar que el backend responde correctamente:

```http
GET /api/health
```
